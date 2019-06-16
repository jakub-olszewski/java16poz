package pl.sdacademy.java16poz.testowanietdd.calculator;

/**
 * Calculator
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 11:34
 **/
public interface Calculator {

    /**
     * Metoda wprowadza znak z argumentu na wyświetlacz, ale nie wyświetla
     * @param number
     */
    void pressNumber(Object number);

    /**
     * Metoda wyświetla zawartość wyświetlacza
     * @return zawartość wyświetlacza
     */
    String display();

    void add(Object number1, Object number2);
    void sub(Object number1, Object number2);
    void div(Object number1, Object number2);
    void multi(Object number1, Object number2);
}
