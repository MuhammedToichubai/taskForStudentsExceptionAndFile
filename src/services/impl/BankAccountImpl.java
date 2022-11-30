package services.impl;

import classes.BankAccount;
import classes.Person;
import enums.Bank;
import services.BankAccountInterface;

public class BankAccountImpl implements BankAccountInterface {

    @Override
    public String createBankAccount(BankAccount... bankAccount) {
        return null;
    }

    @Override
    public BankAccount[] getAllBankAccount() {
        return new BankAccount[0];
    }

    @Override
    public double credit(Person person, Bank bank, int deposit, double summa) {
        return 0;
    }
}
