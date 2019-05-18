package pl.sdacademy.java16poz.programowanie1.listy.listnumber;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumber;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumberImpl;

import static org.junit.Assert.*;

/**
 * ListNumberTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:40
 **/
public class ListNumberTest {

    ListNumber list;

    @Before
    public void setUp(){
        // given
        list = new ListNumberImpl();
    }

    @Test
    public void shouldAddNumberTest() {

        // when
        list.add(1);

        // then
        assertTrue("Lista powinna miec tylko jeden element",list.size()==1);
        /**
         * assertTrue
         * - oczekujemy że argument metody jest prawdą
         */
    }

    @Test
    public void shouldAddTwoNumberTest() {

        // when
        list.add(1);
        list.add(2);

        // then
        assertTrue("Lista powinna miec tylko dwa elementy",list.size()==2);


        /**
         * assertTrue
         * - oczekujemy że argument metody jest prawdą
         */
    }

    @Test
    public void shouldGetOneNumberTest() {
        // given
        int numberIn1 = 1;

        // when
        list.add(numberIn1);
        int numberGet1 = list.get(0);

        // then
        assertTrue("Pobrany pierwszy element powinien być równy "+numberIn1, numberIn1==numberGet1);
        /**
         * assertTrue
         * - oczekujemy że argument metody jest prawdą
         */
    }

    @Test
    public void shouldGetTwoNumberTest() {
        // given
        int numberIn1 = 1;
        int numberIn2 = 2;

        // when
        list.add(numberIn1);
        list.add(numberIn2);

        int numberGet1 = list.get(0);
        int numberGet2 = list.get(1);

        // then
        assertTrue("Pobrany pierwszy element powinien być równy "+numberIn1, numberIn1==numberGet1);
        assertTrue("Pobrany drugi element powinien być równy "+numberIn2, numberIn2==numberGet2);
        /**
         * assertTrue
         * - oczekujemy że argument metody jest prawdą
         */
    }

    @Test
    public void shouldDeleteOneNumberTest() {
        // TODO testy usuwania jednego elementu z list
    }

    @Test
    public void shouldDeleteTwoNumberTest() {
        // TODO testy usuwania dwóch elementów z listy
    }

    @Test
    public void shouldSetOneNumberTest() {
        // TODO testy usuwania jednego elementu z list
    }

    @Test
    public void shouldSetTwoNumberTest() {
        // TODO testy usuwania dwóch elementów z listy
    }


}