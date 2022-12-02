package services;

import classes.Person;
import classes.Terminal;

import java.util.ArrayList;

public interface TerminalInterface {
    String createTerminal(Terminal... terminal);
    ArrayList<Terminal> getAllTerminal();
    String transferToCard(Person person, String cardNumber, double summa);
    String transferToPhoneNumber(Person person, String phoneNumber, double summa);
}
