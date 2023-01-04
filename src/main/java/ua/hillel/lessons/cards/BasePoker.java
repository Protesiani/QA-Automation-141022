package src.main.java.ua.hillel.lessons.cards;

abstract class BasePoker {

    private int inIndex = 0; //Size of deck

    public int getInIndex() {
        return inIndex;
    }

    private static final int noOfCards = 52;

    public static int getNoOfCards() {
        return noOfCards;
    }

    public int currentSize() {
        return inIndex;
    }

    public void addCard(Card card) { //addCart
    }

    public int findCards(String value, String suit, Card[] cards) {
        Card finedCard = new Card(value, suit);
        int count = 0;
        int index = 0;
        for (int i = 0; i < getNoOfCards(); i++) {
            if (cards[i].toString().equals(finedCard.toString())) {
                count++;
                index = i;
            }
        }
        if (count > 0) {
            System.out.println("Card " + value + " " + suit + " with index " + index + " fined");
        } else {
            System.out.println("Card hasn`t fined");
            count=-1;
        }
        return count;
    }
}
