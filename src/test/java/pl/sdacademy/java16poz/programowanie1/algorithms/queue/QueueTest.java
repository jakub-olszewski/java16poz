package pl.sdacademy.java16poz.programowanie1.algorithms.queue;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.wstep.obiekty.Person;
import pl.sdacademy.java16poz.programowanie1.TestBase;

import java.util.Optional;

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
        assertTrue("Kolejka powinna być pusta",queue.isEmpty());

    }

    /**
     * Test kolejkuje jeden element
     */
    @Test
    public void shouldEnqueueOneElementTest(){
        //when
        queue.enqueue(julietPerson);

        //then
        assertTrue("Kolejka nie powinna być pusta", !queue.isEmpty());

    }

    /**
     * Test kolejkuje dwa elementy
     */
    @Test
    public void shouldEnqueueTwoElementTest(){
        //when
        queue.enqueue(julietPerson);
        queue.enqueue(jesonPerson);

        //then
        assertTrue("Kolejka nie powinna być pusta", !queue.isEmpty());

    }

    /**
     * Test kolejkuje trzy elementy
     */
    @Test
    public void shouldEnqueueThreeElementTest(){
        //when
        queue.enqueue(julietPerson);
        queue.enqueue(jesonPerson);
        queue.enqueue(joannPerson);

        //then
        assertTrue("Kolejka nie powinna być pusta", !queue.isEmpty());

    }

    /**
     * Test kolejkuje jeden element oraz dekolejkuje go
     */
    @Test
    public void shouldEnqueueDequeueOneElementTest(){
        //when
        queue.enqueue(julietPerson);
        queue.dequeue();

        //then
        assertTrue("Kolejka powinna być pusta", queue.isEmpty());

    }

    /**
     * Test kolejkuje jeden element i podgląda peek()
     */
    @Test
    public void shouldEnqueueOneElementAndPeekTest(){
        //when
        queue.enqueue(julietPerson);
        Optional<Person> optionalPersonFromQueue = queue.peek();
        Person personFromQueue = optionalPersonFromQueue.get();

        //then
        assertTrue("Kolejka powinna nie być pusta", !queue.isEmpty());
        assertTrue("Podczas podejrzenia powinien być element", optionalPersonFromQueue.isPresent());
        assertTrue("Podczas podejrzenia elementem powinna być juliet", personFromQueue.equals(julietPerson));
        assertTrue("Osoba na początku kolejki ma na imię Juliet", personFromQueue.getName().equals("Juliet"));


    }

    /**
     * Test kolejkuje dwa elementy i podgląda peek()
     */
    @Test
    public void shouldEnqueueTwoElementAndPeekTest(){
        //when
        queue.enqueue(julietPerson);
        queue.enqueue(joannPerson);

        Optional<Person> optionalPersonFromQueue = queue.peek();
        Person personFromQueue = optionalPersonFromQueue.get();

        //then
        assertTrue("Kolejka powinna nie być pusta", !queue.isEmpty());
        assertTrue("Podczas podejrzenia powinien być element", optionalPersonFromQueue.isPresent());
        assertTrue("Podczas podejrzenia elementem powinna być juliet", personFromQueue.equals(julietPerson));
        assertTrue("Osoba na początku kolejki ma na imię Juliet", personFromQueue.getName().equals("Juliet"));


    }

    /**
     * Test kolejkuje dwa elementy i podgląda peek()
     */
    @Test
    public void shouldEnqueueTwoElementAndDequeueTest(){
        //when
        queue.enqueue(julietPerson);
        queue.enqueue(joannPerson);

        queue.dequeue();

        //then
        assertTrue("Kolejka powinna nie być pusta", !queue.isEmpty());
    }
}