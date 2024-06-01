package Practice;

import java.util.Scanner;

public class LargerNumberFromThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets find the larger Number.....");

        while(true) {
            System.out.println("Enter 1st Number: ");
            int n1 = scan.nextInt();
            System.out.println("Enter 2nd Number: ");
            int n2 = scan.nextInt();
            System.out.println("Enter 3rd Number: ");
            int n3 = scan.nextInt();

            if (n1 > n2 && n1 > n3) {
                System.out.println(n1 + " is the larger number");
            } else if (n2 > n3) {
                System.out.println(n2 + " is the larger number");
            } else {
                System.out.println(n3 + " is the larger number");
            }
            System.out.println("====================================");
        }
    }
}
