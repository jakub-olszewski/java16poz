package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * MockitoAnnotationInjectMocksTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 14:52
 **/
public class MockitoAnnotationInjectMocksTest {

    @Before
    public void before(){
        // zainicjować atrapy wykorzystywane w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Dane słownika zamokowane
     */
    @Mock
    Map<String,String> wordMap;

    /**
     * Słownik który ma wstrzykniete słowa z wordMap
     */
    @InjectMocks
    MyDictionary dic = new MyDictionary();

    @Test
    public void whenUseInjectMocksAnnotation(){
        // mockowanie słów do słownika
        when(wordMap.get("Help")).thenReturn("Pomocy");
        when(wordMap.get("Programmer")).thenReturn("Programista");

        assertEquals("Pomocy",dic.getTranslation("Help"));
        assertEquals("Programista",dic.getTranslation("Programmer"));

    }

    public class MyDictionary{

        public MyDictionary(Map<String, String> wordMap) {
            this.wordMap = wordMap;
        }

        public MyDictionary() {
            wordMap = new HashMap<>();
        }

        Map<String,String> wordMap;

        public String getTranslation(String word){
            return wordMap.get(word);
        }

    }


}
