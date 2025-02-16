public class Duck extends FarmAnimal{
    private String type = "Duck";
    private String sound;

    public Duck() {
        super();
        sound = "Quack Quack";
    }

    public Duck (String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString(){
        return type + " " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return this.getName() + ": " + "8am-12pm-6pm";
    }
}
