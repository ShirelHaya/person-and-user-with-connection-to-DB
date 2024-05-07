package DAO;

import entities.Person;
import entities.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PersonDAODB {

    private List<Person> _Persons;
    private List<User> _Users;

    //    private static Backend_DAO_List backend_dao_list= new Backend_DAO_List();
//    public static Backend_DAO_List getBackend_dao_list(){
//        return  backend_dao_list;
//    }
    private static PersonDAODB bdl_singleton;  // המופע היחיד

    public static PersonDAODB get_bdl_singleton() // הפונקציה שמחזירה את המופע היחיד
    {
        if (bdl_singleton == null)
            bdl_singleton = new PersonDAODB();
        return bdl_singleton;
    }

    //בונה private
    private PersonDAODB() {

        _Persons = new ArrayList<>();
        _Users = new ArrayList<>();
        _Persons.add(new Person(1234,"example",20,false, LocalDate.of(2003,12,12)));
        _Users.add(new User("hello",1234));
    }

    public boolean IfPersonExisst(Integer id){
        for (Person p:
             _Persons) {
            if(id == p.getId())
                return true;
        }
        return false;
    }
    public boolean IfPersonExists(String email, int password){
        for (User u:
             _Users) {
            if(email == u.getUsername() && password == u.getPassword())
                return true;
        }
        return false;
    }
    public void CreateNewPerson(Person person){
        _Persons.add(person);
    }
    public void UpdatePerson(Integer id, String name, Integer age, boolean male, LocalDate birthday){
            for (Person person:
                 _Persons) {
                if(person.getId() == id){
                    if(!name.isBlank())
                        person.setName(name);
                    if(age!= null)
                        person.setAge(age);
                    person.setMale(male);
                    if(birthday!=null)
                        person.setBirthday(birthday);

            }
            }
    }
    public void DeletePerson(Person person){
        _Persons.remove(person);
    }
    public Person GetPersonById(Integer id){
        for (Person p:
                _Persons) {
            if(id == p.getId())
                return p;
        }
        System.out.println("this person dont exists!");
        return null;
    }
    public Person GetPersonByEmailPassword(String email, Integer password){
        Integer i= 0, j=0;
        for (User user:
             _Users) {
            if(!(user.getPassword() == password && user.getUsername()== email))
                i++;
        }
        for (Person person:
             _Persons) {
            if(j==i)
                return person;
            else
                j++;
        }
        return null;
    }
    public List<Person> GetAllPersons(){
        return _Persons;
    }

}
