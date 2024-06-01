import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("It's an Even number.");
        } else {
            System.out.println("It's an Odd number.");
        }
    }
}

