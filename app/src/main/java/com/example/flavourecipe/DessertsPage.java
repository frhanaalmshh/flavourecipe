package com.example.flavourecipe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//recipes for Desserts Category
public class DessertsPage extends AppCompatActivity {

    //recycler view for each of the recipes
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    //recipe's ingredients and methods are stored in array
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts_page);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Pecan Chocolate Bread and Butter Pudding","Ingredients\n\n" +
                "•\t550g thick-sliced white bread, crusts removed\n" +
                "•\tUnsalted butter, at room temperature\n" +
                "•\t6 eggs, lightly beaten\n" +
                "•\t60g caster sugar\n" +
                "•\t2 tsp cocoa, sifted, plus extra to serve\n" +
                "•\t140g dark (70%) chocolate buttons\n" +
                "•\t300ml pure (thin) cream\n" +
                "•\t1 tsp vanilla bean paste\n" +
                "•\tFinely grated zest of 1 orange\n" +
                "•\t300ml milk\n" +
                "•\t1/4 cup (30g) chopped pecans\n" +
                "•\t30g sultanas\n" +
                "•\tVanilla ice cream, to serve\n","Method",
                "1.\tPreheat oven to 160°C. Grease a 25cm (1.25L capacity) round baking dish and line the base and side with baking paper (the lining here is optional).\n" +
                        "\n2.\tSpread both sides of the bread with butter and cut each slice in half widthwise. Set aside.\n" +
                        "\n3.\tPlace the eggs and sugar in a large bowl and whisk until combined, then stir in cocoa and half of the chocolate.\n" +
                        "\n4.\tPlace the cream, vanilla and orange zest in a small saucepan over medium-high heat and bring just to a simmer. While stirring gently with a whisk, pour the hot cream mixture over the egg mixture and stir continuously until the chocolate has melted. Stir in the milk to cool the mixture, strain through a fine sieve and set aside.\n" +
                        "\n5.\tArrange bread upright in prepared pan, sprinkling pecans, sultanas and remaining chocolate between each piece. Pour chocolate cream mixture over, making sure all bread is coated. Set aside for 15-20 minutes for bread to soak up mixture. Bake for 35-40 minutes until edges are set but centre has a wobble. Remove from oven and set aside to cool slightly. Dust with cocoa and serve with ice cream.\n",R.drawable.d1));

        recipes1.add(new Recipes("Easy Lemon Meringue Pie","Ingredients\n\n" +
                "\nBase\n" +
                "•\t500g Scottish shortbread biscuits\n" +
                "•\t100g salted butter, softened\n" +
                "\nLemon Curd\n" +
                "•\t1 titanium-strength gelatine leaf\n" +
                "•\t3 egg yolks\n" +
                "•\t395g can condensed milk\n" +
                "•\t100ml lemon juice\n" +
                "•\tFinely grated zest of 1 lemon\n" +
                "•\t1/4 tsp salt\n" +
                "\nMeringue\n" +
                "•\t3 eggwhites\n" +
                "•\t100g caster sugar\n" +
                "•\t2 tbs lemon juice\n" +
                "•\t1/2 tsp vanilla extract\n","Method",
                "1.\tFor the base, place the biscuits in a food processor and blitz to crumbs. Add the butter and blitz again until the mixture looks like wet sand. Press the buttery rubble evenly into a 25cm top x 21cm base (5cm deep) fluted loose-based pie dish. Place in the freezer for 10-15 minutes to harden.\n" +
                        "\n2.\tMeanwhile, for the lemon curd, soak the gelatine in cold water for 5 minutes. Remove the gelatine from the bowl, discard water, then return the gelatine to the bowl, cover with 2 tbs boiling water and stir until dissolved.\n" +
                        "\n3.\tPlace the egg yolks in the bowl of a stand mixer with the whisk attachment and whisk on high speed until pale and thickened. Reduce speed to low and gradually whisk in the condensed milk, lemon juice, zest and salt. Add the gelatine and whisk until combined. Pour the creamy lemon custard into the crust, levelling it out with the back of a spoon, and set in the fridge to chill. It will keep happily for 1-2 days. Lift the pie crust out of its pan; if cold from the fridge, it should come out easily.\n" +
                        "\n4.\tFor the meringue, place the eggwhites in the cleaned bowl of a stand mixer with the whisk attachment and whisk on high speed until soft peaks form. Gradually add the sugar, spoonful by spoonful, beating all the while. Keep whisking the meringue until it becomes thick and glossy, then add the lemon juice and vanilla extract. Whisk until well combined.\n" +
                        "\n5.\tDollop the meringue onto the pie and spread it out so all the glossy, sunny filling is completely covered. Use a spoon to make small peaks in the meringue, then use a kitchen blowtorch to caramelise it, so the tips are lightly golden and burnished. The pie, in its fully assembled glorious form, will happily sit in the fridge for up to 1 day. Best served chilled\n",R.drawable.d2));

        recipes1.add(new Recipes("Coconut Yoghurt Cake","Ingredients\n\n"  +
                "•\t200g unsalted butter, at room temperature, chopped\n" +
                "•\t2 tsp finely grated lime zest, plus extra to serve\n" +
                "•\t3/4 cup (165g) caster sugar\n" +
                "•\t3 eggs, at room temperature\n" +
                "•\t60g fine semolina\n" +
                "•\t1/2 cup (50g) almond meal\n" +
                "•\t1 1/2 cups (225g) self-raising flour, sifted\n" +
                "•\t3/4 cup (45g) shredded coconut\n" +
                "•\t180g natural yoghurt\n" +
                "•\t120ml lime juice\n" +
                "•\tWhipped cream, to serve\n" +
                "\nSyrup\n" +
                "•\t370g caster sugar\n" +
                "•\tFinely grated zest of 2 limes plus 1 cup (250ml) lime juice\n","Method",
                "1.\tPreheat oven to 180°C. Grease a 25cm round springform pan and line the base and side with baking paper.\n" +
                        "\n2.\tPlace the butter, lime zest and sugar in the bowl of a stand mixer with the paddle attachment and beat for 5-6 minutes until pale and fluffy. Add eggs, 1 at time, and mix to combine.\n" +
                        "\n3.\tCombine the semolina, almond meal, flour and coconut together in a bowl and gently stir into the egg mixture. Add yoghurt and lime juice, stirring until just combined (be sure not to overwork the mixture). Spoon batter into prepared pan and bake for 1 hour or until lightly golden on top and a skewer inserted in the centre comes out clean. Remove from the oven, cover with foil and stand for 10 minutes.\n" +
                        "\n4.\tMeanwhile, for the syrup, combine sugar and juice in a saucepan over medium heat, stirring to dissolve sugar. Simmer uncovered for 5 minutes or until slightly reduced, stir in the zest.\n" +
                        "\n5.\tUsing a skewer, prick holes into the cake then pour half of the hot syrup over the top – it will be absorbed through the holes. Leave to stand for 1 hour before removing from pan and transferring to a wire rack to cool completely.\n" +
                        "\n6.\tTop cooled cake with whipped cream and scatter with extra lime zest. Serve with remaining syrup alongside.\n",R.drawable.d3));

        recipes1.add(new Recipes("Vanilla and Mango Fro-yo","Ingredients\n\n"  +
                "•\tFlesh of 1 large mango, roughly chopped\n" +
                "•\t1/3 cup (75g) caster sugar\n" +
                "\nYogurt Sorbet\n" +
                "•\t1 cup (220g) caster sugar\n" +
                "•\t1/4 cup (90g) runny honey\n" +
                "•\t750g Greek-style yoghurt\n" +
                "•\t2 tsp vanilla bean paste\n" +
                "•\tFinely grated zest of 1 lime\n" +
                "CANDIED MACADAMIAS\n" +
                "•\t150g macadamias, toasted\n" +
                "•\t1/3 cup (120g) runny honey\n","Method",
                "1.\tPlace mango and sugar in a small saucepan over medium heat and bring to a simmer.\n" +
                        "\n2.\tCook for 7-8 minutes until thickened and mango is soft.\n" +
                        "\n3.\tTransfer to a small food processor and whiz until smooth.\n" +
                        "\n4.\tChill for 1 hour or until completely cool.\n" +
                        "\n5.\tMeanwhile, for the yoghurt sorbet, place sugar, honey and 1 cup (250ml) water in a small saucepan over medium heat.\n" +
                        "\n6.\tBring to a simmer and cook for 3-4 minutes until sugar has dissolved and mixture has thickened slightly. Chill for 1 hour or until cooled completely.\n" +
                        "\n7.\tPlace yoghurt, vanilla, lime zest and cooled sugar syrup in a bowl and whisk to combine.\n" +
                        "\n8.\tTransfer to an ice cream machine and churn for 1 hour-1 hour 15 minutes until thickened.\n" +
                        "\n9.\tTransfer to a bowl and freeze for 1 hour or until almost firm. Add mango puree and swirl to combine.\n" +
                        "\n10.\tQuickly transfer to a piping bag fitted with a 2cm star nozzle.\n" +
                        "\n11.\tFreeze for 20 minutes if needed to firm again.\n" +
                        "\n12.\tMeanwhile, for the macadamias, line a small baking tray with baking paper. Place macadamias on the prepared tray.\n" +
                        "\n13.\tHeat honey in a small saucepan over medium heat. Cook for 4 minutes or until dark golden.\n" +
                        "\n14.\tPour over nuts and sprinkle with sea salt flakes. Cool completely.\n" +
                        "\n15.\tRoughly break up, place in a clean small food processor and process until finely chopped.\n" +
                        "\n16.\tTo serve, pipe yoghurt sorbet into cups and top with crushed macadamia. Alternatively, place yoghurt sorbet in a container in the freezer instead of a piping bag, and scoop into cups to serve.\n",R.drawable.d4));

        recipes1.add(new Recipes("Gingerbread Brownies","Ingredients\n\n"  +
                "•\t250g unsalted butter, chopped\n" +
                "•\t300g CADBURY Baking Dark Chocolate, chopped\n" +
                "•\t4 eggs\n" +
                "•\t1 1/3 firmly packed cups (330g) brown sugar\n" +
                "•\t1 1/3 cups (200g) plain flour, sifted\n" +
                "•\t1/2 tsp baking powder\n" +
                "•\t1/2 tsp ground cinnamon\n" +
                "•\t1/2 tsp ground ginger\n" +
                "•\t1/2 tsp ground nutmeg\n" +
                "•\t1/3 cup (35g) cocoa, sifted\n" +
                "•\tIcing sugar, to dust\n","Method",
                "1.\tPreheat the oven to 170C. Grease and line a 20cm square cake pan.\n" +
                        "\n2.\tMelt butter and 200g chocolate in a heatproof bowl set over a pan of simmering water (don’t let the bowl touch the water), stirring until smooth. Set aside to cool slightly.\n" +
                        "\n3.\tAdd eggs, 1 at a time, to the chocolate mixture, beating well after each addition until combined. Add sugar, flour, baking powder and spices, then fold in the cocoa. Spread batter into the pan and bake for 25 minutes or until just set. Cool in the pan, then turn out and cut into squares.\n" +
                        "\n4.\tMeanwhile, melt the remaining 100g chocolate and allow to cool slightly.\n" +
                        "\n5.\tTo serve, dust brownies with icing sugar, then drizzle over melted chocolate.\n",R.drawable.d5));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
