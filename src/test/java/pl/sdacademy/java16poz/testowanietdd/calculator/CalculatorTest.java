package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CalculatorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 11:35
 **/
public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before(){
        //given
        calc = new CalculatorImpl();
    }

    @Test
    public void shouldDisplayNumber(){

        //when
        calc.pressNumber(2);
        calc.pressNumber(0);
        calc.pressNumber(1);
        calc.pressNumber(9);

        //when
        String expected = "2019";
        String actual = calc.display();
        assertEquals(String.format("Na wyświetlaczu powinno być 2019 a jest '%s'",actual),expected,actual);
        //assertTrue("", true);

    }

    @Test
    public void shouldNotDisplayNumber(){

        //when
        //nothing

        //then
//        String zawartoscWyswietlacza = calc.display();
//        boolean czyJestPusta = zawartoscWyswietlacza.isEmpty();
//        assertTrue("Wyświetlacz powinien być pusty",czyJestPusta);

        assertTrue("Wyświetlacz powinien być pusty",calc.display().isEmpty());
    }

    @Test
    public void shouldAddSuccessedExecute(){
        add(1, 2, "3");
        // najpierw do interfejsu potem napisać implementacje !

        // i kolejne 4 wykonania
        add(4,3,"7");

        calc.add(9,1);
        assertEquals("Wynik dla 9+1 powienien być 10","10",calc.display());
        calc.clear();

        calc.add(2,3);
        assertEquals("Wynik dla 2+3 powienien być 5","5",calc.display());
        calc.clear();

        calc.add(2,7);
        assertEquals("Wynik dla 2+7 powienien być 9","9",calc.display());
        calc.clear();
    }

    /**
     * Metoda pomocnicza do testów
     * @param number1
     * @param number2
     * @param result
     */
    private void add(int number1, int number2, String result) {
        calc.add(number1,number2);
        assertEquals("Wynik dla "+number1+"+"+number2+" powienien być "+result, result,calc.display());
        calc.clear();
    }

    @Test
    public void shouldSubSuccessedExecute(){

    }

}