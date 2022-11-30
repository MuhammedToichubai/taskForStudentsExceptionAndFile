import classes.Person;
import services.impl.PersonImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PersonImpl person = new PersonImpl();

        person.getPeopleNumbers();
        person.createPerson(
                new Person("Baytik", "Taalaibekov", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Syimyk", "Jumbek uul", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Nurseyit", "Sadirov", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft")
        );

        person.getPeopleNumbers();

       person.createPerson(
                new Person("Baytik", "Taalaibekov", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Syimyk", "Jumbek uul", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Nurseyit", "Sadirov", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft"),
                new Person("Aigerim", "Bektenova", "baytik@gmail.com", "+996707255474", "peaksoft")

        );

        for (Person allPerson : person.getAllPeople()) {
            System.out.println(allPerson);
        }

        person.getPeopleNumbers();



    }
}































//    public double credit(int deposit, double summa) {
//        double sum = 0;
//
//        if (Bank.deposit >= deposit && 0 < deposit  && summa >= 50 && summa <= 1000000) {
//            int summaPercentage = (int) (summa * (percentage / 100.0d));
//            int pay = (int) (summa + summaPercentage);
//
//            System.out.printf("""
//                            %s:
//                            процент: %d
//                            Сиз ушул сумма акчаны аласыз: %d
//                            Ал акчаны %d жылдa , %d  сом кылып толойсуз.
//                            Ошондо алган акчанызга %d сом кошулат.
//
//                            """, AIYL_BANK, percentage, (int) summa, deposit, pay, summaPercentage);
//            sum = summa;
//        }
//        return sum;
//    }
