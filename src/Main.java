import classes.BankAccount;
import classes.Person;
import classes.Terminal;
import enums.Bank;
import enums.Mobile;
import services.impl.BankAccountImpl;
import services.impl.PersonImpl;
import services.impl.TerminalImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(Bank.BAKAY_BANK, 2000, "9012", "j1245");
        BankAccount bankAccount2 = new BankAccount(Bank.OPTIMA_BANK, 1500, "6245", "ali45");
        BankAccount bankAccount3 = new BankAccount(Bank.KYRGYZSTAN_BANK, 1200, "8045", "m1");
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>(Arrays.asList(bankAccount1, bankAccount2, bankAccount3));

        Person person1 = new Person("Zhiidegul", "Zhalilova", "zhijdegul@gmail.com",
                "509470303", "j1245", bankAccount1);
        Person person2 = new Person("Alibek", "Altynbek uulu", "alibek@gmail.com",
                "507523694", "ali45", bankAccount3);
        Person person3 = new Person("Meerim", "Kaparova", "meerim@gmail.com",
                "509470303", "m1", bankAccount3);
        ArrayList<Person> people = new ArrayList<Person>(Arrays.asList(person1, person2, person3));

        Terminal terminal1 = new Terminal(Mobile.BEELINE, "black");
        Terminal terminal2 = new Terminal(Mobile.MEGACOM, "blue");
        ArrayList<Terminal> terminals = new ArrayList<Terminal>(Arrays.asList(terminal1, terminal2));

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        try {
            BankAccountImpl bank = new BankAccountImpl();
            PersonImpl person = new PersonImpl();
            TerminalImpl terminal = new TerminalImpl();
            while (true) {
                switch (scanner1.nextInt()) {
                    case 1 -> System.out.println(bank.createBankAccount(bankAccount1, bankAccount2, bankAccount3));
                    case 2 -> System.out.println(bank.getAllBankAccount());
                    case 3 -> System.out.println(bank.credit(person1, Bank.BAKAY_BANK, 10, 1000));
                    case 4 -> System.out.println(person1.getBankAccount().getBalance());
                    case 5 -> System.out.println(person.createPerson(person1, person2, person3));
                    case 6 -> System.out.println(person.getAllPeople());
                    case 7 -> System.out.println(terminal.createTerminal(terminal1, terminal2));
                    case 8 -> System.out.println(terminal.getAllTerminal());

                    case 9 -> {
                        System.out.println("PLease input credit card number");
                        System.out.println("Please enter the summa");
                        System.out.println(terminal.transferToCard(person1, scanner.nextLine(), scanner1.nextInt()));
                        System.out.println(person1);
                    }
                    case 10 -> {
                        System.out.println("PLease input credit card number");
                        System.out.println("Please enter the summa");
                        System.out.println(terminal.transferToPhoneNumber(person2, scanner.nextLine(), scanner1.nextInt()));
                        System.out.println(person2);
                    }

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You have mistake");
        }
    }static {
        System.out.println("""
                1.Create bank account.
                2.Get all bank account.
                3.Summa
                4.Credit method.
                5.Credit card summa
                6.Get all person.
                7.Create Terminal
                8.Get All
                9.Transfer to card
                10.Transfer to phone
               
                """);
    }
}


