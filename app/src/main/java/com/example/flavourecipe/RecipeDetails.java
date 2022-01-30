package com.example.flavourecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

//function for recipe details
public class RecipeDetails extends AppCompatActivity {

    private TextView mtitleofrecipedetail,mcontentrecipedetail;
    FloatingActionButton mgotoeditrecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        //pass id from layout
        mtitleofrecipedetail=findViewById(R.id.titleofrecipedetail);
        mcontentrecipedetail=findViewById(R.id.contentofrecipedetail);
        mgotoeditrecipe=findViewById(R.id.gotoeditrecipe);
        Toolbar toolbar=findViewById(R.id.toolbarofrecipedetail);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent data=getIntent();

        //link a listener with the button in recipe details layout
        mgotoeditrecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),EditRecipe.class);
                intent.putExtra("title",data.getStringExtra("title"));
                intent.putExtra("content",data.getStringExtra("content"));
                intent.putExtra("recipeId",data.getStringExtra("recipeId"));
                view.getContext().startActivity(intent);
            }
        });

        mcontentrecipedetail.setText(data.getStringExtra("content"));
        mtitleofrecipedetail.setText(data.getStringExtra("title"));
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