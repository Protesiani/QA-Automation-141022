package ua.hillel.homework24;

public class Hand extends CardHolder{
    public Hand() {
        super(52);
    }

    public void viewHand() {
        for (int i = 0; i < inIndex; i++) {
            System.out.println(String.format("Player has card %s%n", deck[i]));
        }
    }
}
