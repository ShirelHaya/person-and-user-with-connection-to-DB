package entities;


import java.time.LocalDate;

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private boolean male;
    private LocalDate birthday;


    public Person(Integer id, String name, Integer age, boolean male, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.male = male;
        this.birthday = birthday;
    }
    public Person() {
        this.id = 1234;
        this.name = "name";
        this.age = 0;
        this.male = false;
        this.birthday = LocalDate.ofEpochDay(2023/12/12);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                ", birthday=" + birthday +
                '}';
    }
}
