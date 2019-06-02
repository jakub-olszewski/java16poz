package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * Person
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 13:12
 **/
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String surname;
    int age;
}
