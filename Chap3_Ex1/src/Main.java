import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> farmAnimal = new ArrayList<>();
        FarmAnimal temp;
        temp = new Duck("Donald", "male", 3.2, 5, "Quack Quack");
        farmAnimal.add(temp);
        temp = new Duck("Cheese", "female", 3.6, 5, "Quack Quack");
        farmAnimal.add(temp);
        temp = new Cow("Molly", "female", 1600.0, 3, "Moo Moo");
        farmAnimal.add(temp);
        temp = new Chicken("Albert", "male", 3.2, 5, "Cock-a-Doodle-doo");
        farmAnimal.add(temp);
        temp = new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck");
        farmAnimal.add(temp);
        temp = new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck");
        farmAnimal.add(temp);
        

        for(FarmAnimal animal : farmAnimal){
            System.out.println(animal.toString());
        }

        for(FarmAnimal animal : farmAnimal){
            System.out.println(animal.feedLoadingSchedule());
        }
    }
}