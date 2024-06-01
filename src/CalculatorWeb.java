import java.util.Scanner;
public class CalculatorWeb {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double num1, num2, result;
            //double result=0;
            char operator;

            System.out.print("Enter first number: ");
            num1 = scan.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scan.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scan.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
            } else {
                System.out.println("Error: Invalid operator.");
                return;
            }

            System.out.println("Result: " + result);
        }
    }

