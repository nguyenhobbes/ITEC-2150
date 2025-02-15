import java.util.ArrayList;
public class SourdoughBread extends Bread {
    private double sourdoughStarter;

    public SourdoughBread() {
        super();
        this.sourdoughStarter = 1.0;
        this.setBreadName("Sourdough Bread");

        ArrayList<String> temp = this.getRecipe();
        temp.set(0, "Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.");
        temp.add(1, "Make the dough.");
        temp.add(3, "Stretch and fold the dough.");
        temp.add(5, "Spray the loaf with luke warm water.");
        this.setRecipe(temp);
    }

    public SourdoughBread(boolean state, double flour, double water, double salt, double sugar, double bakingPowder, double yeast, double sourdoughStarter, ArrayList<String> recipe) {
        super(state, flour, water, salt, sugar, bakingPowder, yeast, recipe);
        this.sourdoughStarter = sourdoughStarter;
        this.setBreadName("Sourdough Bread");

        ArrayList<String> temp = this.getRecipe();
        temp.set(0, "Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.");
        temp.add(1, "Make the dough.");
        temp.add(3, "Stretch and fold the dough.");
        temp.add(5, "Spray the loaf with luke warm water.");
        this.setRecipe(temp);
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }

    @Override
    public ArrayList<String> getIngredients() {
        ArrayList<String> ingredients = super.getIngredients();
        if (sourdoughStarter > 0) {
            ingredients.add(sourdoughStarter + (sourdoughStarter > 1 ? " cups " : " cup ") + "of ripe sourdough starter");
        }
        return ingredients;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}