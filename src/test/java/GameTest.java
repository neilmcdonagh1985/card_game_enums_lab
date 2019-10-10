import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Player player;

    @Before
    public void before() {
        game = new Game();
        player = new Player("Bob");
    }

    @Test
    public void canGetAllPlayers() {
        assertEquals(0, game.getAllPlayers());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player);
        assertEquals(1, game.getAllPlayers());

    }
}
