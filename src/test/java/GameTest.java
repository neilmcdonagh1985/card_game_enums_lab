import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;

    @Before
    public void before() {
        game = new Game();
        player1 = new Player("Caoimhe");

    }

    @Test
    public void canGetAllPlayers() {
        assertEquals(0, game.getAllPlayers());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.getAllPlayers());
    }

    @Test
    public void canPlayGame() {
        card1 = new Card(SuitType.DIAMONDS, RankType.FOUR);
        card2 = new Card(SuitType.SPADES, RankType.KING);
        card3 = new Card(SuitType.DIAMONDS, RankType.FIVE);
        card4 = new Card(SuitType.HEARTS, RankType.ACE);
        card5 = new Card(SuitType.CLUBS, RankType.FOUR);
        player2 = new Player("Higgy");
        player3 = new Player("Nathan");
        player4 = new Player("Alison");
        player5 = new Player("Yvonne");
        assertEquals(player1, game.play());
    }


}
