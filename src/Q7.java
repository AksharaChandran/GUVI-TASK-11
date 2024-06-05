import java.util.Scanner;

public class Q7 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            try {
                if (age < 18) {
                    throw new Q7("Age must be at least 18.");
                }
                System.out.println("Age is valid.");
            } catch (Q7 e) {
                System.out.println("Error: " + e.getClass());
            }
        }
    }


