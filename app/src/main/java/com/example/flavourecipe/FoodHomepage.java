package com.example.flavourecipe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class FoodHomepage extends Activity implements View.OnClickListener {
    private CardView RicePage, NoodlesPage, PastaPage, DessertsPage, FastFoodPage, ChickensPage;
//cardviews for each categories are created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodhomepage);
        RicePage = (CardView) findViewById(R.id.RicePage);
        NoodlesPage = (CardView) findViewById(R.id.NoodlesPage);
        PastaPage = (CardView) findViewById(R.id.PastaPage);
        DessertsPage = (CardView) findViewById(R.id.DessertsPage);
        FastFoodPage = (CardView) findViewById(R.id.FastFoodPage);
        ChickensPage = (CardView) findViewById(R.id.ChickensPage);

        RicePage.setOnClickListener((View.OnClickListener) this);
        NoodlesPage.setOnClickListener((View.OnClickListener) this);
        PastaPage.setOnClickListener((View.OnClickListener) this);
        DessertsPage.setOnClickListener((View.OnClickListener) this);
        FastFoodPage.setOnClickListener((View.OnClickListener) this);
        ChickensPage.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v){
        Intent i ;
        switch (v.getId()){ //cardview to new activity according to their respective categories
            case R.id.RicePage: i = new Intent(this,RicePage.class); startActivity(i); break;
            case R.id.NoodlesPage: i = new Intent(this,NoodlesPage.class); startActivity(i); break;
            case R.id.PastaPage: i = new Intent(this,PastaPage.class); startActivity(i); break;
            case R.id.DessertsPage: i = new Intent(this,DessertsPage.class); startActivity(i); break;
            case R.id.FastFoodPage: i = new Intent(this,FastFoodPage.class); startActivity(i); break;
            case R.id.ChickensPage: i = new Intent(this,ChickensPage.class); startActivity(i); break;
        }

    }
}