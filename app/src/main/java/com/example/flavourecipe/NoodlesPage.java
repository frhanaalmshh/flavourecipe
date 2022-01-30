package com.example.flavourecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//recipes for Noodles Category
public class NoodlesPage extends AppCompatActivity {

    //recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    //recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noodles_page);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Shanghai Style Fried Noodle","Ingredients\n\n" +
                "•\t1 tablespoon vegetable oil\n" +
                "•\t100 grams chicken breast (about half a breast), sliced into small narrow strips\n" +
                "•\t1 tablespoon Chinese cooking wine\n" +
                "•\t300 grams Shanghai chao mian noodles, soaked in warm water for 5 minutes and drained\n" +
                "•\t3 brown mushrooms, sliced\n" +
                "•\t½ tablespoon sesame oil\n" +
                "•\t1 tablespoon soy sauce\n" +
                "•\t½ tablespoon dark soy sauce\n" +
                "•\t1 teaspoon brown sugar\n" +
                "•\t1 teaspoon white pepper powder\n" +
                "•\t1 large bunch bok choy, base trimmed and discarded\n","Method",
                "1.\tHeat oil in large pan over high heat. \n" +
                        "\n2.\tAdd chicken and cook for 2-3 minutes, until it changes colour. \n" +
                        "\n3.\tThen, add cooking wine and turn the heat down to medium-low.\n" +
                        "\n4.\tBreak the soaked noodles apart with your hands and add them to the pan, along with mushrooms and sesame oil and stir-fry together for 3 minutes, until mushroom is soft and translucent.\n" +
                        "\n5.\tAdd soy sauce, dark soy sauce, brown sugar, and white pepper.\n" +
                        "\n6.\tStir for 1 minute.\n" +
                        "\n7.\tAdd bok choy and turn the heat up to medium. \n" +
                        "\n8.\tCook until bok choy gets medium soft, about 1-2 minutes. \n" +
                        "\n9.\tDo not overcook as you want the bok choy to still be firm and not soggy. \n" +
                        "\n10.\tIf the sauce is getting too dry, add a tablespoon of water.\n" +
                        "\n11.\tServe hot.\n",R.drawable.n1));

        recipes1.add(new Recipes("Boat Noodle Stir Fry","Ingredients\n\n" +
                "\n" +
                "•\t8 ounces dried wide egg noodles (about 2.5 cups)\n" +
                "•\t1 tablespoon vegetable oil\n" +
                "•\t8 ounces beef flank steak or top sirloin (or leftover roast beef), sliced into bite size strips\n" +
                "•\t1 small onion, sliced\n" +
                "•\t1 medium carrot, thinly sliced\n" +
                "•\t1 cup brown mushrooms, sliced\n" +
                "•\t1 cup Chinese cabbage, sliced\n" +
                "•\t1 cup spinach\n" +
                "•\t2 tablespoons soy sauce\n" +
                "•\t2 tablespoon oyster sauce or hoisin sauce\n" +
                "•\t1 teaspoon rice vinegar or mirin (optional)\n" +
                "•\t1 teaspoon sesame oil\n" +
                "•\t½ teaspoon ground cumin\n" +
                "•\t¼ teaspoon ground black pepper or white pepper\n","Method",
                "1.\tBring a large cooking pot of water to a boil over medium-high heat.\n" +
                        "\n2.\tAdd egg noodles and a little bit of salt and cook according to package directions, about 6 minutes.\n" +
                        "\n3.\tDrain well and set aside.\n" +
                        "\n4.\tHeat oil in a large wok or pan over high heat until sizzling hot, about 1 minute.\n" +
                        "\n5.\tAdd beef and sauté until browned on all sides, about 3-4 minutes.\n" +
                        "\n6.\tIf using leftover roast beef, add it in and cook for 1-2 minutes instead, until starting to warm.\n" +
                        "\n7.\tAdd onion, carrot, mushrooms, cabbage, and spinach. Stir well and cook until tender, about 3-4 minutes.\n" +
                        "\n8.\tStir in noodles and add all the sauce ingredients (soy sauce, oyster sauce, rice vinegar, sesame oil, cumin, and pepper).\n" +
                        "\n9.\tToss well and cook for another 2-3 minutes until evenly coated.\n" +
                        "\n10.\tGarnish with white sesame seeds and serve immediately.\n",R.drawable.n2));


        recipes1.add(new Recipes("Slow Cooker Beef Stew Ramen","Ingredients\n\n"  +
                "•\t1 pound stew meat, cut into 1-inch cubes\n" +
                "•\t1 large red potato, cut into 1-inch cubes\n" +
                "•\t2 carrots, sliced\n" +
                "•\t½ onion, diced\n" +
                "•\t2 cloves garlic, minced\n" +
                "•\t1 (14-ounce) can crushed tomatoes\n" +
                "•\t1 cup beef or chicken broth\n" +
                "•\t½ tablespoon soy sauce\n" +
                "•\t½ teaspoon dried thyme\n" +
                "•\t½ teaspoon dried rosemary\n" +
                "•\tsalt and ground black pepper, to taste\n" +
                "•\t6 ounces ramen noodles\n" +
                "•\t1 cup green beans\n" +
                "•\thot sauce (optional, for serving)\n","Method",
                "1.\tAdd beef, potatoes, carrots, onions, garlic, crushed tomatoes, broth, soy sauce, thyme, and rosemary into the slow cooker.\n" +
                        "\n2.\tSeason with salt and pepper, to taste. Stir until combined.\n" +
                        "\n3.\tCover and cook on low for 7-8 hours or on high for 3-4 hours.\n" +
                        "\n4.\tIn a separate pot, cook the ramen noodles.\n" +
                        "\n5.\tLadle the stew into bowls.\n" +
                        "\n6.\tPlace ramen noodles into the bowls and garnish with beef and green beans.\n" +
                        "\n7.\tAdd a dash of hot sauce or extra soy sauce sauce, if necessary (optional).\n" +
                        "\n8.\tServe immediately.\n",R.drawable.n3));


        recipes1.add(new Recipes("Vietnamese Noodle Bowl with Chicken","Ingredients\n\n"  +
                "•\t½ tablespoon vegetable oil\n" +
                "•\t1 tablespoon soy sauce\n" +
                "•\t½ tablespoon fish sauce\n" +
                "•\t½ tablespoon sesame oil\n" +
                "•\t½ tablespoon brown sugar or honey\n" +
                "•\t1-2 cloves garlic\n" +
                "•\t1 stalk lemongrass, cut into 3-inch pieces\n" +
                "•\t½ small onion\n" +
                "•\t1 lb. boneless and skinless chicken breast or thighs, cut into 1.5-inch thick cubes\n" +
                "•\t8 oz. dried vermicelli noodles \n" +
                "•\t1 medium cucumber, julienned\n" +
                "•\t2 medium carrots, julienned\n" +
                "•\t¼ cup fresh cilantro, coarsely chopped\n" +
                "•\t1 tablespoon roasted peanuts\n" +
                "•\t1 lime, wedged (for serving)\n" +
                "•\t2 tablespoons fish sauce\n" +
                "•\t2 tablespoons rice vinegar\n" +
                "•\t¼ cup water\n" +
                "•\t1 teaspoon sesame oil\n" +
                "•\t1 tablespoon granulated sugar\n" +
                "•\t¼ teaspoon ground black pepper or white pepper\n" +
                "•\t½ teaspoon red chili, finely chopped (or to taste)\n","Method",
                "1.\tFirstly, to make the make the lemongrass chicken, in a blender or food processor, add all chicken marinade ingredients (vegetable oil, soy sauce, fish sauce, sesame oil, brown sugar, garlic, lemongrass, and onion) and mix for 1 minute until smooth.\n" +
                        "\n2.\tPlace cubed chicken into a large mixing bowl and pour the marinade on top. \n" +
                        "\n3.\tToss well to coat.\n" +
                        "\n4.\tCover and refrigerate for at least 1 hour (or overnight for the best results). \n" +
                        "\n5.\tYou can also store the marinated chicken in a sealable ziploc bag.\n" +
                        "\n6.\tYou can grill, bake, or air fry the chicken skewers.\n" +
                        "\n7.\tTo grill the skewers, thread 4-5 pieces of cubed chicken onto bamboo skewers.\n" +
                        "\n8.\tLightly apply cooking oil over chicken skewers using a cooking oil spray or silicone brush.\n" +
                        "\n9.\tPreheat the grill over medium-high heat for 3 minutes until sizzling hot.\n" +
                        "\n10.\tPlace the skewers evenly apart on the grill pan and grill for 8-10 minutes on each side, or until the internal temperature of the chicken reaches 165 F.\n" +
                        "\n11.\tDo not overlap the skewers at any time to ensure even cooking for all the skewers. \n" +
                        "\n12.\tTo bake the skewers, preheat the oven to 425 F.\n" +
                        "\n13.\tPlace the marinated chicken skewers on a parchment-lined baking sheet or on a lightly oiled roasting rack in a baking pan.\n" +
                        "\n14.\tBake for 15 minutes until golden brown and the internal temperature for the chicken reaches 165F.\n" +
                        "\n15.\tTurn on the broil function on the oven on high and broil for 2-3 minutes until nicely charred on the edges.\n" +
                        "\n16.\tTo cook in the air fryer, do not thread them and place about 10 cubed chicken pieces in the air fryer basket at a time.\n" +
                        "\n17.\tCook at 350 F for 25 minutes, shaking the basket halfway through.\n" +
                        "\n18.\tWhile waiting for the chicken to cook, you can prepare the Vietnamese Noodle Bowls,\n" +
                        "\n19.\tBring a medium pot of water to a boil.\n" +
                        "\n20.\tAdd vermicelli noodles and cook for 2-3 minutes until they are soft.\n" +
                        "\n21.\tUse a strainer to transfer the noodles into a medium mixing bowl and set aside. \n" +
                        "\n22.\tAssemble the noodle bowls by placing 1.5 cups (2 oz.) of cooked vermicelli noodles into each serving bowl.\n" +
                        "\n23.\tTop with sliced chicken, cucumber, carrots, cilantro, and peanuts. \n" +
                        "\n24.\tOr make the Vietnamese Vinegar Chili Sauce, combine all the sauce ingredients into a small mixing bowl.\n" +
                        "\n25.\tStir well with a spoon until smooth and sugar is dissolved.\n" +
                        "\n26.\tPour the sauce over the noodle bowls and drizzle with extra lime juice, if desired. \n",R.drawable.n4));


        recipes1.add(new Recipes("Cold Noodles with Peanut Butter Sauce","Ingredients\n\n"  +
                "•\t1 lb. thin dry wheat noodles\n" +
                "•\t⅓ cup bean sprouts\n" +
                "•\t¼ cup chives, cut into 3-inch pieces\n" +
                "•\t⅓ cup cucumber, sliced\n" +
                "•\t1 tablespoon garlic, minced\n" +
                "•\t½ tablespoon white pepper\n" +
                "•\t2 tablespoons light soy sauce\n" +
                "•\t1 tablespoon black vinegar\n" +
                "•\t1 teaspoon black pepper (optional)\n" +
                "•\t1 teaspoon chili oil (optional, for a spicy kick)\n" +
                "•\t1 teaspoon white sesame seeds (for garnish)\n" +
                "•\t1 tablespoon roasted peanuts, crushed (for garnish)\n" +
                "•\t2 tablespoons peanut butter, smooth\n" +
                "•\t1 tablespoon sesame oil\n" +
                "•\t1 tablespoon hot water\n" +
                "•\t1 teaspoon sugar\n","Method",
                "1.\tIn a medium pot, bring 5 cups of water to a boil.\n" +
                        "\n2.\tAdd dried wheat noodles in the pot and cook the noodles for 2 minutes, stirring occasionally so that the noodles don’t stick to each other.\n" +
                        "\n3.\tTransfer to a colander and rinse with the cold water for 30 seconds.\n" +
                        "\n4.\tDrain the noodles and add into a large mixing bowl.\n" +
                        "\n5.\tBlanch cook the bean sprouts and chives together by boiling them together in the same pot for 1 minute.\n" +
                        "\n6.\tTransfer to a colander and rinse with cold water for 30 seconds.\n" +
                        "\n7.\tTransfer them into the large bowl of noodles.\n" +
                        "\n8.\tAdd in cucumber, garlic, white pepper, soy sauce, black vinegar, pepper (optional), and chili oil (optional).\n" +
                        "\n9.\tStir well to coat the noodles evenly.\n" +
                        "\n10.\tIn a separate small bowl, add peanut butter, sesame oil, hot water (can use the hot water from the cooking pot) and sugar.\n" +
                        "\n11.\tMix well until it becomes a smooth and creamy consistency.\n" +
                        "\n12.\tAdd the peanut butter sauce into the large bowl.\n" +
                        "\n13.\tStir well with a spatula to coat the noodles with peanut butter sauce.\n" +
                        "\n14.\tTransfer the noodles onto a plate, sprinkle white sesame seeds and crushed peanuts on top, and serve.\n",R.drawable.n5));


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
