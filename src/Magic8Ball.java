import java.util.Scanner;

public class Magic8Ball{

    public static void main(String[]args){
        //delcare
        Scanner keyboard;
        int value;
        int testing;
        String question;

        //intializtion
        keyboard = new Scanner(System.in);
        System.out.println("Ask a Question?");
        question = keyboard.nextLine();
        System.out.println("Pick a number from 0 to 100.");
        testing = keyboard.nextInt();
        if ((0 <= testing) && (testing <= 10)){
           System.out.println("It might be Unlikley.");
        }
        if ((11 <= testing) && (testing <=20)){
            System.out.println("Bad Luck, try again.");
        }
        if ((21 <= testing) && (testing <=20)){
            System.out.println("It might just work.");
        }
        if ((31 <= testing) && (testing <=40)){
            System.out.println("Absolutely Yee.. I mean NO!!");
        }
        if ((41 <= testing) && (testing <=50)){
            System.out.println("Absolutely");
        }
        if ((51 <= testing) && (testing <=60)){
            System.out.println("The outcome is positive.");
        }
        if ((61 <= testing) && (testing <=70)){
            System.out.println("Just No.");
        }
        if ((71 <= testing) && (testing <=80)){
            System.out.println("For Sure");
        }
        if ((81 <= testing) && (testing <=90)){
            System.out.println("Yesssssirrr");
        }
        if ((91 <= testing) && (testing <=100)){
            System.out.println("1000% Not Happening");
        }




    }
}
