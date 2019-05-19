package pl.sdacademy.java16poz.programowanie1.listy.listnumber;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.programowanie1.TestBase;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumber;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumberImpl;

import static org.junit.Assert.*;

/**
 * ListNumberTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:40
 **/
public class ListNumberTest extends TestBase {

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
    public void shouldAddHundredNumberTest() {

        // when
        for (int i=0 ;i <100;i++){
            list.add(i);
        }

        // then
        assertTrue("Lista powinna miec tylko 100 elementów",list.size()==100);


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

    /**
     * Test sprawdza usunięcie jednego elementu
     * 1. dodać jeden element
     * 2. usuwać element o indeksie 0
     * 3. assert pobrania lub assert rozmiaru równy
     */
    @Test
    public void shouldDeleteOneNumberTest() {
        // TODO testy usuwania jednego elementu z list
        int numberIn1 = 1;

        //when
        list.add(numberIn1);
        list.delete(0);

        //then
        assertTrue("Lista powinna być pusta po usunięciu jedynego elementu", list.isEmpty());
    }

    @Test
    public void shouldDeleteTwoNumberTest() {
        // TODO testy usuwania dwóch elementów z listy
        int numberIn1 = 1;
        int numberIn2 = 2;


        //when
        list.add(numberIn1);
        list.add(numberIn2);

        list.delete(0);// ponieważ po usunieciu pierszego (zerowy indeks) drugi staje się pierwszym
        list.delete(0);

        //then
        assertTrue("Lista powinna być pusta po usunięciu jedynego elementu", list.isEmpty());
    }

    @Test
    public void shouldDeleteSecondNumberFromThreeTest() {
        // TODO testy usuwania dwóch elementów z listy
        int numberIn1 = 1;
        int numberIn2 = 2;
        int numberIn3 = 3;


        //when
        list.add(numberIn1);
        list.add(numberIn2);
        list.add(numberIn3);

        int numberGet3 = list.get(2);

        list.delete(1);// ponieważ po usunieciu pierszego (zerowy indeks) drugi staje się pierwszym

        //then
        assertTrue("Po usunięciu elementu drugiego trzeci powinien być równy drugiemu", list.get(1)==numberGet3);
        assertTrue("Lista po usunięciu elementu powinna mieć 2 elementy", list.size()==2);

    }

    @Test
    public void shouldSetOneNumberTest() {
        // TODO testy usuwania jednego elementu z list
        int numberIn1 = 1;
        int valueSet = 7;

        //when
        list.add(numberIn1);
        list.set(0,valueSet);

        //then
        assertTrue("Po zmianie element indeks 0 powinien miec wartość 7", list.get(0)==valueSet);

    }

    @Test
    public void shouldSetTwoNumberTest() {
        // TODO testy usuwania dwóch elementów z listy
        int numberIn1 = 1;
        int valueSet1 = 7;
        int numberIn2 = 3;
        int valueSet2 = 5;

        //when
        list.add(numberIn1);
        list.add(numberIn2);
        list.set(0,valueSet1);
        list.set(1,valueSet2);

        //then
        assertTrue("Po zmianie element indeks 0 powinien miec wartość 7", list.get(0)==valueSet1);
        assertTrue("Po zmianie element indeks 1 powinien miec wartość 5", list.get(1)==valueSet2);


    }


}