import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(3, 4, 5));
        triangles.add(new Triangle(1, 1, 1));
        triangles.add(new Triangle(1, 2, 3));

        for (Triangle triangle : triangles) {
            try {
                if (triangle.checkSides()) {
                    System.out.println("Valid triangle sides!");
                }
            } catch (IllegalTriangleSideException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}