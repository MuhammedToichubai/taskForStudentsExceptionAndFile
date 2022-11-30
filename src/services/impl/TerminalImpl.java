package services.impl;

import services.PersonInterface;
import services.TerminalInterface;

public class TerminalImpl implements TerminalInterface {

    @Override
    public String createTerminal(TerminalInterface... terminal) {
        return null;
    }

    @Override
    public PersonInterface[] getAllTerminal() {
        return new PersonInterface[0];
    }

    @Override
    public String transferToCard(PersonInterface person, String cardNumber, double summa) {
        return null;
    }

    @Override
    public String transferToPhoneNumber(PersonInterface person, String phoneNumber, double summa) {
        return null;
    }
}
