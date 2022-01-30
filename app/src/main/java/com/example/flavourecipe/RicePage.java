package com.example.flavourecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//recipes for Rice Category
public class RicePage extends AppCompatActivity {

    //recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    //recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_page);


        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Herb Lemon Rice","Ingredients\n\n" +
                "•\t0.25 cup basmati rice (rinsed)\n" +
                "•\t0.25 tablespoon coconut oil (refined recommended)\n" +
                "•\t0.06 teaspoon salt\n" +
                "•\tzest of ½ a lemon\n" +
                "•\t0.25 teaspoon dried basil\n" +
                "•\t0.25 teaspoon dried oregano\n" +
                "•\t0.5 cups stock chicken or vegetable\n" +
                "•\tjuice of half a lemon\n","Method",
                "1.\tRinse rice in a colander under the tap, or cover with water in the pot, swirl, and carefully decant the water, repeating until water runs clear.\n" +
                        "\n2.\tCombine all ingredients not labelled 'after cooking' in a pot or a rice cooker. Make sure the rice is submerged in water and not sticking to the sides of the pot or rice cooker.\n" +
                        "\n3.\tBring to a boil, reduce the heat and simmer (covered) for 15 minutes. Remove from heat and let stand (covered) for another 10 minutes before fluffing with a fork.\n",R.drawable.r1));

        recipes1.add(new Recipes("Coconut Rice ","Ingredients\n\n" +
                "•\t0.38 cups basmati rice rinsed\n" +
                "•\t3.38 oz coconut milk 1 can; 400 mL\n" +
                "•\t0.25 tablespoon coconut sugar or brown sugar\n" +
                "•\t0.13 teaspoon salt\n" +
                "•\t0.56 cups water\n","Method",
                "1.\tRinse rice in a colander under the tap, or cover with water in the pot, swirl, and carefully decant the water, repeating until water runs clear.\n" +
                        "\n2.\tCombine all ingredients not labelled 'after cooking' in a pot or a rice cooker. Make sure the rice is submerged in water and not sticking to the sides of the pot or rice cooker.\n" +
                        "\n3.\tBring to a boil, reduce the heat and simmer (covered) for 15 minutes. Remove from heat and let stand (covered) for another 10 minutes before fluffing with a fork.\n",R.drawable.r2));


        recipes1.add(new Recipes("Turmeric Yellow Rice","Ingredients\n\n"  +
                "•\t0.25 cup basmati rice rinsed\n" +
                "•\t0.25 tablespoon coconut oil refined recommended\n" +
                "•\t0.13 teaspoon turmeric\n" +
                "•\t0.06 teaspoon ground ginger\n" +
                "•\t0.06 teaspoon salt\n" +
                "•\t0.13 teaspoon onion powder\n" +
                "•\t0.13 teaspoon garlic powder\n" +
                "•\t0.5 cups stock veggie or chicken\n","Method",
                "1.\tRinse rice in a colander under the tap, or cover with water in the pot, swirl, and carefully decant the water, repeating until water runs clear.\n" +
                        "\n2.\tCombine all ingredients not labelled 'after cooking' in a pot or a rice cooker. Make sure the rice is submerged in water and not sticking to the sides of the pot or rice cooker.\n" +
                        "\n3.\tBring to a boil, reduce the heat and simmer (covered) for 15 minutes. Remove from heat and let stand (covered) for another 10 minutes before fluffing with a fork.\n",R.drawable.r3));


        recipes1.add(new Recipes("Saffron Rice","Ingredients\n\n"  +
                "•\t0.06 cup boiling water\n" +
                "•\tpinch saffron threads note 1; roughly ⅛ teaspoon\n" +
                "•\t0.25 cup basmati rice rinsed\n" +
                "•\t0.25 tablespoon coconut oil refined recommended\n" +
                "•\t0.13 teaspoon onion powder\n" +
                "•\t0.06 teaspoon salt\n" +
                "•\t0.25 ¾ cup stock veggie or chicken\n","Method",
                "1.\tRinse rice in a colander under the tap, or cover with water in the pot, swirl, and carefully decant the water, repeating until water runs clear.\n" +
                        "\n2.\tCombine all ingredients not labelled 'after cooking' in a pot or a rice cooker. Make sure the rice is submerged in water and not sticking to the sides of the pot or rice cooker.\n" +
                        "\n3.\tBring to a boil, reduce the heat and simmer (covered) for 15 minutes. Remove from heat and let stand (covered) for another 10 minutes before fluffing with a fork.\n",R.drawable.r4));


        recipes1.add(new Recipes("Inspired Mexican Rice","Ingredients\n\n"  +
                "•\t0.25 cup basmati rice rinsed\n" +
                "•\t0.25 tablespoon coconut oil refined recommended\n" +
                "•\t0.25 cup salsa\n" +
                "•\t0.13 teaspoon ground cumin\n" +
                "•\t0.06 teaspoon chipotle chili powder regular chili powder works, too\n" +
                "•\t0.06 teaspoon salt\n" +
                "•\t0.5 cups stock veggie or chicken\n","Method",
                "1.\tRinse rice in a colander under the tap, or cover with water in the pot, swirl, and carefully decant the water, repeating until water runs clear.\n" +
                        "\n2.\tCombine all ingredients not labelled 'after cooking' in a pot or a rice cooker. Make sure the rice is submerged in water and not sticking to the sides of the pot or rice cooker.\n" +
                        "\n3.\tBring to a boil, reduce the heat and simmer (covered) for 15 minutes. Remove from heat and let stand (covered) for another 10 minutes before fluffing with a fork.\n",R.drawable.r5));


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
