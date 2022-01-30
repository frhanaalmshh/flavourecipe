package com.example.flavourecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//recipes for Fast Food Category
public class FastFoodPage extends AppCompatActivity {

    //recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    //recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food_page);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Sourdough Pizza","Ingredients\n\n" +
                "\nFor the pizza dough\n" +
                "•\t50g lively sourdough starter (see Knowhow)\n" +
                "•\t260g tepid water (plus 25g to feed the starter)\n" +
                "•\t1 tbsp extra-virgin olive oil\n" +
                "•\t350g strong white bread flour (plus 25g to feed the starter and extra for dusting)\n" +
                "•\t25g wholemeal bread flour\n" +
                "•\t8g fine sea salt\n" +
                "\nFor the tomato sauce\n" +
                "•\t400g tin whole plum tomatoes (we used the san marzano variety)\n" +
                "•\t2 fat garlic cloves, sliced\n" +
                "•\t2 tbsp extra-virgin olive oil\n" +
                "•\t½ tsp dried oregano\n" +
                "•\tHandful fresh basil, torn, plus extra leaves to serve\n" +
                "\nSuggested toppings\n" +
                "•\t30g parmesan, grated\n" +
                "•\tDried oregano for sprinkling\n" +
                "•\t200g cooking mozzarella (or buffalo mozzarella patted dry on kitchen paper), roughly chopped\n","Method",
                "1.\tStart the recipe the day before you want to eat the pizza. In the morning, to make sure your starter is lively, discard 50g in weight (or save to make a sourdough loaf – see deliciousmagazine.co.uk for a recipe), then feed with 25g white bread flour and 25g water. Put a plastic band round the container, then leave at room temperature, lid slightly ajar, until the starter is bubbling and has increased in volume (4-6 hours).\n" +
                        "\n2.\tIn a measuring jug, weigh 50g lively sourdough starter and 260g water, mix until combined, then stir in the 1 tbsp olive oil. In a separate mixing bowl, combine both flours with the salt. Pour the starter mixture into the flour, then mix with a dough scraper, spatula or a wet hand to bring together into a shaggy dough. Cover with a clean tea towel, then leave to rest for 30 minutes.\n" +
                        "\n3.\tWith floured hands, turning the bowl as you go, stretch and fold the dough over itself, pressing into the middle, until it starts to feel more resistant and firm. Put in an oiled bowl, cover with a plastic bag and leave to rest at room temperature overnight (16-18 hours). The room needs to be quite warm, so if your kitchen is cold it might be best to put the bowl in an airing cupboard.\n" +
                        "\n4.\tThe next morning, divide the dough into 4 (or 2 large) equal pieces, then shape each into a ball. To do this, first stretch the dough and fold it over itself to form a round shape, then turn the dough ball over and, with cupped hands, pull the dough towards you, turning a few times to create a taught surface. Transfer the dough to a floured baking dish or put in separate lidded containers covered with a plastic bag/cling film, then leave to prove for 2-4 hours at room temperature. If you’re not eating until the evening (or the next day or later) put in the fridge to slow-prove – see tips, previous page.\n" +
                        "\n5.\tTo make the sauce, put all the ingredients (except the basil) in a pan with a generous pinch of salt and freshly ground black pepper. Bring to the boil, then simmer for 20 minutes on a low-medium heat, breaking up the tomatoes with a wooden spoon every so often until reduced and thickened. Set aside to cool, then whizz with a stick blender until smooth. Set aside to cool.\n" +
                        "\n6.\t15 minutes before baking, heat/light your pizza oven or heat your grill to hot and have your cast iron/ovenproof frying pan to hand.\n" +
                        "\n7.\tOn a floured work surface, using floured hands, gently pull and stretch out a doughball to form a circle roughly 22-24cm in diameter for a regular pizza or 32-34cm for a large pizza. Don’t let the dough tear\n",R.drawable.f1));

        recipes1.add(new Recipes("Crumbed Fish Burgers ","Ingredients\n\n" +
                "•\t75g plain flour\n" +
                "•\t1 tsp freshly ground black pepper\n" +
                "•\t1 medium free-range egg, lightly beaten\n" +
                "•\t125g panko breadcrumbs\n" +
                "•\t8 x 100g sustainable skinless whiting fillets (or any sustainable white fish)\n" +
                "•\tSunflower oil for deep-frying\n" +
                "•\t4 bread rolls, split in half\n" +
                "\nFor the cabbage slaw\n" +
                "•\t160g shredded red cabbage\n" +
                "•\t160g shredded green cabbage\n" +
                "•\t1 carrot, grated\n" +
                "•\t2 tbsp chopped coriander leaves, plus extra to garnish\n" +
                "\nFor the lemon and coriander mayo\n" +
                "•\tGrated zest and juice 1 lemon\n" +
                "•\t1 tbsp finely chopped coriander\n" +
                "•\t250ml mayonnaise\n","Method",
                "1.\tMix all the lemon and coriander mayo ingredients in a bowl.\n" +
                        "\n2.\tFor the cabbage slaw, combine both cabbages, the carrot and coriander in a bowl with half the mayo. Season, then stir to combine. Set aside until ready to serve.\n" +
                        "\n3.\tMix the flour and pepper in a bowl. Put the beaten egg and breadcrumbs in separate bowls. Dip the fish fillets in the flour mixture first, then coat in beaten egg and finally in the breadcrumbs until well coated.\n" +
                        "\n4.\tHalf-fill a large pan with sunflower oil and heat it to 190°C – a cube of bread will turn golden in 30 seconds when the oil is hot enough – then deep-fry the fish, in batches, for 2-3 minutes or until crisp and golden. Drain on kitchen paper.\n" +
                        "\n5.\tPut 2 pieces of fish per roll, top with some slaw, plus extra coriander if you like, and serve with the remaining lemon and coriander mayo for spreading.\n",R.drawable.f2));

        recipes1.add(new Recipes("Kimchi Beef Burger","Ingredients\n\n"  +
                "•\t½ portion delicious ultimate beef burgers\n" +
                "•\t4 tbsp Korean barbecue sauce (bulgogi sauce) or other good quality bbq sauce\n" +
                "•\t2 tbsp vegetable oil for frying\n" +
                "•\t4 medium free-range eggs\n" +
                "•\t8 tbsp mayonnaise\n" +
                "•\t4 tbsp gochujang chilli paste\n" +
                "•\tDash maple syrup or honey\n" +
                "•\t4 burger buns, toasted\n" +
                "•\t250g kimchi, drained (see Know-how)\n" +
                "•\tSesame seeds and thinly sliced spring onions to serve\n","Method",
                "1.\tHeat a griddle pan over high heat or prepare a barbecue for high direct heat. Cook the burger patties for 6-8 minutes, brushing with the Korean barbecue sauce and turning several times until cooked through, well browned with a little char.\n" +
                        "\n2.\tWhile the burgers are cooking, heat ½ the vegetable oil in a frying pan until very hot. Crack in 2 eggs and fry till the whites are set and crispy around the edges and the yolks still runny (or cooked to your liking). Repeat with remaining oil and eggs.\n" +
                        "\n3.\tIn a small bowl, mix the mayonnaise, gochujang chilli paste and maple syrup/honey. Divide the chilli mayonnaise between the toasted burger buns. Top with a burger on each, then pile on some kimchi and a fried egg. Sprinkle with sesame seeds and spring onions and pop on the lids. Serve immediately with fries on the side if you like.\n",R.drawable.f3));

        recipes1.add(new Recipes("Sausage Cannelloni","Ingredients\n\n"  +
                "•\t200g cannelloni pasta tubes\n" +
                "•\t1⁄2 tbsp olive oil\n" +
                "•\t1 small onion, finely chopped\n" +
                "•\t3 garlic gloves, finely chopped\n" +
                "•\t3 thyme sprigs, leaves stripped\n" +
                "•\t6 x British outdoor-bred pork sausages, skin removed\n" +
                "•\t700g passata with basil\n" +
                "•\t2 tbsp finely chopped basil, plus extra leaves to serve\n" +
                "•\t100g mascarpone\n" +
                "•\t20ml hot fresh chicken stock\n" +
                "•\t20g finely grated parmesan\n","Method",
                "1.\tHeat the grill to high. Cook the cannelloni in a pan of salted water for 4-5 minutes until just soft, then drain. Run under cold water to separate, drain again and set aside.\n" +
                        "\n2.\tMeanwhile, heat the oil in a frying pan over a medium-high heat and fry the onion for 7-8 minutes until softening, then add the garlic and thyme and cook for a minute.\n" +
                        "\n3.\tCrumble in the sausagemeat and fry for 3-4 minutes until browned. Add 500g of the passata and some salt and pepper, then simmer for 5 minutes. Stir in the basil.\n" +
                        "\n4.\tPour the remaining passata into the baking dish, then fill each cannelloni tube with sausage sauce and put in the dish in a single layer.\n" +
                        "\n5.\tWhisk the mascarpone and stock in a small bowl, then spoon over the top of the pasta tubes. Scatter over the parmesan, then grill for 4-5 minutes until lightly golden and bubbling. Scatter extra basil leaves on top and serve with a green salad.\n",R.drawable.f4));

        recipes1.add(new Recipes("Cheesy Sausage and Mash Pie","Ingredients\n\n"  +
                "•\t450g British outdoor-reared pork sausagemeat\n" +
                "•\t1 sliced onion\n" +
                "•\t2 crushed garlic cloves\n" +
                "•\t1 tsp fresh thyme leaves\n" +
                "•\t2 tbsp onion chutney\n" +
                "•\t½ tsp Marmite\n" +
                "•\t100ml red wine\n" +
                "•\t1kg peeled and quartered potatoes\n" +
                "•\tLarge knob of butter\n" +
                "•\t80ml whole milk\n" +
                "•\t100g grated cheddar\n" +
                "•\t50ml cold beef stock\n" +
                "•\t2 tsp cornflour\n" +
                "•\t250ml hot beef stock\n","Method",
                "1.\tHeat the oven to 200°C/180°C fan/gas 6. Fry the pork sausage meat in a shallow, hob-safe medium casserole over a medium heat for 8-10 minutes until golden, breaking up the sausage meat with a wooden spoon. Scoop out using a slotted spoon and set aside.\n" +
                        "\n2.\tAdd the onion to the casserole, then turn down the heat and cook for 15 minutes until lightly caramelised. Add the crushed garlic, fresh thyme leaves, onion chutney and Marmite, stir for a few minutes, then pour in the red wine. Bubble until reduced by about half. Meanwhile, put the potatoes in a large pan of water, bring to the boil, then simmer for 12-15 minutes until tender. Drain well, then mash until smooth. Stir in a large knob of butter, the whole milk, 50g of the grated cheddar and some ground black pepper.\n" +
                        "\n3.\tMix the cold beef stock with the cornflour and add to the casserole with the hot beef stock. Stir well, bring to a simmer and cook until thickened, stirring to prevent lumps. Stir in the sausage meat, then season to taste. Spoon the mash over the filling, sprinkle with the rest of the cheddar and bake for 30 minutes until golden and bubbling.\n",R.drawable.f5));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
