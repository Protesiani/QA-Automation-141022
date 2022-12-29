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

    public void viewHand() {
        for (int i = 0; i < inIndex; i++) {
            System.out.println(String.format("Player has card %s%n", cards[i]));
        }
    }
    private int inIndex = 0;
}
