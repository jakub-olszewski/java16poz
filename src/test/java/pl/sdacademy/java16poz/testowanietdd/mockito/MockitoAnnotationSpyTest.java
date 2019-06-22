package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * MockitoAnnotationSpyTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 14:15
 **/
public class MockitoAnnotationSpyTest {

    // częściowa atrapa dlatego inicjalizujemy
    @Spy
    public List<String> spyList = new ArrayList<String>();

    @Before
    public void before(){
        // zainicjować atrapy wykorzystywane w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseSpyAnnotationInjected(){
        spyList.add("one");
        spyList.add("two");

        assertEquals(2,spyList.size());
        when(spyList.size()).thenReturn(2019);
        //doReturn(2019).when(spyList).size(); // to samo co wyżej
        assertEquals(2019,spyList.size());
    }

    @Test
    public void whenUseSpyAnnotation(){
        List<String> spyListOnlyHere = spy(new ArrayList<String>());
        spyListOnlyHere.add("one");
        spyListOnlyHere.add("two");

        assertEquals(2,spyListOnlyHere.size());
    }
}
