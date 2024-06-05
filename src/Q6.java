import java.util.Scanner;

public class Q6 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String correctPassword = "password123";

            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again.");
            } else {
                System.out.println("Login successful!");
            }
        }
    }


