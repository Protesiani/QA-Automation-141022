package src.main.java.ua.hillel.lessons.cards;

public class Hand {

    private final Card[] cards = new Card[52];

    public Hand() {
    }

    public int currentSize() {
        return inIndex;
    }

    public void addCard(Card card) {
        cards[inIndex++] = card;
    }

    public Card viewHand(int player) {
        for (int i = 0; i < inIndex; i++) {
            System.out.printf("Player " + player + " has card %s%n%n", cards[i]);
        }
        return cards[player];
    }

    private int inIndex = 0;

}
