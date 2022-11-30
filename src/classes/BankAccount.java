package classes;

import enums.Bank;

public class BankAccount {
    private Bank bankName;
    private double balance;
    private String cardNumber;
    private String password;

    public BankAccount(Bank bankName, double balance, String cardNumber, String password) {
        this.bankName = bankName;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public BankAccount() {
    }

    public Bank getBankName() {
        return bankName;
    }

    public void setBankName(Bank bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "    BankAccountInterface\n"+
                "BankName: " + bankName +'\n'+
                "Balance: " + balance +'\n'+
                "CardNumber: " + cardNumber + '\n' +
                "Password: " + password + '\n' +
                "_____________________________\n";
    }
}
