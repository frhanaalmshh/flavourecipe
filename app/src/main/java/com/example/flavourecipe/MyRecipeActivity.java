package com.example.flavourecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.api.Distribution;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//function for MyRecipe Activity (create and store recipes)
public class MyRecipeActivity extends AppCompatActivity {

    //declaration of variables
    FloatingActionButton mcreaterecipefab;
    private FirebaseAuth firebaseAuth;

    RecyclerView mrecyclerview;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    FirebaseUser firebaseUser;
    FirebaseFirestore firebaseFirestore;

    FirestoreRecyclerAdapter<firebasemodel,RecipeViewHolder> recipeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);

        //pass id of createrecipefab from its layout
        mcreaterecipefab=findViewById(R.id.createrecipefab);
        firebaseAuth=FirebaseAuth.getInstance();

        firebaseUser= FirebaseAuth.getInstance().getCurrentUser();
        firebaseFirestore=FirebaseFirestore.getInstance();

        //set title to My Recipes
        getSupportActionBar().setTitle("My Recipes");

        //link a listener with the add button in MyRecipe layout
        mcreaterecipefab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MyRecipeActivity.this,CreateRecipe.class));

            }
        });

        //to extract data from firestore
        Query query=firebaseFirestore.collection("recipes").document(firebaseUser.getUid()).collection("myRecipes").orderBy("title",Query.Direction.ASCENDING);

        FirestoreRecyclerOptions<firebasemodel> alluserrecipes = new FirestoreRecyclerOptions.Builder<firebasemodel>().setQuery(query,firebasemodel.class).build();

        recipeAdapter = new FirestoreRecyclerAdapter<firebasemodel, RecipeViewHolder>(alluserrecipes) {
            @Override
            protected void onBindViewHolder(@NonNull RecipeViewHolder recipeViewHolder, int i, @NonNull firebasemodel firebasemodel) {

                ImageView popupbutton = recipeViewHolder.itemView.findViewById(R.id.menupopbutton);

                int colorcode=getRandomColor();
                recipeViewHolder.mrecipe.setBackgroundColor(recipeViewHolder.itemView.getResources().getColor(colorcode,null));

                recipeViewHolder.recipetitle.setText(firebasemodel.getTitle());
                recipeViewHolder.recipecontent.setText(firebasemodel.getContent());

                String docId = recipeAdapter.getSnapshots().getSnapshot(i).getId();

                recipeViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //we have to open recipe detail activity

                        Intent intent = new Intent(view.getContext(),EditRecipe.class);
                        intent.putExtra("title",firebasemodel.getTitle());
                        intent.putExtra("content",firebasemodel.getContent());
                        intent.putExtra("recipeId",docId);

                        view.getContext().startActivity(intent);

                        //Toast.makeText(getApplicationContext(),"This is clicked",Toast.LENGTH_SHORT).show();
                    }
                });


                popupbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        PopupMenu popupMenu = new PopupMenu(view.getContext(),view);
                        popupMenu.setGravity(Gravity.END);
                        popupMenu.getMenu().add("Edit").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {

                                Intent intent = new Intent(view.getContext(),EditRecipe.class);
                                intent.putExtra("title",firebasemodel.getTitle());
                                intent.putExtra("content",firebasemodel.getContent());
                                intent.putExtra("recipeId",docId);

                                view.getContext().startActivity(intent);
                                return false;
                            }
                        });

                        popupMenu.getMenu().add("Delete").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {

                                //Toast.makeText(view.getContext(),"This recipe is deleted",Toast.LENGTH_SHORT).show();

                                DocumentReference documentReference = firebaseFirestore.collection("recipes").document(firebaseUser.getUid()).collection("myRecipes").document(docId);
                                documentReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void unused) {
                                        Toast.makeText(view.getContext(),"This recipe is deleted",Toast.LENGTH_SHORT).show();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(view.getContext(),"Failed to delete",Toast.LENGTH_SHORT).show();
                                    }
                                });

                                return false;
                            }
                        });

                        popupMenu.show();

                    }
                });

            }

            @NonNull
            @Override
            public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipes_layout,parent,false);
                return new RecipeViewHolder(view);
            }
        };


        mrecyclerview = findViewById(R.id.recyclerview);
        mrecyclerview.setHasFixedSize(true);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mrecyclerview.setLayoutManager(staggeredGridLayoutManager);
        mrecyclerview.setAdapter(recipeAdapter);


    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder
    {
        private TextView recipetitle;
        private TextView recipecontent;
        LinearLayout mrecipe;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            recipetitle=itemView.findViewById(R.id.recipetitle);
            recipecontent=itemView.findViewById(R.id.recipecontent);
            mrecipe=itemView.findViewById(R.id.recipe);

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.logout:
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(MyRecipeActivity.this,MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        recipeAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(recipeAdapter!=null)
        {
            recipeAdapter.stopListening();
        }
    }

    private int getRandomColor()
    {
        List<Integer> colorcode=new ArrayList<>();
        colorcode.add(R.color.blue);
        colorcode.add(R.color.nude);
        colorcode.add(R.color.orange);
        colorcode.add(R.color.purple);
        colorcode.add(R.color.pink);
        colorcode.add(R.color.mint);
        colorcode.add(R.color.lilac);
        colorcode.add(R.color.peach);

        Random random = new Random();
        int number = random.nextInt(colorcode.size());
        return colorcode.get(number);
    }


}