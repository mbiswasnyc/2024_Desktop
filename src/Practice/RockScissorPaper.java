package Practice;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("...::: Welcome to rock scissor paper game :::...");
        while (true){
            System.out.println("1-> Rock , 2-> Scissor , 3-> Paper , 0-> EXIT");
            int user = scan.nextInt();
            int com = rand.nextInt(4);
            if (user == 1 || user == 2 || user == 3) {
                if (user == com) {
                    System.out.println("Draw");
                } else if (user == 1 && com == 2) {
                    System.out.println("You choose Rock and Computer choose Scissor");
                    System.out.println("You win :)");
                } else if (user == 1 && com == 3) {
                    System.out.println("You choose Rock and Computer choose Paper");
                    System.out.println("You lose :(");
                } else if (user == 2 && com == 1) {
                    System.out.println("You choose Scissor and Computer choose Rock");
                    System.out.println("You lose :(");
                } else if (user == 2 && com == 3) {
                    System.out.println("You choose Scissor and Computer choose Paper");
                    System.out.println("You win :)");
                } else if (user == 3 && com == 1) {
                    System.out.println("You choose Paper and Computer choose Rock");
                    System.out.println("You win :)");
                } else {
                    System.out.println("You choose Scissor and Computer choose Rock");
                    System.out.println("You lose :(");
                }
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            }else if (user == 0){
                break;
            }else{
                System.out.println("invalid input... Try again");
            }
        }
    }
}
