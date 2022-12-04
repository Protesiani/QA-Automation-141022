package ua.hillel.lessons.homework8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logs {

    private final String name;

    public Logs(String name) {
        this.name = name;
    }


    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private static final String ANSI_BLUE = "\u001B[34m";

    private static final String ANSI_WHITE = "\u001B[37m";


    public void info(String msg) {
        System.out.println(ANSI_GREEN + name + ": " + msg);
    }

    public void debug(String msg) {
        System.out.println(ANSI_WHITE + name + ": " + msg);
    }

    public void warn(String msg) {
        System.out.println(ANSI_BLUE + name + ": " + msg);
    }

    public void error(String msg) {
        System.out.println(ANSI_RED + name + ": " + msg);
    }

}
