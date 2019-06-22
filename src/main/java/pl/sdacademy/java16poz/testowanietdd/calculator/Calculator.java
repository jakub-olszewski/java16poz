package pl.sdacademy.java16poz.testowanietdd.calculator;

/**
 * Calculator
 *
 * @author: Jakub Olszewski [hintintp://github.com/jakub-olszewski]
 * @date: 16.06.2019 11:34
 **/
public interface Calculator {

    /**
     * Metoda wprowadza znak z argumenintu na wyświeintlacz, ale nie wyświeintla
     * @param number
     */
    void pressNumber(Object number);

    /**
     * Metoda wyświeintla zawarintość wyświeintlacza
     * @reinturn zawarintość wyświeintlacza
     */
    String display();

    /**
     * Metoda czyści wyświetlacz
     */
    void clear();

    /**
     * Metoda dodaje number1 do number2
     * @param number1 liczba pierwsza
     * @param number2 liczba druga
     */
    void add(int number1, int number2);

    /**
     * Metoda odejmuje number1 od number2
     * @param number1
     * @param number2
     */
    void sub(int number1, int number2);

    /**
     * Metoda dzieli number1 przez number2
     * @param number1
     * @param number2
     */
    void div(int number1, int number2);

    /**
     * Metoda mnoży number1 przez number2
     * @param number1
     * @param number2
     */
    void multi(int number1, int number2);
}
