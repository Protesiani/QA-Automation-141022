package src.main.java.ua.hillel.lessons.cards;

public class Hand extends CardsHolder {

    public Hand() {
        super(52);
    }

    public void viewHand() {
        for (int i = 0; i < inIndex; i++) {
            System.out.println(String.format("Player has card %s%n", deck[i]));
        }
    }

}
