package com.example.flavourecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//recipes for Pasta Category
public class PastaPage extends AppCompatActivity {

    //recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    //recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_page);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Bacon Pasta with Tomato Pasta Sauce","Ingredients\n\n" +
                "•\t160 g / 5 oz spaghetti or other long strand pasta of choice\n" +
                "•\t1 tsp olive oil (or butter)\n" +
                "•\t150 - 180 g / 5 - 6 oz bacon , diced\n" +
                "•\t1 garlic clove , minced\n" +
                "•\t1/2 onion , finely diced (brown, white, yellow)\n" +
                "•\t400 g / 14 oz canned crushed tomato\n" +
                "•\tSalt and pepper\n" +
                "•\tPinch of sugar , if needed (Note 1)\n" +
                "•\tExtra virgin olive oil\n" +
                "•\tFinely chopped parsley\n","Method",
                "1.\tHave the ingredients lined up and ready to start cooking at the same time.\n" +
                        "\n2.\tBring a large pot of water to the bowl. Add a pinch of salt.\n" +
                        "\n3.\tCook pasta according to packet but MINUS 2 minutes.\n" +
                        "\n4.\tMeanwhile, heat oil in a skillet over high heat.\n" +
                        "\n5.\tAdd bacon and cook for 1 minute, then add garlic and onion and cook for 3 minutes or until onion is translucent and bacon is golden.\n" +
                        "\n6.\tDrain excess fat if desired.\n" +
                        "\n7.\tScoop out a mug of pasta cooking water, then pour about 1/2 cup into the skillet.\n" +
                        "\n8.\tBring to simmer and stir, scraping the skillet to dissolve in all the golden bits stuck on the pan into the liquid.\n" +
                        "\n9.\tAdd tomato, bring to simmer and cook for 2 minutes, then turn down to medium high.\n" +
                        "\n10.\tDrain pasta, or if you timed it right, use tongs to transfer it straight from the pot into the skillet.\n" +
                        "\n11.\tToss gently using two wooden spoons for 2 minutes, or until the sauce is no longer sitting in the skillet, it's all on the pasta (see video).\n" +
                        "\n12.\tIf it gets too thick, just add an extra splash of the pasta cooking water.\n" +
                        "\n13.\tSeason with salt and pepper (remember bacon is salty!).\n" +
                        "\n14.\tServe immediately, garnished with parmesan, parsley and final drizzle of olive oil if desired.\n",R.drawable.p1));

        recipes1.add(new Recipes("Sausage Pasta","Ingredients\n\n" +
                "•\t250 g / 0.5 lb spiral pasta (Note 1)\n" +
                "•\t500 g / 1 lb good Italian sausages , or other quality sausages of choice\n" +
                "•\t1 tbsp olive oil\n" +
                "•\t1 small onion , finely chopped\n" +
                "•\t2 garlic cloves , minced\n" +
                "•\t800 g / 28 oz crushed tomato (or tomato passata)\n" +
                "•\t1 tsp chilli flakes / red pepper flakes (adjust to taste)\n" +
                "•\tSalt and pepper\n" +
                "•\t1 - 2 big handfuls baby spinach (optional)\n" +
                "•\tBasil leaves , finely sliced\n" +
                "•\tParmesan\n","Method",
                "1.\tBring a large pot of water to the boil. Cook pasta per packet directions minus 1 -2 minutes.\n" +
                        "\n2.\tJust before you drain, reserve 1 cup of pasta cooking water, then drain pasta.\n" +
                        "\n3.\tUse a sharp knife to cut sausages into chunks about 1.5cm/3/5\". \n" +
                        "\n4.\tIt will get a bit smeary and the chunks will be weird shapes - don't worry, it self fixes while cooking!\n" +
                        "\n5.\tHeat oil in a large skillet over high heat.\n" +
                        "\n6.\tAdd sausages and cook until quite browned on the outside, doesn't have to be cooked through inside.\n" +
                        "\n7.\tAdd onion and garlic, cook for 2 minutes until onion is translucent and sausages are very browned.\n" +
                        "\n8.\tAdd tomato, chilli flakes, pinch of salt and pepper. \n" +
                        "\n9.\tMix and turn heat down to medium. \n" +
                        "\n10.\tLets it bubble away energetically for 8 minutes or until it is quite thickened, stirring every now and then.\n" +
                        "\n11.\tAdd baby spinach (if using), pasta, and about 1/2 cup pasta cooking water.\n" +
                        "\n12.\tToss quickly, no longer than 1 minute (otherwise the pasta may start to break).\n" +
                        "\n13.\tRemove from stove, and serve immediately, garnished with plenty of basil and parmesan. \n",R.drawable.p2));


        recipes1.add(new Recipes("Creamy Garlic Prawn Pasta","Ingredients\n\n"  +
                "•\t8 oz / 250g fettuccine , or other long strand pasta of choice\n" +
                "•\t30 g / 2 tbsp butter , separated\n" +
                "•\t300 g / 10 oz small peeled prawns / shrimp, raw (Note 1)\n" +
                "•\t3 garlic cloves , minced\n" +
                "•\t1/4 cup / 65 ml dry white wine (Note 2 for sub)\n" +
                "•\t1 cup / 250 ml heavy / thickened cream (Note 3)\n" +
                "•\t1/2 cup / 125 ml chicken broth (or fish or vegetable broth), preferably low sodium\n" +
                "•\t3/4 cup / 50 g finely grated parmesan cheese (1.5 oz) (freshly grated) (Note 4)\n" +
                "•\t2 tbsp finely chopped parsley\n" +
                "•\tBlack pepper\n" +
                "•\tParmesan , for serving\n","Method",
                "1.\tBring to boil a large pot of water. \n" +
                        "\n2.\tAdd pasta and cook per packet minus 1 minute. \n" +
                        "\n3.\tJust before draining, scoop out 1 cup of pasta cooking water and set aside.\n" +
                        "\n4.\tDrain pasta.\n" +
                        "\n5.\tMeanwhile, melt 1 tbsp of butter in a large non-stick skillet over medium high heat. \n" +
                        "\n6.\tAdd prawns and cook for 1 1/2 minutes on each side until just cooked through. \n" +
                        "\n7.\tRemove prawns.\n" +
                        "\n8.\tIn the same skillet, add 1 tbsp butter. \n" +
                        "\n9.\tOnce melted, add garlic. Stir for 20 seconds until fragrant.\n" +
                        "\n10.\tAdd wine and stir. \n" +
                        "\n11.\tSimmer for 2 minutes until wine mostly reduces (see video).\n" +
                        "\n12.\tAdd cream, broth and parmesan. Stir until the parmesan is melted, then leave to simmer for 1 1/2 minutes until it thickens slightly (will thicken more in next step).\n" +
                        "\n13.\tAdd prawns, stir, then add pasta plus about 1/4 cup of reserved pasta water. \n" +
                        "\n14.\tToss pasta (still on stove) and the sauce will thicken in about 30 - 45 seconds and start clinging to the pasta.\n" +
                        "\n15.\tTake it off the stove before the sauce is as thick as you want - it will thicken more.\n" +
                        "\n16.\tSprinkle with most of the parsley and black pepper, check salt (I don't need more). \n" +
                        "\n17.\tToss again until the sauce consistency is to your taste. \n" +
                        "\n18.\tAdd a tiny splash of pasta water if it gets too gluggy.\n" +
                        "\n19.\tServe immediately, garnished with remaining parsley and parmesan if desired.\n",R.drawable.p3));


        recipes1.add(new Recipes("Vegetable Pasta","Ingredients\n\n"  +
                "•\t1 tbsp olive oil\n" +
                "•\t2 garlic cloves , minced\n" +
                "•\t1 onion , finely chopped\n" +
                "•\t2 zucchinis* , halved lengthwise and cut into sliced 0.8cm / 1/3\" slices\n" +
                "•\t1 red capsicum/bell pepper* , halved and sliced\n" +
                "•\t1 cup corn* (frozen or canned)\n" +
                "•\t1 broccoli* , broken into bite size florets\n" +
                "•\t250g/ 0.5lb ziti/penne , or other short pasta (Note 1)\n" +
                "•\t800 g / 28 oz crushed tomato\n" +
                "•\t1.5 cups / 375 ml vegetable or chicken broth\n" +
                "•\t2 tbsp tomato paste\n" +
                "•\t1 tbsp Italian herb mix (or other dried herbs)\n" +
                "•\t1 tsp garlic powder\n" +
                "•\t1/2 tsp red pepper flakes (chilli flakes, adjust spiciness to taste)\n" +
                "•\t1.5 tsp salt\n" +
                "•\t0.5 tsp black pepper\n" +
                "•\t1.5 cups shredded cheese of choice (Cheddar, tasty, Monterey Jack etc)(optional)\n" +
                "•\tFinely chopped parsley (optional)\n" +
                "•\tParmesan (if not using cheese)\n","Method",
                "1.\tHeat oil in a large pot over medium. Add garlic and onion - cook slowly for 3 to 4 minutes until onion is translucent and sweet.\n" +
                        "\n2.\tTurn heat up to medium high, add zucchini and capsicum. \n" +
                        "\n3.\tCook 1 1/2 minutes.\n" +
                        "\n4.\tAdd remaining ingredients except pasta and broccoli.\n" +
                        "\n5.\tStir until tomato paste dissolves.\n" +
                        "\n6.\tWhen liquid starts bubbling, lower heat to medium, add pasta and stir.\n" +
                        "\n7.\tTop with broccoli, push in.\n" +
                        "\n8.\tPlace lid on and cook for 5 minutes.\n" +
                        "\n9.\tRemove lid. Cook for another 3 to 4 minutes, stirring frequently, until pasta is almost cooked through and most of the liquid has been absorbed by the pasta.\n" +
                        "\n10.\tStir through half the cheese (if using). \n" +
                        "\n11.\tAdjust salt and pepper to taste.\n" +
                        "\n12.\tTop with remaining cheese, put lid on. \n" +
                        "\n13.\tLeave for 1 minute until cheese is melted and pasta is perfectly cooked.\n" +
                        "\n14.\tGarnish with parsley and serve immediately.\n" +
                        "\n15.\tDon't leave leftovers in the pot, residual heat will overcook the pasta so transfer into a serving dish.\n",R.drawable.p4));


        recipes1.add(new Recipes("Fettuccine Alfredo Pasta","Ingredients\n\n"  +
                "•\t8 oz / 250g dried fettuccine\n" +
                "•\t3 tbsp unsalted butter\n" +
                "•\t1 small shallot , very finely minced (eschallot in Australia) (Note 1)\n" +
                "•\t1/2 cup heavy cream (Note 2)\n" +
                "•\t3/4 cup freshly grated Parmigiano Reggiano or parmesan (Notes 3 and 4)\n" +
                "•\t1/4 tsp salt\n" +
                "•\tGood grind of black pepper\n" +
                "•\tFresh parsley (optional)\n" +
                "•\tExtra Parmigiano Reggiano\n","Method",
                "1.\tBring a large pot of salted water to boil. \n" +
                        "\n2.\tAdd the fettuccine and cook until al dente (still firm but just cooked through). \n" +
                        "\n3.\tMeanwhile, melt the butter in a deep fry pan over medium high heat.\n" +
                        "\n4.\tAdd the shallots and sauté for 2 minutes or until tender.\n" +
                        "\n5.\tAdd the cream and bring to boil. Turn heat down to medium low and simmer for 3 minutes.\n" +
                        "\n6.\tRemove the fry pan from the heat and stir through the Parmigiano Reggiano, salt and pepper until the sauce is smooth.\n" +
                        "\n7.\tTake out 1/4 cup of pasta water plus scoop out an extra mug (extra, just in case). \n" +
                        "\n8.\tThen drain the pasta in a colander.\n" +
                        "\n9.\tTransfer the pasta and 1/4 cup of reserved pasta water into the fry pan with the sauce.\n" +
                        "\n10.\tReturn the fry pan to the stove over medium high heat. \n" +
                        "\n11.\tToss very gently to coat the pasta in the sauce and allow the sauce to emulsify for 1 minute. \n" +
                        "\n12.\tRemove from the stove and serve immediately, garnished with extra Parmigiano Reggiano and fresh parsley, if using. \n",R.drawable.p5));


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
