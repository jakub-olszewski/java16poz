package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

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
        calc = new CalculcatorImpl();
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

}