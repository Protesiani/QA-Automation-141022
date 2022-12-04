package ua.hillel.lessons.homework10;

import java.util.Random;

public class Deck {
    int noOfCards;
    int noOfPlayers;
    String[] cards;

    public Deck(int noOfCards, int noOfPlayers) throws MyException {
        if(noOfCards != 52){
            throw new MyException("Only 52 supported");
        }
        if (noOfPlayers <= 2 || noOfPlayers >= 10){
            throw new MyException("Players number must be from 2 to 10");
        }
        this.noOfCards = noOfCards;
        this.noOfPlayers = noOfPlayers;
        this.cards = new String[noOfCards];
    }

    public void createDeck() throws ArrayIndexOutOfBoundsException {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                cards[index++] = value + " of " + suit;
            }
        }
    }

    public void shuffleDeck()  {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfPlayers);
            String tmpCard = cards[in];
            cards[in] = cards[out];
            cards[out] = tmpCard;
        }
    }

}

