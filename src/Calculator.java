import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        boolean go = true;

        while (go) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");

            // nextDouble() reads the next double from the keyboard
            double first = reader.nextDouble();
            double second = reader.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            double result;

            switch(operator)
            {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;

                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.print("Error! operator is not correct");
                    return;
            }

            System.out.printf("%.1f %c %.1f = %.1f %n", first, operator, second, result);

            System.out.print("\nCalculate again?? Type y for yes and n for no: ");
            char choice = reader.next().charAt(0);
            if (choice == 'n') {
                go = false;
                System.out.println("Bye then! Take care.");
            }
        }
    }
}