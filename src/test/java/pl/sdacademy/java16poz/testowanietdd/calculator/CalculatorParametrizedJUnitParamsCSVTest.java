package pl.sdacademy.java16poz.testowanietdd.calculator;

/**
 * CalculatorParametrizedJUnitParamsCSVTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 10:05
 **/
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * CalculatorParametrizedJParamsTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 12:45
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamsCSVTest {

    private Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void testAdd(int numberA, int numberB, String expected) {

        //when
        calc.add(numberA,numberB);

        //then
        String message = String.format("Error %d + %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA+numberB);
        assertEquals(message,expected, calc.display());
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileMultiTest.csv")
    public void testMulti(int numberA, int numberB, String expected) {

        //when
        calc.multi(numberA,numberB);

        //then
        String message = String.format("Error %d * %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA*numberB);
        assertEquals(message,expected, calc.display());
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileDivTest.csv")
    public void testDiv(int numberA, int numberB, String expected) {

        //when
        calc.div(numberA,numberB);

        //then
        String message = String.format("Error %d / %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA/numberB);
        assertEquals(message,expected, calc.display());
    }
}