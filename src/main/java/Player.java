import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player (String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName (){
        return this.name;
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

    public int countHand(){
        return this.hand.size();
    }

    public ArrayList getHand() {
        return this.hand;
    }

    public Card playCard() {
        return this.hand.remove(0);
    }

}
