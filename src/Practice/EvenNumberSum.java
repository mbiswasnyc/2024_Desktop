package Practice;

import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Starting of the range: ");
        int start = scan.nextInt();
        System.out.println("Ending of the range: ");
        int end = scan.nextInt();
        int sum=0;

        for(int i=start; i<=end; i++){
            if(i%2==0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
