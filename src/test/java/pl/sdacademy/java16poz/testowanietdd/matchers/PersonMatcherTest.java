package pl.sdacademy.java16poz.testowanietdd.matchers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * PersonMatcherTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 13:19
 **/
public class PersonMatcherTest {

    @Spy
    List<Person> personsList = new ArrayList<Person>();

    List<Person> harryFriends = new ArrayList<Person>();
    private Person harry;
    private Person hermiona;
    private Person ron;
    private Person zgredek;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        harry = new Person("Harry", 14);
        personsList.add(harry);
        hermiona = new Person("Hermiona", 14);
        personsList.add(hermiona);
        personsList.add(new Person("Severus", 34));
        personsList.add(new Person("Malfoy", 13));
        zgredek = new Person("Zgredek", 232);
        personsList.add(zgredek);
        ron = new Person("Ron", 15);
        personsList.add(ron);

        harryFriends.add(hermiona);
        harryFriends.add(ron);


    }

    //sprawdz czy lista osob i przyjaciol nie jest pusta ( uzyj : isNotNull isEmpty)
    @Test
    public void listNotEmptyTest() {
        throw new NotImplementedException();
    }

    //sprawdz czy przyjaciele harrego maja mniej niz 16 lat ( uzyj : isLessThan )
    @Test
    public void harryFriendsLess16yearsOldTest(){
        throw new NotImplementedException();
    }

    //sprawdz czy zgredek ma wiecej niz 100 lat ( uzyj : isGreaterThan )
    @Test
    public void zgredekHaveMoreThan100yearsTest(){
        throw new NotImplementedException();
    }

    //sprawdz czy zgredek istnieje tylko raz na liscie ( uzyj : containsOnlyOnce )
    @Test
    public void zgredekExistOnlyOnceTest(){
        throw new NotImplementedException();
    }

    //sprawdz czy harry jest pierwszy na liscie ( uzyj : atIndex )
    @Test
    public void harryIsFirstOnList(){
        throw new NotImplementedException();
    }

    //sprawdz czy ron jest ostatni na liscie ( uzyj : atIndex )
    @Test
    public void ronIsLastPersonOnListTest(){
        throw new NotImplementedException();
    }

    //sprawdz czy ron jest harryego przyjacielem ( uzyj : contains isIn )
    @Test
    public void ronIsHarryFriendAndPersonList(){
        throw new NotImplementedException();
    }

    //sprawdz czy ron i hermiona wystepuja tylko raz na liscie przyjaciol harrego ( uzyj : containsOnlyOnce )
    @Test
    public void ronAndHermoinaAreHarryFriendsOnlyOnceTest(){
        throw new NotImplementedException();
    }

    //dodatkowe

    @Test
    public void listIsSortedByAge(){
        throw new NotImplementedException();
    }

    public class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            throw new NotImplementedException();
        }
    }

    //dodatkowe ( uzyj : isBeforeYear isAfterYear isBetween )
    @Test
    public void checkHarryBirthDayTest() throws ParseException {
        throw new NotImplementedException();
    }

    //sprawdz czy harry ma faktycznie na imie harry (uzyj isEqual, starts, ends)
    @Test
    public void harryNameTest(){
        throw new NotImplementedException();
    }

    //sprawdz czy lista przyjaciol harrego faktycznie zawiera jego przyjaciol i ile ich faktycznie
    // jest (uzyj hasSize, contains, doesNotContain)
    @Test
    public void harryFriendsTest(){
        throw new NotImplementedException();
    }

    //dodatkowo
    // wlasny PersonAssert
    @Test
    public void hermionaNoBirthdayTest() throws ParseException {
        throw new NotImplementedException();
    }

    //dodatkowo
    @Test
    public void harryNoBirthdayTest() throws ParseException {
        throw new NotImplementedException();
    }
}

