package src.main.java.ua.hillel.lessons.cards;

public class Hand {

    private final Card[] cards =  new Card[52];

    public Hand() {
    }

    public int currentSize() {
        return inIndex;
    }
    public void addCard(Card card){
        cards[inIndex++] = card;
    }

    private int inIndex = 0;
}
