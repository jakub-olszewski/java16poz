package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import pl.sdacademy.java16poz.testowanietdd.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * MockitoAnnotationMockTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 13:47
 **/
public class MockitoAnnotationMockTest {

    @Mock
    List<String> mockedList;

    @Before
    public void before(){
        // zainicjować atrapy wykorzystywane w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");
        verify(mockedList).add("one");
        assertEquals(0,mockedList.size());

        //atrape zachowania na metode size()
        //zamokujemy metodę size()
        when(mockedList.size()).thenReturn(2019);
        assertEquals(2019,mockedList.size());
    }

    @Test
    public void whenUseMockAnnotationOnlyInTest(){
        List onlyHereMockList = Mockito.mock(ArrayList.class);
        onlyHereMockList.add("one");
        verify(onlyHereMockList).add("one");
        assertEquals(0,onlyHereMockList.size());
    }

    @Test
    public void addThreeTimesElementToList(){
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");

        // weryfikacje czy dodalismy 3 napisy
        verify(mockedList, times(3)).add(anyString());
        verify(mockedList, times(1)).add("one");
        //verify(mockedList, never()).remove("one");
    }

    /**
     * Zadanie: Utwórz test wykorzystując atrape kalkulatora
     */
    @Test
    public void calculatorMockitoTest(){
        //zdefiniowanie atrapy Calculator
        Calculator calc = Mockito.mock(Calculator.class);

        //atrapa calculatora wyswietla 2019
        //zamokowanie metody display()
        Mockito.when(calc.display()).thenReturn("2019");

        //wywolujemy i wyswietlamy sout display
        System.out.println("calc display :"+calc.display());

        //weryfikacja czy metoda display()
        //wykonana została tylko raz - użycie times
        verify(calc, times(1)).display();

        //weryfikaca czy metoda pressNumber(null)
        //nigdy nie została wykonana - użycie never()
        verify(calc,never()).pressNumber(null);

        // wykonanie metody zdefiniowanej wyzej
        // weryfikowanie dzialania
    }
}
