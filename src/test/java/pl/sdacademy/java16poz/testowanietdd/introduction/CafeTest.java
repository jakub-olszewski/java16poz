package pl.sdacademy.java16poz.testowanietdd.introduction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CafeTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 10:20
 **/
public class CafeTest {

    /**
     * Test metody która przygotowuje kawę
     */
    @Test
    public void shouldServeCoffee(){
        //given
        Cafe cafe = new Cafe();

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
        //given
        Cafe cafe = new Cafe();

        //when
        //cafe.serveCoffee();

        //then
        assertFalse("Kawa nie została zaserwowana",cafe.canServeCoffee());
    }
}
