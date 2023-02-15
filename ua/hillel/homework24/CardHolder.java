package ua.hillel.homework24;

abstract class CardHolder {
    protected int inIndex = 0;
    protected final Card[] deck;

    protected CardHolder(int deckSize) {
        this.deck = new Card[deckSize];
    }

    public void addCard(Card card){
        deck[inIndex++] = card;
    }

    public int currentSize() {
        return inIndex;
    }

    public int findCard(Card card) {
        for (int i=0; i<inIndex; i++) {
            Card deckCard = deck[i];
            if(deckCard.getSuit().equals(card.getSuit()) && deckCard.getValue().equals(card.getValue())) {
                return i;
            }
        }
        return -1;
    }
}
