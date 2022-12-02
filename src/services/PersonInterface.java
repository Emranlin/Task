package services;

import classes.Person;

import java.util.ArrayList;

public interface PersonInterface {
    String createPerson(Person... person);
    ArrayList<Person> getAllPeople();
}
