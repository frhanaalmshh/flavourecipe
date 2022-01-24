package com.example.flavourecipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PageNavigation extends AppCompatActivity implements View.OnClickListener{

    private CardView MyRecipes, RecipeRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_navigation);

        MyRecipes = (CardView) findViewById(R.id.cardview_myrecipes);
        RecipeRec = (CardView) findViewById(R.id.cardview_recipesrec);

        MyRecipes.setOnClickListener((View.OnClickListener) this);
        RecipeRec.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.cardview_myrecipes:
                i = new Intent(this, MyRecipeActivity.class);
                startActivity(i);
                break;
            case R.id.cardview_recipesrec:
                i = new Intent(this, FoodHomepage.class);
                startActivity(i);
                break;

        }

    }

}