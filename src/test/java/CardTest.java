import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {


    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS,RankType.NINE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }
    @Test
    public void canGetRank(){
        assertEquals(RankType.NINE,card.getRank());
    }

    @Test
    public void hasValueFromEnumerator(){
        assertEquals(9,card.getValueFromEnum());
    }
}
