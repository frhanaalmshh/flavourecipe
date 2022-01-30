package com.example.flavourecipe;

import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
//recipes for Chicken Category
public class ChickensPage extends AppCompatActivity {
//recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

//recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chickens_page);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Cosmopolitan","Ingredients\n\n" +
                "•\t2 red onions, sliced\n" +
                "•\t1 large orange, sliced\n" +
                "•\t4 rosemary sprigs, plus extra to serve\n" +
                "•\tA few thyme sprigs\n" +
                "•\t6 large free-range chicken thighs, skin-on and bone-in\n" +
                "•\t4 tbsp cranberry sauce, plus a handful fresh cranberries if you have some\n" +
                "•\t2 tbsp balsamic vinegar\n" +
                "•\t100ml vodka (or use gin)\n","Method",
                "1.\tHeat the oven to 180°C/gas 6. Arrange the onions and orange slices in a deep sided roasting tin, scatter over the herbs, then nestle the chicken thighs on top. Season, spoon over the cranberry sauce/berries and balsamic, then cover and roast for 25 minutes.\n" +
                        "\n2.\tAdd the vodka, then roast for 25 minutes more until the chicken is cooked through. Sprinkle with extra rosemary to serve.\n",R.drawable.c1));

        recipes1.add(new Recipes("Wun’s Kung Pao Chicken","Ingredients\n\n" +
                "•\t500g skin-on free-range chicken thighs, boned\n" +
                "•\t5 tbsp cornflour\n" +
                "•\t5 tbsp tapioca flour (see Know How)\n" +
                "•\t1 litre vegetable oil for frying\n" +
                "•\tToasted sesame seeds to serve\n" +
                "\nFor the marinade\n\n" +
                "•\t1 tsp chilli flakes\n" +
                "•\tGrated zest and juice 1 orange\n" +
                "•\t40ml soy sauce\n" +
                "•\t2cm fresh ginger, chopped\n" +
                "•\t¾ tsp chinese five-spice powder\n" +
                "•\t½ tsp 13-spice mix (see Easy Swaps)\n" +
                "•\t1 tsp salt\n" +
                "•\t150ml sunflower oil\n" +
                "•\t250ml buttermilk (see Easy Swaps)\n" +
                "•\t1 tbsp shaoxing rice wine\n" +
                "\nFor the kung pao sauce\n\n" +
                "•\t2½ tsp sichuan peppercorns\n" +
                "•\t110g doubanjiang (see Know How)\n" +
                "•\t65ml black rice vinegar (or use regular rice wine vinegar)\n" +
                "•\t1 tbsp light soy sauce\n" +
                "•\t140g honey\n" +
                "•\t175g salted butter\n" +
                "•\t160g natural yogurt\n","Method",
                "1.\tPut the marinade ingredients and 75ml water in a food processor or spice grinder and whizz until smooth (or pound together in a pestle and mortar).\n" +
                        "\n2.\tCut each chicken thigh into 4-6 pieces and put in a bowl. Add the marinade, toss to coat, then set aside for at least 20 minutes (see Make Ahead).\n" +
                        "\n3.\tFor the kung pao sauce, whizz the sichuan peppercorns in a spice grinder (or pound in a pestle and mortar), then tip into a pan with the doubanjiang, black rice vinegar, soy sauce, honey and 100ml water. Add the butter, then put the pan over a medium heat to warm through and melt the butter – you don’t want it to boil. Mix in the yogurt, then keep warm until ready to serve.\n" +
                        "\n4.\tHeat a large deep pan with the vegetable oil (no more than two-thirds full) until it reads 180°C on a probe thermometer (or a cube of bread turns brown in 15 20 seconds).\n" +
                        "\n5.\tMeanwhile, mix the cornflour and tapioca flour in a large bowl. Add the marinated chicken and use your hands to make sure each piece is well coated. The coating may look uneven, but this will create delicious crispy bits. Working in batches, use tongs to lower the chicken into the hot oil and fry until the pieces are crisp, lightly golden and cooked all the way through (about 3-4 minutes).\n" +
                        "\n.\tDrain the fried chicken, then add to a bowl, toss with a few spoonfuls of the kung pao sauce and sprinkle with sesame seeds – enjoy!\n",R.drawable.c2));

        recipes1.add(new Recipes("Five-spice Chicken Schnitzel","Ingredients\n\n"  +
                "•\t4 small free-range chicken breasts\n" +
                "•\t75g plain flour\n" +
                "•\t3 tsp chinese five-spice powder\n" +
                "•\t2 medium free-range eggs\n" +
                "•\t120g panko breadcrumbs\n" +
                "•\t4½ tbsp oil for frying\n" +
                "•\t1 fennel bulb, thinly sliced\n" +
                "•\t2 heads pak choi, thick stalks and larger leaves chopped\n" +
                "•\tJuice ½ lemon, plus extra wedges to serve\n" +
                "•\tJuice 1 lime (or use more lemon juice)\n" +
                "•\t1-2 tsp sesame oil\n" +
                "•\t3 spring onions, thinly sliced\n","Method",
                "1.\tBash the chicken breasts with a meat tenderiser or rolling pin until about 6mm thick.\n" +
                        "\n2.\tMix the flour, 2 tsp five-spice and some salt and pepper in a wide shallow bowl. Beat the eggs in a second bowl, then mix the breadcrumbs and the 1 tsp remaining five-spice in a third bowl. Coat the chicken in the flour mix, then the egg and finally the breadcrumbs.\n" +
                        "\n3.\tHeat 2 tbsp of the oil in a large frying pan over a low-medium heat. Add 2 schnitzels and fry for 5-8 minutes on each side until golden and cooked through. Set aside and keep warm. Repeat with the remaining schnitzels, using more oil as needed.\n" +
                        "\n4.\tIn a separate frying pan, heat ½ tbsp of the remaining oil over a medium heat. Add the fennel with some salt and pepper, then cook for 8 minutes until starting to turn golden. Turn the heat up to medium-high, add the pak choi stalks and stir-fry for 2 minutes, then add the pak choi leaves and lemon/lime juices. Stir well for 1 minute, then take the pan off the heat. Add the sesame oil and spring onions and mix well, adding more salt and pepper to taste. Serve the chicken and greens with extra lemon wedges.\n",R.drawable.c3));

        recipes1.add(new Recipes("Sticky Buffalo Wings with Blue Cheese Sauce","Ingredients\n\n"  +
                "•\t3 tbsp plain flour\n" +
                "•\t2 tsp garlic powder\n" +
                "•\t1-2 tsp cayenne pepper (depending on how hot you like it)\n" +
                "•\t1 tsp smoked paprika\n" +
                "•\t1.5kg free-range chicken wings (kept whole or separated into wing and drumette)\n" +
                "•\tFor the buffalo sauce\n" +
                "•\t120ml hot sauce (we used Frank’s)\n" +
                "•\t100g salted butter\n" +
                "•\t50g soft brown sugar\n" +
                "•\t3 tbsp runny honey\n" +
                "•\t1 tbsp white wine vinegar\n" +
                "•\tFor the blue cheese sauce\n" +
                "•\t40g salted butter\n" +
                "•\t2 tbsp plain flour\n" +
                "•\t150ml whole milk\n" +
                "•\t150g blue cheese, such as stilton\n" +
                "•\t100ml soured cream\n","Method",
                "1.\tMix the flour, garlic powder, cayenne pepper, paprika and a large pinch of salt in a large bowl. Add the chicken and toss to coat, then cover and chill for 30 minutes.\n" +
                        "\n2.\tFor the buffalo sauce, mix all the ingredients in a small pan over a medium heat, stirring often, until smooth. Bring to a simmer, then set aside to cool.\n" +
                        "\n3.\tFor the blue cheese sauce, melt the butter in a medium pan, then add the flour and cook, stirring, for 1 minute. Add the milk gradually, stirring, until smooth and thickened. Bring to a simmer, stirring, then remove from the heat and crumble in the cheese. Stir until smooth. Stir in the soured cream, then season to taste and leave to cool.\n" +
                        "\n4.\tLight the barbecue so the coals are glowing (and not directly under\n" +
                        "the food) or the gas is on medium. Cook the wings for 10-15 minutes with the lid closed, turning from time to time. Transfer the wings to a large bowl and toss with the buffalo sauce, then return to the barbecue and cook for 10-15 minutes more, turning and basting with leftover buffalo sauce, until\n" +
                        "charred and cooked through.\n" +
                        "\n5.\tServe the wings hot, with the cheese sauce and an apple and celery salad, if you like.\n",R.drawable.c4));

        recipes1.add(new Recipes("Masala Chicken (Masala Murg)","Ingredients\n\n"  +
                "•\t50g gram flour (also known as besan/chickpea flour)\n" +
                "•\t70ml natural yogurt\n" +
                "•\t½ tsp black salt (kala namak)\n" +
                "•\t1 tsp kashmiri chilli powder (or regular chilli powder to taste)\n" +
                "•\t1 tsp kasuri methi (dried fenugreek leaves)\n" +
                "•\t½ tsp garam masala\n" +
                "•\t½ tsp ground cumin\n" +
                "•\t4 boneless, skinless free-range chicken thighs, cut into 5cm pieces\n" +
                "•\t3 tbsp sunflower oil\n","Method",
                "\n1.\tHeat a frying pan, add the flour and toast over a low heat for about 2 minutes or until it starts to change colour, stirring constantly.\n" +
                        "\n2.\tPut the toasted flour in a bowl with the yogurt, salt and spices and mix well. Add the chicken and turn in the mixture to coat well (see Make Ahead).\n" +
                        "\n3.\tHeat the oil in a pan. Carefully add the coated chicken pieces to the hot oil and cook over a medium to low heat for 8-10 minutes, turning halfway through, until golden and cooked through.\n",R.drawable.c5));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}

