package pl.sdacademy.java16poz.wyrazenia;

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



        String numer = pobierzNumer();

        /**
         * Sprawdzanie w pętli z listy wzorców czy
         * nasz numer pasuje do któregoś z nich
         * || -
         */
        List<String> listaWzorcow = pobierzFormaty();
        for(String wzorzec: listaWzorcow){
            boolean czyPoprawny = walidujNumer(numer,wzorzec);
            if(czyPoprawny){
                System.out.println("Numer jest poprawny");
            }else{
                System.out.println("Numer nie poprawny");
            }
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

        separator();
        System.out.println("Formaty:");
        List<String> formaty = pobierzFormaty();// pobranie formatów z metody
        for(String format: formaty){
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
        String numer = skaner.nextLine();
        // dodatkowo: lista formatów
        separator();
        System.out.println("\tWprowadzono:"+numer);
        return numer;
    }

    private static List<String> pobierzFormaty() {
        List<String> formaty = new ArrayList<>();
        formaty.add("\\+48 \\d{3} \\d{3} \\d{3}");
        formaty.add("\\d{3} \\d{3} \\d{3}");
        formaty.add("\\d{3}\\d{3}\\d{3}");
        formaty.add("\\d{3}-\\d{3}-\\d{3}");
        return formaty;
    }

    public static void separator(){
        System.out.println("-------------------------");
    }
}
