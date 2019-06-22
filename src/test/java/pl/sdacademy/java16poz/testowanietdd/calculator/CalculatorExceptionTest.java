package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static pl.sdacademy.java16poz.testowanietdd.calculator.CalculatorImpl.DIV_ERROR_MESSAGE;

/**
 * CalculatorExceptionTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 12:26
 **/
public class CalculatorExceptionTest {

    private Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    //test ogólny czy występuje wyjątek
    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveExceptionWhenDevideByZero() {
        calc.div(2019, 0);
    }

    @Test
    public void shouldHaveExceptionWhenDevideByZeroAssert() {

        try {
            calc.div(100, 0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().equals(DIV_ERROR_MESSAGE));
        }

    }

    // testowanie wyjątku przez użycie reguły
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldHaveExceptionWhenDevideByZeroRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(DIV_ERROR_MESSAGE);
        calc.div(100, 0);
    }
}
