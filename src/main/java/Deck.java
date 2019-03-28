import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> allCards;


    public Deck() {
        this.allCards = new ArrayList<>();

    }


    public void putCards(Card card){
        this.allCards.add(card);
    }

    public void populateDeck(){
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();

        for( SuitType suit : suits) {
            for (RankType rank : ranks) {
                Card newCard = new Card(suit, rank);
                this.putCards(newCard);
            }
        }

    }


    public int cardCount(){
        return this.allCards.size();
    }

    public void shuffle(){

    }
}
