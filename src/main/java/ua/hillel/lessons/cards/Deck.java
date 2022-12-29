package src.main.java.ua.hillel.lessons.cards;

public class Deck {

    private static final int noOfCards = 52;

    private final Card[] deck;

    public int currentSize() {
        return inIndex;
    }

    private int inIndex = 0;
    private final int outIndex = 0;

    public Deck(int customNoOfCards) {
        this.deck = new Card[customNoOfCards];
    }

    public Deck() {
        this(noOfCards);
    }

    public void addCard(Card card){
        if (!(inIndex >= noOfCards)) {
            deck[inIndex++] = card;
        }
    }

    public Card viewCard(int i) {
        return deck[i];
    }

    public Card takeCard(int i) {
        Card card = this.viewCard(i);
        deck[i] = null;
        inIndex--;
        return card;
    }

    public void  setCard(int index, Card card) {
        deck[index] = card;
    }
}
