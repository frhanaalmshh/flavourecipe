package com.example.flavourecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

//function to edit recipe
public class EditRecipe extends AppCompatActivity {

    //declaration of variables
    Intent data;
    EditText medittitleofrecipe,meditcontentrecipe;
    FloatingActionButton msaveeditrecipe;

    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;
    FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_recipe);

        //pass id from layout
        medittitleofrecipe=findViewById(R.id.edittitlerecipe);
        meditcontentrecipe=findViewById(R.id.editcontentrecipe);
        msaveeditrecipe=findViewById(R.id.saveeditrecipe);

        data=getIntent();

        firebaseFirestore=FirebaseFirestore.getInstance();
        firebaseUser=FirebaseAuth.getInstance().getCurrentUser();


        Toolbar toolbar = findViewById(R.id.toolbarofeditrecipe);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //link a listener with the edit button in edit recipe layout
        msaveeditrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"save button clicked",Toast.LENGTH_SHORT).show();

                String newtitle = medittitleofrecipe.getText().toString();
                String newcontent = meditcontentrecipe.getText().toString();

                if(newtitle.isEmpty()||newcontent.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Something is empty",Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    DocumentReference documentReference = firebaseFirestore.collection("recipes").document(firebaseUser.getUid()).collection("myRecipes").document(data.getStringExtra("recipeId"));
                    Map<String,Object> recipe = new HashMap<>();
                    recipe.put("title",newtitle);
                    recipe.put("content",newcontent);
                    documentReference.set(recipe).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(getApplicationContext(),"Recipe is updated",Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(EditRecipe.this,RecipeActivity.class));
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Failed to update",Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });


        String recipetitle = data.getStringExtra("title");
        String recipecontent = data.getStringExtra("content");
        medittitleofrecipe.setText(recipetitle);
        meditcontentrecipe.setText(recipecontent);

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