package src.main.java.ua.hillel.lessons.cards;

public class Hand extends BasePoker {

    private int inIndex = getInIndex(); //Size of deck
    private final Card[] cardsOnHand = new Card[getNoOfCards()]; //Object "Card" Quantity of cards

    public Card[] getCards() {
        return cardsOnHand;
    }

    @Override
    public int currentSize() {
        return inIndex;
    } //Size of deck

    public Hand() {
    } //Constructor class

    @Override
    public void addCard(Card card) { //addCart
        cardsOnHand[inIndex++] = card;
    }

    public Card[] viewHand() { //viewHand
        for (int i = 0; i < inIndex; i++) {
            System.out.print(String.format("Player has card %s; ", cardsOnHand[i]));
        }
        return cardsOnHand;
    }

    public void viewArrayHands() {
        for (int i2 = 0; i2 < inIndex; i2++) {
            System.out.print(cardsOnHand[i2]);
        }
    }

}
