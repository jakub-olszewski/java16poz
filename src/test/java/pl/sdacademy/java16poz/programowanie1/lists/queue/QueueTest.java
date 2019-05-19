package pl.sdacademy.java16poz.programowanie1.lists.queue;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.obiekty.Person;
import pl.sdacademy.java16poz.programowanie1.TestBase;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumber;
import pl.sdacademy.java16poz.programowanie1.lists.listnumber.ListNumberImpl;

import static org.junit.Assert.*;

/**
 * QueueTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 13:09
 **/
public class QueueTest extends TestBase {
    Queue<Person> queue;
    private Person julietPerson;
    private Person joannPerson;
    private Person jesonPerson;

    @Before
    public void setUp(){
        // given
        queue = new QueueImpl();
        julietPerson = new Person("Juliet","Michaelle",23);
        joannPerson = new Person("Joann","April",17);
        jesonPerson = new Person("Jeson","September",34);

    }

    /**
     * Test sprawdza czy nowa kolejka jest pusta
     */
    @Test
    public void shouldEmptyNewQueueTest(){

        //when

        //then

    }

    /**
     * Test kolejkuje jeden element
     */
    @Test
    public void shouldEnqueueOneElementTest(){
        //when

        //then

    }

    /**
     * Test kolejkuje dwa elementy
     */
    @Test
    public void shouldEnqueueTwoElementTest(){
        //when

        //then

    }

    /**
     * Test kolejkuje trzy elementy
     */
    @Test
    public void shouldEnqueueThreeElementTest(){
        //when

        //then

    }

    /**
     * Test kolejkuje jeden element oraz dekolejkuje go
     */
    @Test
    public void shouldEnqueueDequeueOneElementTest(){
        //when

        //then

    }

    /**
     * Test kolejkuje jeden element i podgląda peek()
     */
    @Test
    public void shouldEnqueueOneElementAndPeekTest(){
        //when

        //then

    }

    /**
     * Test kolejkuje dwa elementy i podgląda peek()
     */
    @Test
    public void shouldEnqueueTwoElementAndPeekTest(){
        //when

        //then

    }


}