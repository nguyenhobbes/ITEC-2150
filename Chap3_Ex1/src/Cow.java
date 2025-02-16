public class Cow extends FarmAnimal{
    private String type = "Cow";
    private String sound;

    public Cow() {
        super();
        sound = "Moo Moo";
    }

    public Cow (String name, String gender, double weight, int age, String sound) {
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
        return this.getName() + ": " + "6am-4pm";
    }
}
