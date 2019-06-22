package pl.sdacademy.java16poz.testowanietdd.matchers;

import java.util.Date;

/**
 * Person
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 13:20
 **/
public class Person {

    String name;
    int age;

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    Date birthdayDate;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}