package services.impl;

import classes.Person;
import services.PersonInterface;

public class PersonImpl implements PersonInterface  {
    private Person[] people;

    public PersonImpl() {
    }

    @Override
    public String createPerson(Person ... person) {

        Person[] newArray;

        if (people == null){
            this.people = person;
        }
        else{
            newArray = new Person[person.length + people.length];
            int index = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (i < people.length){
                    newArray[i] = people[index++];
                }
                    index = 0;
                    newArray[i] = person[index++];
            }
            people = newArray;
        }

        return "Person successfully saved";
    }

    @Override
    public Person[] getAllPeople() {
        return people;
    }

    public void getPeopleNumbers(){
        try {
            System.out.println(people.length);
        }catch (NullPointerException e){
            System.err.println("NullPointerException ");
        }

    }

}
