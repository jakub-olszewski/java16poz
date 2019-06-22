package pl.sdacademy.java16poz.testowanietdd.calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * CalculatorParameterizedJUnitParamTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 15:47
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParameterizedJUnitParamTest {
    Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    @Test
    @Parameters({
            "1, 1, 2",
            "2, 2, 4"
    })
    public void testAdd(int numberA, int numberB, String expected) {

        //when
        calc.clear();
        calc.add(numberA,numberB);
        String actual = calc.display();

        //then
        String message = String.format(
                "Wartość %d+%d powinna być równa %s",numberA,numberB,expected);
        assertEquals(message,expected, actual);
    }

    @Test
    @Parameters({
            "1, 1, 0",
            "5, 2, 3"
    })
    public void testSub(int numberA, int numberB, String expected) {

        //when
        calc.clear();
        calc.sub(numberA,numberB);
        String actual = calc.display();

        //then
        String message = String.format(
                "Wartość %d-%d powinna być równa %s",numberA,numberB,expected);
        assertEquals(message,expected, actual);
    }
}
