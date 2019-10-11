import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card1;
    Card card2;

    @Before
    public void before() {
        card1 = new Card(SuitType.CLUBS, RankType.FIVE);

    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.CLUBS, card1.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.FIVE, card1.getRank());
    }

    @Test
    public void queenHasValue10() {
        card2 = new Card(SuitType.HEARTS, RankType.QUEEN);
        assertEquals(10, card2.getValueFromEnum());
    }

}
