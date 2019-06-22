package pl.sdacademy.java16poz.testowanietdd.mockito;

import net.bytebuddy.asm.Advice;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.sdacademy.java16poz.testowanietdd.calculator.Calculator;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * MockitoAnnotationCaptorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 14:32
 **/
public class MockitoAnnotationCaptorTest {

    @Before
    public void before(){
        // zainicjować atrapy wykorzystywane w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    List mockedListObject;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Test
    public void whenUseCaptorAnnotation(){
        mockedListObject.add("one");

        //uruchamiamy przechwytywacza
        verify(mockedListObject).add(argumentCaptor.capture());
        assertEquals("one",argumentCaptor.getValue());
    }

    @Test
    public void calculatorPressNumberCaptorTest(){
        //inicjacja mock Calculatora
        Calculator calc = mock(Calculator.class);

        //powołanie przechwytywania
        ArgumentCaptor<Object> argumentCaptor = ArgumentCaptor.forClass(Integer.class);

        //wykonać metodę pressNumber(2)
        calc.pressNumber(2);

        //weryfikacja przechwyconego argumentu
        verify(calc).pressNumber(argumentCaptor.capture());

        assertEquals(2,argumentCaptor.getValue());
    }
}
