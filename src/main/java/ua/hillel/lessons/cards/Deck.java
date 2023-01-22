package src.main.java.ua.hillel.lessons.cards;

public class Deck extends CardsHolder {

    private static final int noOfCards = 52;

    public int currentSize() {
        return inIndex;
    }

    public Deck() {
        super(noOfCards);
    }

    public void addCard(Card card){
        if (!(inIndex >= noOfCards)) {
            super.addCard(card);
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
