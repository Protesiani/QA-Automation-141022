package ua.hillel.lessons.homework6.Poker;

public class Game extends Deck{
    public Game(int noOfCards, int noOfPlayers) {
        super(noOfCards, noOfPlayers);
    }

    public void start() {
        createDeck();
        shuffleDeck();
        serveCards();
    }




    public static void main(String[] args) {
        Game game = new Game(54, 4);
        game.start();

    }

    private  void serveCards() {
        int index = 0;
        for (int round = 1; round <=5; round++) {
            System.out.println("Round " + round);
            for (int player = 1; player<= noOfPlayers; player++) {
                System.out.println(String.format("Player %d gets card %s%n", player, cards[index++]));
            }
            System.out.println("");
        }
    }
}
