package src.main.java.ua.hillel.lessons.cards;

public class Hand extends BaseClassDeckHand{

    private final Card[] cards =  new Card[52];

    public Card[] getCards() {
        return cards;
    }

    public Hand() {
    }

    public int currentSize() {
        return inIndex;
    }
    public void addCard(Card card){
        cards[inIndex++] = card;
    }

    public void viewCard(int player) {
        for (int i = 0; i < inIndex; i++) {
            System.out.println(String.format("Player "+ (player+1) +" has card %s%n", cards[i]));
        }
    }
    private int inIndex = 0;
}
