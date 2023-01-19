import java.util.Arrays;
import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Test your spelling.");
        System.out.println("Form as many words as possible with the following letters.");

        String letters = "D A N L E T";

        //*Display letters */
        System.out.println(letters);

        //*Answer list */
        //dental, dealt, delta, leant, laten, deal, land, lead, tend, lean 
        String[] answerList = {"DENTAL", "DEALT", "DELTA", "LEANT", "LATEN", "DEAL", "LAND", "LEAD", "TEND", "LEAN"};

        Scanner In = new Scanner(System.in);

        System.out.println("Enter guess: ");
        String Guess = In.nextLine();
        String UsersGuess = Guess.toUpperCase();

        //*Object */
        Puzzle Obj = new Puzzle();

        //*Loop */
        if(UsersGuess.equals(answerList[0]) || UsersGuess.equals(answerList[1]) || UsersGuess.equals(answerList[2]) || UsersGuess.equals(answerList[3]) || UsersGuess.equals(answerList[4]) || UsersGuess.equals(answerList[5]) || UsersGuess.equals(answerList[6]) || UsersGuess.equals(answerList[7]) || UsersGuess.equals(answerList[8]) || UsersGuess.equals(answerList[9])){
            System.out.println(Guess + " is in the list of answers!");
            System.out.println("");
        }else{
            System.out.println(Guess + " is not in the answer list");
            System.out.println("");
        }

        System.out.println("Would you like to continue playing y/n?");
        String Continue = In.nextLine().toUpperCase();
        if(Continue.equals("Y")){
            //*Call method */
            Puzzle.main(answerList);
        }else if(Continue.equals("N")) {
            System.out.println("Todays answer list: " + answerList[0] + ", " + answerList[1] + ", " + answerList[2] + ", "+ answerList[3] + ", " + answerList[4] + ", " + answerList[5] + ", " + answerList[6] + ", " + answerList[7] + ", " + answerList[8] + ", " + answerList[9]);
            System.out.println("Thanks for playing!");
        }
        
    }

}