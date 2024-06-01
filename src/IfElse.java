import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your Marks to see your Grade");

        int grade= scan.nextInt();


        if(grade<=100 && grade>=1){
            if(grade<=100 && grade>=90){
                System.out.println("Gtade : A");
            }else if(grade<90 && grade>=80){
                System.out.println("Grade : B");
            }else if(grade<80 && grade>=70){
                System.out.println("Grade : C");
            }else if(grade<70 & grade>=60){
                System.out.println("Grade : D");
            }else{
                System.out.println("Fail");
            }

        }else{
            System.out.println("Invalid Marks");
        }
    }
}
