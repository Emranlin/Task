package services.impl;

import classes.BankAccount;
import classes.Person;
import services.PersonInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonImpl implements PersonInterface  {
    private ArrayList<Person> people=new ArrayList<>();

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    @Override
    public String createPerson(Person... person) {
        people.addAll(Arrays.asList(person));
        return "Person create successful";
    }

    @Override
    public ArrayList<Person> getAllPeople() {
        return people ;

        }





    @Override
    public String toString() {
        return "PersonImpl{" +
                "people=" + people +
                '}';
    }
}
