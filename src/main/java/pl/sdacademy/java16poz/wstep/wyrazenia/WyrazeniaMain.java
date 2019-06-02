package pl.sdacademy.java16poz.wstep.wyrazenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

        List<String> listaWzorcow = pobierzFormaty();

        /**
         * Sprawdzanie w pętli z listy wzorców czy
         * nasz numer pasuje do któregoś z nich
         * || -
         */
        boolean jestPoprawny = false;

        while (!jestPoprawny){
            // pobieraj z klawiatury
            // pobieramy numer z użyciem skannera
            String numer = pobierzNumer();
            // jestPoprawny = waliduj
            for(String wzorzec: listaWzorcow){
                jestPoprawny = walidujNumer(numer,wzorzec);
                if(jestPoprawny){
                    System.out.println("Numer jest poprawny");
                    break;
                }
            }
            if(!jestPoprawny){// ! = nie
                System.out.println("Numer nie poprawny");
            }
            // jeśli
            //     jestPoprawny to prawda
            //     przerywa pętle bo warunek w while
            //     nie jest spełniony
        }




    }

    /**
     * Metoda sprawdzala czy numer jest poprawny
     * wedlug wzorca ddd-ddd-ddd
     * @param numer parametr wejsciowy
     */
    private static boolean walidujNumer(String numer) {
        // wypisuje poprawny/niepoprawny numer
        // wzorzec
        Pattern compiledPattern = Pattern.compile("\\+48 \\d{3} \\d{3} \\d{3}");
        // porównywarka, która daje nam wynik prawda/fałsz
        Matcher matcher = compiledPattern.matcher(numer);

        // pobieramy wynik porównania/sprawdzenia i przypisujemy
        // wynik do zmiennej czyJestPoprawny
        boolean czyJestPoprawny = matcher.matches();
        return  czyJestPoprawny;
    }

    private static boolean walidujNumer(String numer,String wzorzec) {
        // wypisuje poprawny/niepoprawny numer
        // wzorzec
        Pattern compiledPattern = Pattern.compile(wzorzec);
        // porównywarka, która daje nam wynik prawda/fałsz
        Matcher matcher = compiledPattern.matcher(numer);

        // pobieramy wynik porównania/sprawdzenia i przypisujemy
        // wynik do zmiennej czyJestPoprawny
        boolean czyJestPoprawny = matcher.matches();
        return  czyJestPoprawny;
    }

    /**
     * Metoda pobierajaca numer z klawiatury
     * najpierw realizujemy 1 wzorzec a następnie liste
     * @return numer w postaci napisu
     */
    private static String pobierzNumer() {
        // prosba wpisanie numeru

        separator();// rysowanie linii oddzielającej
        System.out.println("Formaty:");
        // pobierzFormaty - to metoda która zwraca
        //                  liste formatów
        List<String> formaty = pobierzFormaty();// pobranie formatów z metody
        for(String format: formaty){
            // pętla po kolei wyswietlamy formaty z listy
            System.out.println(format.
                    replace("\\","").// zamiana \ na pusty
                    replace("d{3}","123"));// zamiana d{3} na 123
        }
        separator();
        System.out.println("Podaj numer telefonu:");
        separator();
        System.out.print(">");

        // podanie prawidłowy formatów ddd-ddd-ddd lub +48 ddd ddd ddd
        // wyrażenia warunkowego
        // scanner
        Scanner skaner = new Scanner(System.in);
        String numer = skaner.nextLine();// metoda nextLine()
        // pobiera wpisaną linie do znaku entera
        // wynik pobrania z klawiatury
        // zostaje przypisany do zmiennej o nazwie numer

        separator();
        System.out.println("\tWprowadzono:"+numer);
        // wypisujemy to co zostało wpisane na klawiaturze
        return numer;// zwracamy numer
    }

    private static List<String> pobierzFormaty() {
        List<String> formaty = new ArrayList<>();// tworzymy liste
        formaty.add("\\+48 \\d{3} \\d{3} \\d{3}");// dodajemy formaty
        formaty.add("\\d{3} \\d{3} \\d{3}");
        formaty.add("\\d{3}\\d{3}\\d{3}");
        formaty.add("\\d{3}-\\d{3}-\\d{3}");
        return formaty;// zwracamy liste z formatami
    }

    public static void separator(){
        System.out.println("-------------------------");
    }
}
