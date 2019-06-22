package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * ExampleWithoutMockito
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 13:38
 **/
public class ExampleWithoutMockito {

    List<String> mockedList;

    @Before
    public void before(){
        mockedList = new ArrayList<>();
    }

    @Test
    public void whenUseWithoutMockAnnotationTest(){
        mockedList.add("one");
        assertEquals(1, mockedList.size());
    }
}
