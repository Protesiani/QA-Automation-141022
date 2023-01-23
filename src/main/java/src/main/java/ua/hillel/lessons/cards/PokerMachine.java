package src.main.java.ua.hillel.lessons.cards;


import java.util.Random;

public class PokerMachine {
    public Deck createDeck() throws NotFullDeckException, IllegalArgumentException, NullPointerException {
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Deck deck = new Deck();
        if (!((suites.length == 4) & (values.length == 13))) {
            throw new NotFullDeckException(" Not full deck");
        }

        for (String suit : suites) {
            for (String value : values) {
                deck.addCard(new Card(value, suit));
            }
        }
        return deck;
    }

    public void shuffleDeck(Deck deck) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(52);
            int out = random.nextInt(52);
            Card tmpCard = deck.viewCard(in);
            deck.setCard(in, deck.viewCard(out));
            deck.setCard(out, tmpCard);
        }
    }

    public void serveCardsToPlayer(int noOfPlayers, Deck deck) throws NotEnoughPlayerException {
        if (!((noOfPlayers < 8) & (noOfPlayers > 2)))
            throw new NotEnoughPlayerException("Not enough player. Player should be from 2 to 8");
        Hand[] hands = new Hand[noOfPlayers];
        for (int player = 0; player < noOfPlayers; player++) {
            hands[player] = new Hand();
        }

        int index = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round " + round);
            for (int player = 1; player <= noOfPlayers; player++) {
                Card card = deck.viewCard(index++);
                hands[player - 1].addCard(card);
                try {
                    if (card.getValue().equals("Ace") & (card.getSuit().equals("Spades"))) {
                        throw new JokerException("Can't use Joker");
                    }
                } catch (JokerException jokerException) {
                    System.out.println("Inside catch jokerException");
                    jokerException.printStackTrace();
                }
                System.out.printf("Player %d gets card %s%n%n", player, deck.takeCard(index++));
            }
        }
        System.out.printf("%d cards left in deck%n", deck.currentSize());
        hands[2].viewHand(2);
        System.out.println(deck.findCard(new Card("Queen", "Spades"), hands[2].viewHand(2)));
    }

}