import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class RockPaperScissorsTest {

    @Test
    public void getRockPaperScissorsWinner_rockVScissors_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "rock";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("rock", "scissors"));
    }
    @Test
    public void getRockPaperScissorsWinner_rockVRock_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("rock", "rock"));
    }
    @Test
    public void getRockPaperScissorsWinner_rockVPaper_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "paper";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("rock", "paper"));
    }

    @Test
    public void getRockPaperScissorsWinner_scissorsVPaper_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "scissors";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("paper", "scissors"));
    }
    @Test
    public void getRockPaperScissorsWinner_scissorsVRock_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "rock";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("scissors", "rock"));
    }
    @Test
    public void getRockPaperScissorsWinner_paperVPaper_String () {
        RockPaperScissors testGame = new RockPaperScissors();
        String expected = "tie";
        assertEquals(expected, testGame.getRockPaperScissorsWinner("paper", "paper"));
    }
    @Test
    public void computerChooses_shouldBeAString_true() throws Exception {
        RockPaperScissors testGame = new RockPaperScissors();
        String computerChoice = testGame.computerChooses();
        //String expected = "rock";
        //assertEquals(expected, testGame.computerChooses());
        assertEquals(true, computerChoice instanceof String);

    }



}