package services;

public interface TerminalInterface {
    String createTerminal(TerminalInterface... terminal);

    PersonInterface[] getAllTerminal();

    String transferToCard(PersonInterface person, String cardNumber, double summa);

    String transferToPhoneNumber(PersonInterface person, String phoneNumber, double summa);
}

