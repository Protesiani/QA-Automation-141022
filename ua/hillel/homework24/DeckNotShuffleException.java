package ua.hillel.homework24;

public class DeckNotShuffleException extends Exception{

    public DeckNotShuffleException(String dns) {
        super(dns);
    }
}
