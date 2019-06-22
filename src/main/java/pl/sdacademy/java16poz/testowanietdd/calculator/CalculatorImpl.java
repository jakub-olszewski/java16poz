package pl.sdacademy.java16poz.testowanietdd.calculator;

/**
 * CalculcatorImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 12:23
 **/
public class CalculatorImpl implements Calculator {

    public static String DIV_ERROR_MESSAGE = "Nie dziel przez zero";

    //stan wyświetlacza
    String display;

    @Override
    public void pressNumber(Object number) {
        // dopisuje do stanu wyświetlacza
        StringBuilder builder = new StringBuilder();
        display = builder.append(display).append(number).toString();
    }

    //konstruktor inicjalizuje stan wyswietalacza - pusty
    public CalculatorImpl() {
        clear();
    }

    @Override
    public String display() {
        // zwróć stan wyświetlacza
        return display;
    }

    @Override
    public void add(int numberA, int numberB) {
        int result = numberA+numberB;
        pressNumber(result);
    }

    @Override
    public void sub(int numberA, int numberB) {
        pressNumber(numberA-numberB);
    }

    @Override
    public void div(int numberA, int numberB) throws IllegalArgumentException{
        // implementacje zrzucanie wyjatku IllegalArgumentException
        // podczas dzielenia przez zero
        if(numberB==0){
            throw new IllegalArgumentException(DIV_ERROR_MESSAGE);
        }else
        {
            pressNumber(numberA / numberB);
        }

    }

    @Override
    public void clear() {
        display="";
    }

    @Override
    public void multi(int numberA, int numberB) {
        pressNumber(numberA*numberB);
    }
}