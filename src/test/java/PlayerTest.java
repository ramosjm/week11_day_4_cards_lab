import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    private Player player1;
    private Player player2;
    private Card card1;
    private Card card2;
    private ArrayList<Card> player1Cards;
    private ArrayList<Card> player2Cards;

    @Before
    public void before(){
        player1 = new Player("Anita");
        player2 = new Player("Emil");
        card1 = new Card(SuitType.HEARTS, RankType.FIVE);
        card2 = new Card(SuitType.CLUBS, RankType.EIGHT);
        player1Cards = new ArrayList<>();
        player2Cards = new ArrayList<>();
    }

    @Test
    public void canGetName(){
        assertEquals("Anita",player1.getName());
    }

    @Test
    public void canAddCardToHand(){
        player1.addCardToHand(card1);
        player1.addCardToHand(card1);
        assertEquals(2,player1.countHand());
    }

    @Test
    public void canGetHand(){
        player1.addCardToHand(card1);
        player1Cards.add(card1);
        assertEquals(player1Cards, player1.getHand());
    }

    @Test
    public void canPlayCard() {
        player1.addCardToHand(card1);
        player1.playCard();
        assertEquals(0, player1.countHand());
    }



}
