import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Deck deck;

    @Before
    public void before() {
        player1 = new Player("Tom");
        deck = new Deck();
    }

    @Test
    public void hasName() {
       assertEquals("Tom", player1.getName());
   }

   @Test
    public void cardsStartEmpty() {
        assertEquals(0, player1.getCards());
   }

//   @Test
//    public void canReceiveCard() {
//        deck.deal();
//
//   }



}
