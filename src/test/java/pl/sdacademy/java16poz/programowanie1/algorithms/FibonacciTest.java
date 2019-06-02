package pl.sdacademy.java16poz.programowanie1.algorithms;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.programowanie1.TestBase;

/**
 * FibonacciTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 02.06.2019 12:06
 **/
public class FibonacciTest extends TestBase {

    int[] numbers;
    private Fibonacci fibonacci;

    @Before
    public void setup(){
        numbers = initNumbers(0,1,1,2,3,5,8,13,21,34);
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciTest(){
        int value = fibonacci.recursive(9);
        // wykorzystując pętle utwórz tablice wypełnioną
        // petla od 0 do 9
        // liczbami fibonaccci
        System.out.println(value);
    }
}
