package pl.sdacademy.java16poz.programowanie1.lists.stack;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.obiekty.Book;

import static org.junit.Assert.assertTrue;

/**
 * StackTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 09:26
 **/
public class StackTest {

    private Book javaPodstawyBook;
    private Stack stack;
    private Book testyTddBook;

    @Before
    public void setUp() throws Exception {
        //given
        //tworzymy obiekt który testujemy - tworzymy Stos StackImpl
         stack = new StackImpl();
        //stos generyczny to znaczy, że może zawierać dowolny typ
        //może być to stos książek, palet
        //stos
        // książek Book (ISBN, author, title, date (Date/String))
        //Book posiada konstruktor oraz metodę toString()
        //tworzymy obiekty do stosu
        javaPodstawyBook = new Book("9788328341449","Mirosław J. Kubiak","Java. Zadania z programowania z przykładowymi rozwiązaniami. Wydanie 2");
        testyTddBook = new Book("9788328323414","Alex Garcia Viktor Farcic","TDD Programowanie w Javie sterowane testami");
    }

    /**
     * Test sprawdza czy stworzony stos jest pusty
     */
    @Test
    public void emptyStackOnCreateTest(){
        //when
        boolean isEmpty = stack.isEmpty();

        //then
        //jeśli isEmpty nie jest prawdą wypisze message w konsoli
        assertTrue("Stos powinien być pusty",isEmpty);
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
     *  wstawiania 2 elementów i zdjęcie 4 elementów
     * powinno być pusto na stosie
     */
    @Test
    public void pushFourElementPeekAndPopStackTest(){
        //when


        //then
        //optional is empty
    }

}