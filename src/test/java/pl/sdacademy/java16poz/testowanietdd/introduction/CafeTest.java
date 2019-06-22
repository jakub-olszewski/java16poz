package pl.sdacademy.java16poz.testowanietdd.introduction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CafeTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 10:20
 **/
public class CafeTest {

    private Cafe cafe;

    @Before
    public void before(){
        //given
        cafe = new Cafe();
    }

    /**
     * Test metody która przygotowuje kawę
     */
    @Test
    public void shouldServeCoffee(){

        //when
        cafe.serveCoffee();

        //then
        assertTrue("Kawa powinna być zaserwowana",cafe.canServeCoffee());
    }

    /**
     * Test sprawdzenia nie przygotowania kawy
     */
    @Test
    public void shouldNotServeCoffee(){

        //when
        //cafe.serveCoffee();

        //then
        assertFalse("Kawa nie powinna być zaserwowana",cafe.canServeCoffee());
    }
}
