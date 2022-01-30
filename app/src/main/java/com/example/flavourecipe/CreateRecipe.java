package com.example.flavourecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

//function to create recipe
public class CreateRecipe extends AppCompatActivity {

    //declaration of variables
    EditText mcreatetitlerecipe, mcreatecontentrecipe;
    FloatingActionButton msaverecipe;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    FirebaseFirestore firebaseFirestore;

    ProgressBar mprogressbarcreaterecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);

        //pass id from layout
        msaverecipe=findViewById(R.id.saverecipe);
        mcreatecontentrecipe=findViewById(R.id.createcontentrecipe);
        mcreatetitlerecipe=findViewById(R.id.createtitlerecipe);

        mprogressbarcreaterecipe=findViewById(R.id.progressbarcreaterecipe);
        Toolbar toolbar=findViewById(R.id.toolbarofcreaterecipe);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth=FirebaseAuth.getInstance();
        firebaseFirestore=FirebaseFirestore.getInstance();
        firebaseUser=FirebaseAuth.getInstance().getCurrentUser();

        //link a listener with the save button in create recipe layout
        msaverecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = mcreatetitlerecipe.getText().toString();
                String content = mcreatecontentrecipe.getText().toString();
                if(title.isEmpty() || content.isEmpty())    //if either title or content is empty
                {
                    Toast.makeText(getApplicationContext(),"Both field are required",Toast.LENGTH_SHORT).show();
                }
                else    //if user input both recipe title and content
                {
                    mprogressbarcreaterecipe.setVisibility(view.VISIBLE);

                    //store recipe in Firestore
                    DocumentReference documentReference=firebaseFirestore.collection("recipes").document(firebaseUser.getUid()).collection("myRecipes").document();
                    Map<String, Object> recipe = new HashMap<>();
                    recipe.put("title",title);
                    recipe.put("content",content);

                    documentReference.set(recipe).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {    //if recipe is created successfully
                            Toast.makeText(getApplicationContext(),"Recipe created successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(CreateRecipe.this,RecipeActivity.class));
                        }
                    }).addOnFailureListener(new OnFailureListener() {   //if fail to create recipe
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Failed to create recipe",Toast.LENGTH_SHORT).show();
                            mprogressbarcreaterecipe.setVisibility(View.INVISIBLE);
                        }
                    });


                }
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}