import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        // variables
        int num1, num2, choice;
        String con;

        // create a new scanner object
        Scanner scanner = new Scanner(System.in);

        do {
            // welcome message
            System.out.println("\n");
            System.out.println("Welcome to My Calculator!");
            System.out.println("-------------------------");
            System.out.println("\n");

            // getting user input
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();

            System.out.println("\n");
            System.out.println("What calculation would you like to perform?");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Division (/)");
            System.out.print("5. Modulo (%)");
            System.out.println("\n");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // this executes the task for the main program
            // object calculator to start the methods
            Calculator calc = new Calculator(num1, num2, choice);

            if (choice == 1) {
                System.out.println("\n");
                System.out.println("You selected addition.");
                System.out.println(num1 + " + " + num2 + " = " + calc.subtract(num1, num2));
                System.out.println("\n");
            }

            else if (choice == 2) {
                System.out.println("\n");
                System.out.println("You selected subtraction.");
                System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
                System.out.println("\n");

            }

            else if (choice == 3) {
                System.out.println("\n");
                System.out.println("You selected multiplication.");
                System.out.println(num1 + " x " + num2 + " = " + calc.multiply(num1, num2));
                System.out.println("\n");
            }

            else if (choice == 4) {
                System.out.println("\n");
                System.out.println("You selected division.");
                if (num2 == 0) {
                    System.out.println("\n");
                    System.out.println("Error: Division by zero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
                }
                System.out.println("\n");
            }

            else if (choice == 5) {
                System.out.println("\n");
                System.out.println("You selected modulo.");
                System.out.println(num1 + " % " + num2 + " = " + calc.modulo(num1, num2));
                System.out.println("\n");
            } else {
                System.out.println("\n");
                System.out.println("Invalid choice. Please try again.");
                System.out.println("\n");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            con = scanner.next();
            System.out.println("\n");

        } while (con.equalsIgnoreCase("y"));

        System.out.println("\n");
        System.out.println("Thank you for using My Calculator :)");
        System.out.println("\n");
        scanner.close();
    }
}