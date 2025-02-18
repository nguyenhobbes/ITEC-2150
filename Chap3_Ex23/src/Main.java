public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Bird bird = new Bird();
        System.out.println(airplane);

        airplane.fly();
        airplane.walk();
        airplane.jump();

        System.out.println(bird);
        bird.fly();
        bird.walk();
        bird.jump();
    }
}
