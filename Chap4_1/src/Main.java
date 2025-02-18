import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.println("Enter 2 numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println("Addition result: " + (a + b));
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }
}