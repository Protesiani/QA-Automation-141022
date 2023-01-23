package src.main.java.ua.hillel.lessons.cards;

public class Card extends DeckHandBase {
    private final String value;
    private final String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }

    @Override
    int findCard(Card card, Card userCards) {
        return 0;
    }

}
