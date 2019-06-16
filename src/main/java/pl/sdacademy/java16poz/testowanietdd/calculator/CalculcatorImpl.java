package pl.sdacademy.java16poz.testowanietdd.calculator;

import com.sun.deploy.util.StringUtils;

/**
 * CalculcatorImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 12:23
 **/
public class CalculcatorImpl implements Calculator {

    //wartość początkowa wyświetlacza
    //w konstruktor
    private String display;

    public CalculcatorImpl(){
        display = new String();
    }

    @Override
    public void pressNumber(Object number) {
        //dopisuj do wyświetlacza kolejne wpisane
        //znaki z użyciem StringBuildera
        StringBuilder builder = new StringBuilder(display);
        builder.append(number);
        display = builder.toString();
        //poniżej w postaci jednej linii
        //display = new StringBuilder(display).append(number).toString();
    }

    @Override
    public String display() {
        //zwróć stan wyświetlacza
        return display;
    }

    @Override
    public void add(Object number1, Object number2) {

    }

    @Override
    public void sub(Object number1, Object number2) {

    }

    @Override
    public void div(Object number1, Object number2) {

    }

    @Override
    public void multi(Object number1, Object number2) {

    }
}
