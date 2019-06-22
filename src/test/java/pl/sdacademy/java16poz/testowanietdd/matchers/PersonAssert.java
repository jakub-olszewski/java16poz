package pl.sdacademy.java16poz.testowanietdd.matchers;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

import java.util.Date;

/**
 * PersonAssert
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 15:17
 **/
public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert hasNoBirthDay() {
        isNotNull();

        String assertjErrorMessage = "\nExpecting Person <%s> to havent birthday\n but was:\n  <%s> ";

        // null safe check
        Date birthdayDate = actual.getBirthdayDate();

        if (!Objects.areEqual(birthdayDate, null)) {
            failWithMessage(assertjErrorMessage, actual.getName(), birthdayDate);
        }

        // return the current assertion for method chaining
        return this;
    }

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

}
