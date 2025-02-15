import java.util.ArrayList;
public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName = "Bread";
    private boolean state;
    private ArrayList<String> recipe;

    public Bread () {
        this.flour = 1.0;
        this.water = 1.0;
        this.salt = 1.0;
        this.sugar = 1.0;
        this.bakingPowder = 1.0;
        this.yeast = 1.0;

        this.state = false;
        this.recipe = new ArrayList<>();
        this.recipe.add("Mix flour, water, salt, baking powder, yeast.");
        this.recipe.add("Cut and shape the dough.");
        this.recipe.add("Preheat the oven to 450°F.");
        this.recipe.add("Bake at 400°F for 20 minutes.");
        this.recipe.add("Remove the bread from the oven.");
        this.recipe.add("Let the bread cool until good to eat");

    }

    public Bread(boolean state, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, ArrayList<String> recipe){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;

        this.state = state;
        this.recipe = recipe;
    }

    public void bake() {
        if (this.state){
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
        else{
            this.state = true;
            System.out.println("The " + breadName + " is baked now");
        }
    }


    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public ArrayList<String> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<String> recipe) {
        this.recipe = recipe;
    }

    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = new ArrayList<>();
        if (flour > 0){
            ingredients.add(flour + (flour > 1 ? " cups " : " cup ") + "of flour");
        }
        if (water > 0){
            ingredients.add(water + (water > 1 ? " cups " : " cup ") + "of water");
        }
        if (salt > 0){
            ingredients.add(salt + (salt > 1 ? " tsps " : " tsp ") + "of salt");
        }
        if (sugar > 0){
            ingredients.add(sugar + (sugar > 1 ? " tsps " : " tsp ") + "of sugar");
        }
        if (bakingPowder > 0){
            ingredients.add(bakingPowder + (bakingPowder > 1 ? " tsps " : " tsp ") + "of bakingPowder");
        }
        if (yeast > 0){
            ingredients.add(yeast + (yeast > 1 ? " tsps " : " tsp ") + "of yeast");
        }

        return ingredients;
    }

    public String toString(){
        ArrayList<String> ingredients = getIngredients();
        StringBuilder output = new StringBuilder();
        output.append("Ingredients of ").append(breadName).append(" are:\n");
        for (String ingredient : ingredients){
            output.append(ingredient);
            output.append("\n");
        }
        output.append("\nA recipe of ");
        output.append(breadName);
        output.append("\n");
        int step = 1;
        for (String r : recipe) {
            output.append(step);
            output.append(". ");
            output.append(r);
            output.append("\n");
            step++;
        }
        return output.toString();
    }
}


