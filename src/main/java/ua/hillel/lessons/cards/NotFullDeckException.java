package src.main.java.ua.hillel.lessons.cards;


public class NotFullDeckException extends Throwable {
    public NotFullDeckException(String nfd) {
        super(nfd);
    }
}
