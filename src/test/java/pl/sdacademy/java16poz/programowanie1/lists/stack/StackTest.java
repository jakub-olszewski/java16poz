package pl.sdacademy.java16poz.programowanie1.lists.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * StackTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 09:26
 **/
public class StackTest {

    @Before
    public void setUp() throws Exception {
        //given
        //tworzymy obiekt który testujemy - tworzymy Stos StackImpl
        //stos generyczny to znaczy, że może zawierać dowolny typ
        //może być to stos książek, palet
        //stos książek Book (ISBN, author, title, date (Date/String))
        //Book posiada konstruktor oraz metodę toString()
        //tworzymy obiekty do stosu
    }

    /**
     * Test sprawdza czy stworzony stos jest pusty
     */
    @Test
    public void emptyStackOnCreateTest(){
        //when

        //then
    }

    /**
     * Test wstawia jeden element na stos (nie pusty)
     */
    @Test
    public void pushOneElementOnNotEmptyStackTest(){
        //when

        //then
    }

    /**
     * Test pobiera element na pustym stosie
     */
    @Test
    public void popOneElementOnEmptyStackTest(){
        //when

        //then
        //optional is empty
    }

    /**
     * Test wstawiamy element na pusty stos
     */
    @Test
    public void pushOneElementOnEmptyStackTest(){
        //when

        //then
        //optional is empty
    }

    /**
     * Test wstawiania 2 elementów i jeden podgląd
     * wstawiania 2 elementów i zdjęcie 4 elementów
     * powinno być pusto na stosie
     */

}