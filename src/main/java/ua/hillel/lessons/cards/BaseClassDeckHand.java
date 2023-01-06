package src.main.java.ua.hillel.lessons.cards;

abstract class BaseClassDeckHand {

        public int findCards(String value, String suit, Card[] cards, int NumbersOfCard) {
            Card finedCard = new Card(value, suit);
            int count = 0;
            int index = 0;
            for (int i = 0; i < NumbersOfCard; i++) {
                if (cards[i].toString().equals(finedCard.toString())) {
                    count++;
                    index = i;
                }
            }
            if (count > 0) {
                System.out.println("Card " + value + " " + suit + " with index " + index + " fined");
            } else {
                System.out.println("Card hasn`t fined");
                count = -1;
            }
            return count;
        }
    abstract Card[] getCards ();
    abstract void addCard (Card card);

    }


