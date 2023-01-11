package src.main.java.ua.hillel.lessons.cards;

abstract class BaseClassDeckHand {
    public int NumbersOfCard;
    public Card[] finedCard;

    public int findCards2(Card finedCard) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < NumbersOfCard; i++) {
            if (this.finedCard[i].toString().equals(finedCard.toString())) {
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

    abstract void addCard(Card card);

    abstract Card viewCard(int player);
    abstract  int currentSize();
    abstract Card[] getCards();

}


