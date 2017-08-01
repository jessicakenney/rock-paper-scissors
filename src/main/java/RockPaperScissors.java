import java.util.Random;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissors {



    public String getRockPaperScissorsWinner(String choice1, String choice2){
        String winner = "";
        if (choice1.equalsIgnoreCase(choice2)) {
            winner = "tie";
        } else if (choice1.equalsIgnoreCase("rock") || choice2.equalsIgnoreCase("rock")) {
            if (choice1.equalsIgnoreCase("scissors") || choice2.equalsIgnoreCase("scissors")) {
                winner = "rock";
            } else  {
                winner = "paper";
            }
        } else if (  (choice1.equalsIgnoreCase("paper") && choice2.equalsIgnoreCase("scissors")) || ((choice1.equalsIgnoreCase("scissors") && choice2.equalsIgnoreCase("paper")))) {
            winner = "scissors";

        }

        return winner;
    }
    public String computerChooses (){
        String randomChoice = "";
        Random newRandomGenerator = new Random();
        int randomNum = newRandomGenerator.nextInt(3);
        switch (randomNum){
            case 0: randomChoice = "rock";
            break;
            case 1: randomChoice = "paper";
            break;
            case 2: randomChoice = "scissors";
            break;
        }
        return randomChoice;
    }

}
