package Practice;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if(n>=0){
                System.out.println("Its a positive Number");
            }else{
                System.out.println("Its a negative Number");
            }
            System.out.println("____________________________");
        }
    }
}
