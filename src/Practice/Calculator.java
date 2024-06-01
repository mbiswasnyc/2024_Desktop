package Practice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("....:::: nJoy Calculator ::::....");
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("================================\n");
            System.out.println("What Operation you want to do: ");
            System.out.println("+ - / * .... or 5 for exit");
            char ch = scan.next().charAt(0);

            if (ch != '5') {
                if(ch=='+' || ch == '-' || ch == '*' || ch == '/'){
                System.out.println("Please enter 1st number: ");
                double n1 = scan.nextDouble();
                System.out.println("Please enter 2nd number: ");
                double n2 = scan.nextDouble();

                    if (ch == '+') {
                        System.out.println("Summation is : " + (n1 + n2));
                    } else if (ch == '-') {
                        System.out.println("Difference is : " + (n1 - n2));
                    } else if (ch == '*') {
                        System.out.println("Multiplication is : " + (n1 * n2));
                    } else if (ch == '/') {
                        System.out.println("Division  is : " + (n1 / n2));
                    }
                }else {
                    System.out.println("Invalid");
                }
            }else {
                break;
            }
        }
    }
}
