package src.main.java.ua.hillel.lessons.cards;

public class Deck extends BasePoker {

    private int inIndex = getInIndex(); //Size of deck
    private final Card[] deck; //Object "Card" Quantity of cards

    public Card[] getDeck() {
        return deck;
    }

    @Override
    public int currentSize() {
        return inIndex;
    } //Size of deck

    private static final int noOfCards = 52; //Quantity of cards
    private final int outIndex = 0;

    public Deck() { //Constructor class
        this(getNoOfCards());
    } //Constructor class

    @Override
    public void addCard(Card card) { //addCart
        if (!(inIndex >= getNoOfCards())) {
            deck[inIndex++] = card;
        }
    }

    public Card viewCard(int i) { //viewHand
        return deck[i];
    }

    public Deck(int customNoOfCards) {  //Constructor class
        this.deck = new Card[customNoOfCards];
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
}
