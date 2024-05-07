package DAO;

import entities.Person;

import java.time.LocalDate;
import java.util.List;

public interface PersonDAO {

    public boolean IfPersonExisst(Integer id);
    public boolean IfPersonExists(String email, int password);
    public void CreateNewPerson(Person person);
    // use id to update specific person and the other params can be null; can fill only what to change.
    public void UpdatePerson(Integer id, String name, Integer age, boolean male, LocalDate birthday);
    public void DeletePerson(Person person);
    public Person GetPersonById(Integer id);
    public Person GetPersonByEmailPassword(String email, Integer password);
    public List<Person> GetAllPersons();
}
