package pl.sdacademy.java16poz.wyrazenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * WyrazeniaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 13:52
 **/
public class WyrazeniaMain {
    public static void main(String[] args) {
        {
            Pattern compiledPattern = Pattern.compile("Marcin");
            Matcher matcher = compiledPattern.matcher("A tata Marcina powiedział");

            System.out.println(matcher.find());// czy zawiera ?
            System.out.println(matcher.matches());// czy jest dokladnie takie jak szukamy ?
        }
        {
            Pattern compiledPattern = Pattern.compile("\\d{1}");
            Matcher matcher = compiledPattern.matcher("konik7");

            System.out.println(matcher.find());// czy zawiera ?
            System.out.println(matcher.matches());// czy jest dokladnie takie jak szukamy ?
        }

        String numer = pobierzNumer();
        walidujNumer(numer);

    }

    /**
     * Metoda sprawdzala czy numer jest poprawny
     * wedlug wzorca ddd-ddd-ddd
     * @param numer parametr wejsciowy
     */
    private static void walidujNumer(String numer) {
        // wypisuje poprawny/niepoprawny numer
    }

    /**
     * Metoda pobierajaca numer z klawiatury
     * najpierw realizujemy 1 wzorzec a następnie liste
     * @return numer w postaci napisu
     */
    private static String pobierzNumer() {
        // prosba wpisanie numeru
        // podanie prawidłowy formatów ddd-ddd-ddd lub +48 ddd ddd ddd
        // wyrażenia warunkowego
        // scanner
        // dodatkowo: lista formatów
        return null;
    }
}
