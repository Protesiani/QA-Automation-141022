package src.main.java.ua.hillel.lessons.cards;


public class Poker {
    public static void main(String[] args) throws NotFullDeckException, JokerException, DeckNotShuffleException, NotEnoughPlayerException {
        PokerMachine machine = new PokerMachine();
        Deck deck = machine.createDeck();
        machine.shuffleDeck(deck);
        deck.findCards("Queen", "Spades", deck.getCards(), deck.currentSize());
        machine.serveCardsToPlayer(3, deck);
    }
}
