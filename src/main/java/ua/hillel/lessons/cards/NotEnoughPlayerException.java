package src.main.java.ua.hillel.lessons.cards;


public class NotEnoughPlayerException extends Throwable {
    public NotEnoughPlayerException(String nep) {
        super(nep);
    }
}
