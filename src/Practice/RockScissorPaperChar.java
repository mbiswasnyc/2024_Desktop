package Practice;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaperChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] choice = {"r", "p", "s"};

        System.out.println("...::: Welcome to rock scissor paper game :::...");
        while (true){
            System.out.println("Please enter your move");
            System.out.println("r)ock , s)cissor , p)aper , e)xit");
            String user = scan.nextLine();
            String comMove = choice[new Random().nextInt(choice.length)];
            if (user.equals("r") || user.equals("s") || user.equals("p")) {
                if (user.equals(comMove)) {
                    System.out.println("Draw");
                } else if (user.equals("r") && comMove.equals("s")) {
                    System.out.println("You choose Rock and Computer choose Scissor");
                    System.out.println("You win :)");
                } else if (user.equals("r") && comMove.equals("p")) {
                    System.out.println("You choose Rock and Computer choose Paper");
                    System.out.println("You lose :(");
                } else if (user.equals("s") && comMove.equals("r")) {
                    System.out.println("You choose Scissor and Computer choose Rock");
                    System.out.println("You lose :(");
                } else if (user.equals("s") && comMove.equals("p")) {
                    System.out.println("You choose Scissor and Computer choose Paper");
                    System.out.println("You win :)");
                } else if (user.equals("p") && comMove.equals("r")) {
                    System.out.println("You choose Paper and Computer choose Rock");
                    System.out.println("You win :)");
                } else if (user.equals("p") && comMove.equals("s")) {
                    System.out.println("You choose Paper and Computer choose Scissor");
                    System.out.println("You lose :(");
                }
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            }else if (user.equals("e")){
                break;
            }else{
                System.out.println("invalid input... Try again");
            }
        }
    }
}
