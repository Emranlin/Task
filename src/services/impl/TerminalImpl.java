package services.impl;

import classes.Person;
import classes.Terminal;
import services.TerminalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class TerminalImpl implements TerminalInterface {
    private ArrayList<Terminal> terminals = new ArrayList<>();

    public ArrayList<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(ArrayList<Terminal> terminals) {
        this.terminals = terminals;
    }

    @Override
    public String createTerminal(Terminal... terminal) {
        terminals.addAll(Arrays.asList(terminal));
        return "Terminal successfully create";
    }

    @Override
    public ArrayList<Terminal> getAllTerminal() {
        return terminals;
    }


    @Override
    public String transferToCard(Person person, String cardNumber, double summa) {
        try {
            if (cardNumber.matches("[1-9]+")) {
                throw new InputMismatchException("Don't write number!");
            }

            if (person.getBankAccount().getCardNumber().equals(cardNumber)) {
                String s = person.getBankAccount().getCardNumber() + summa;


            }

            return null;

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return "Successful";
    }


    @Override
    public String transferToPhoneNumber(Person person, String phoneNumber, double summa) {
        try{
            if(summa < 0 ) {
                throw new Exception("You give negative number!");}
        if(person.getPhoneNumber().equals(phoneNumber)){
            double s= Double.parseDouble((person.getPhoneNumber()+summa));
        }
        }catch (Exception e){
        e.printStackTrace();
    }
        return "Your money successfully take away";
    }

    @Override
    public String toString() {
        return "TerminalImpl{" +
                "terminals=" + terminals +
                '}';
    }
}
