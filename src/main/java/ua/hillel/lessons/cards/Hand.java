package src.main.java.ua.hillel.lessons.cards;

public class Hand extends BaseClassDeckHand {

    private final Card[] cards = new Card[52];


    public Card[] getCards() {
        return cards;
    }

    public Hand() {
    }

    public int currentSize() {
        return inIndex;
    }

    public void addCard(Card card) {
        cards[inIndex++] = card;
    }


    public Card viewCard(int player) {
        for (int i = 0; i < inIndex; i++) {
            System.out.println(String.format("Player " + (player + 1) + " has card %s%n", cards[i]));
        }
        return cards[player];
    }

    private int inIndex = 0;


    public int findCards2(Card finedCard) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (this.cards[i].toString().equals(finedCard.toString())) {
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
