package services;

import classes.BankAccount;
import classes.Person;
import enums.Bank;

import java.util.ArrayList;
import java.util.List;

public interface BankAccountInterface {
    String createBankAccount(BankAccount... bankAccount);
    List<BankAccount> getAllBankAccount();
    double credit(Person person, Bank bank, int deposit, double summa) ;
}
