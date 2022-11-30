package classes;

public class Person {
     private String firstName;
     private String lastName;
     private String gmail;
     private String phoneNumber;
     private String password;
     private BankAccount bankAccount;

    public Person(String firstName, String lastName, String gmail, String phoneNumber, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Person(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "        PersonInterface\n" +
                "FirstName: " + firstName + '\n' +
                "LastName: '" + lastName + '\n' +
                "Gmail: " +       gmail + '\n' +
                "PhoneNumber: " + phoneNumber + '\n' +
                "Password: " + password + '\n'+
                bankAccount+'\n'+
                "____________________________________\n";
    }
}
