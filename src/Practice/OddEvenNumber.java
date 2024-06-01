package Practice;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if (n % 2 == 1) {
                System.out.println("Its an Odd Number");
            } else {
                System.out.println("Its an Even Number");
            }
            System.out.println("________________________");
        }
    }
}
