import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Bread b = new Bread();
        System.out.println(b.toString());

        SourdoughBread s = new SourdoughBread(false, 5.00, 1.50, 2.50, 0, 0, 0, 1.00, b.getRecipe());
        System.out.println(s.toString());
        s.bake();
        //s.bake();
    }
}