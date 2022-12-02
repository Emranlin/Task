package services.impl;

import classes.BankAccount;
import classes.Person;
import enums.Bank;
import services.BankAccountInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccountImpl implements BankAccountInterface {
    private List<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public String createBankAccount(BankAccount... bankAccount){
        bankAccounts.addAll(Arrays.asList(bankAccount));
        return "Bank Accounts Created Successfully";
    }

    @Override
    public List<BankAccount> getAllBankAccount() {
        return bankAccounts;
    }

    @Override
    public double credit(Person person, Bank bank, int deposit, double summa) {
        try{
            if(summa < 0 || deposit < 0 ) throw new Exception("Invalid Credit Info is Given!");
            person.getBankAccount().setBalance(person.getBankAccount().getBalance() + summa);
        }catch (Exception e){
            e.printStackTrace();
        }
        return summa;
    }
}


