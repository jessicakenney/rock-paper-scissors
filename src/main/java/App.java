import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Let's Play Rock Paper Scissors! 1 Player or 2 Player");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String navChoice = bufferedReader.readLine();
            RockPaperScissors newGame = new RockPaperScissors();
            if (navChoice.equalsIgnoreCase("1 Player")){
                System.out.println("Player1 enter choice : ");
                String player1 = bufferedReader.readLine();
                String computerChoice = newGame.computerChooses();
                System.out.println("Computer choice: " + computerChoice);
                System.out.println("WINNER : "+ newGame.getRockPaperScissorsWinner(player1,computerChoice));

            } else if (navChoice.equalsIgnoreCase("2 Player")){
                System.out.println("Player1 enter choice : ");
                String player1 = bufferedReader.readLine();

                System.out.println("Player2 enter choice : ");
                String player2 = bufferedReader.readLine();

                System.out.println("WINNER : "+ newGame.getRockPaperScissorsWinner(player1,player2));
            } else {
                System.out.println("Invalid input");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
