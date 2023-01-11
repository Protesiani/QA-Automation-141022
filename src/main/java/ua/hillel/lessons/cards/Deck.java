package src.main.java.ua.hillel.lessons.cards;

public class Deck extends BaseClassDeckHand {

    private static final int noOfCards = 52;

    private final Card[] deck;

    public Card[] getCards() {
        return deck;
    }

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

    public void addCard(Card card) {
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

    public void setCard(int index, Card card) {
        deck[index] = card;
    }

    @Override
    public int findCards2(Card finedCard) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < noOfCards; i++) {
            if (deck[i].toString().equals(finedCard.toString())) {
                count++;
                index = i;
            }
        }
        if (count > 0) {
            System.out.println("Card " + finedCard.getValue() + " " + finedCard.getSuit() + " with index " + index + " fined");
        } else {
            System.out.println("Card hasn`t fined");
            count = -1;
        }
        return count;
    }
}
