package src.main.java.ua.hillel.lessons.cards;

public class Deck {

    private static final int noOfCards = 52;

    private final Card[] deck;
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

    public Card getCard(int i) {
        return deck[i];
    }

    public void  setCard(int index, Card card) {
        deck[index] = card;
    }
}
