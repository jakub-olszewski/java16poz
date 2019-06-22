package pl.sdacademy.java16poz.testowanietdd.matchers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * PersonMatcherTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 13:19
 **/
public class PersonMatcherResolveTest {

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

        personsList.add(new Person("Malfoy", 13));
        personsList.add(new Person("Severus", 34));

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

        // JUnit style
        assertNotNull(personsList);
        assertFalse(personsList.isEmpty());


        // AssertJ
        //assertThat(...)...
        assertThat(personsList).isNotEmpty();
    }

    //sprawdz czy przyjaciele harrego maja mniej niz 16 lat ( uzyj : isLessThan )
    @Test
    public void harryFriendsLess16yearsOldTest(){
        //assertThat(ron.getAge()).isLessThan(10);
        //assertThat(hermiona.getAge()).isLessThan(16);
        harryFriends.stream().forEach(x->assertThat(x.getAge()).isLessThan(16));

    }

    //sprawdz czy zgredek ma wiecej niz 100 lat ( uzyj : isGreaterThan )
    @Test
    public void zgredekHaveMoreThan100yearsTest(){
        assertThat(zgredek.getAge()).isGreaterThan(100);
    }

    //sprawdz czy zgredek istnieje tylko raz na liscie ( uzyj : containsOnlyOnce )
    @Test
    public void zgredekExistOnlyOnceTest(){
        assertThat(personsList).containsOnlyOnce(zgredek);

    }

    //sprawdz czy harry jest pierwszy na liscie ( uzyj : atIndex )
    @Test
    public void harryIsFirstOnList(){
        assertTrue(personsList.get(0).equals(harry));
        assertThat(personsList).contains(harry,atIndex(0));
    }

    //sprawdz czy ron jest ostatni na liscie ( uzyj : atIndex )
    @Test
    public void ronIsLastPersonOnListTest(){
        assertThat(personsList).contains(ron, atIndex(personsList.size()-1));
    }

    //sprawdz czy ron jest harryego przyjacielem ( uzyj : contains isIn )
    @Test
    public void ronIsHarryFriendAndPersonList(){
        assertThat(harryFriends).contains(ron);
        assertThat(ron).isIn(harryFriends);
    }

    //sprawdz czy ron i hermiona wystepuja tylko raz na liscie przyjaciol harrego ( uzyj : containsOnlyOnce )
    @Test
    public void ronAndHermoinaAreHarryFriendsOnlyOnceTest(){
    }

    //dodatkowe

    @Test
    public void listIsSortedByAge(){
        AgeComparator ageComparator = new AgeComparator();
        assertThat(personsList).isSortedAccordingTo(ageComparator);
    }

    public class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            // int vs Integer
            Integer age1 = person1.getAge();
            return age1.compareTo(person2.getAge());
        }
    }

    //dodatkowe ( uzyj : isBeforeYear isAfterYear isBetween )
    @Test
    public void checkHarryBirthDayTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        harry.setBirthdayDate(sdf.parse("2002-06-01"));
        assertThat(harry.getBirthdayDate()).isBeforeYear(2003).isAfterYear(2001).isInSameYearAs("2002-06-01");
        assertThat(harry.getBirthdayDate()).isBetween("2002-05-30","2002-06-02");
    }

    //sprawdz czy harry ma faktycznie na imie harry (uzyj isEqual, starts, ends)
    @Test
    public void harryNameTest(){
        assertThat(harry.getName()).isEqualTo("Harry").startsWith("Ha").endsWith("ry");
    }

    //sprawdz czy lista przyjaciol harrego faktycznie zawiera jego przyjaciol i ile ich faktycznie
    // jest (uzyj hasSize, contains, doesNotContain)
    @Test
    public void harryFriendsTest(){
        assertThat(harryFriends).hasSize(2).contains(hermiona,ron).doesNotContain(zgredek);
    }

    //dodatkowo
    // wlasny PersonAssert
    @Test
    public void hermionaNoBirthdayTest() throws ParseException {
        PersonAssert.assertThat(hermiona).hasNoBirthDay();
    }

    //dodatkowo
    @Test
    public void harryNoBirthdayTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        harry.setBirthdayDate(sdf.parse("2002-06-01"));
        PersonAssert.assertThat(hermiona).hasNoBirthDay();
    }
}

