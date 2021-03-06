package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * CalculatorParametersConstructorTest
 *    @Parameterized.Parameters(name = "Test [index]:  {0} + {1} = {2}")
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 14:22
 **/
@RunWith(value = Parameterized.class)
public class CalculatorParametersFieldTest {

    @Parameterized.Parameter(value = 0)
    public int numberA;

    @Parameterized.Parameter(value = 1)
    public int numberB;

    @Parameterized.Parameter(value = 2)
    public String expectedResult;

    @Parameterized.Parameters(name = "Test {index} :  {0} + {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{{1,2,"3"},{4,3,"7"},{9,1,"10"},{2,3,"5"},{2,7,"9"}});
    }

    @Test
    public void shouldAddSuccessedExcecuteTest(){

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
