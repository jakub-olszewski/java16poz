package pl.sdacademy.java16poz.wstep.scanner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Zadanie2
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 13:13
 **/
public class Zadanie2 {

    public static void main(String[] args) {
        /**
         * Zadanie dodatkowe
         * Pobierz za pomocą skanera tekst i podczas wypisytania
         * zamieniaj brzydkie słowa na gwiazdki
         *
         * dodatkowo:
         * ilość gwiazdek tyle ile liter
         */

        /**
         * Zadanie dodatkowe
         * Pobierz za pomocą skanera tekst i podczas wypisywania
         * zamieniaj brzydkie słowa na gwiazdki
         *
         * dodatkowo:
         * ilość gwiazdek tyle ile liter
         */
        System.out.println("Wprowadź tekst:");// wypisanie informacji
        Scanner skaner = new Scanner(System.in); // tworzenie skanera
        String wczytanyTekst; // tworzymy zmienna na wczytanyTekst - deklaracja
        wczytanyTekst = skaner.nextLine(); // inicjalizacje - przypisanie wartości
        // wartości pobranej ze skaner, czyli wpisanej z klawiatury

//        List<String> tablicaBrzydkichSlow = new ArrayList<>();
//        tablicaBrzydkichSlow.add("kurwa");
//        tablicaBrzydkichSlow.add("dupa");
        List<String> tablicaBrzydkichSlow = utworzListePrzeklenstw("kurwa,dupa");

        System.out.println("Tekst po cenzurze:");

        funkcjaCenzura2(wczytanyTekst,tablicaBrzydkichSlow);
    }

    private static List<String> utworzListePrzeklenstw(String listaSlow) {
        List<String> wynik = Arrays.asList(listaSlow.split("\\s*,\\s*"));
        return wynik;
    }

    private static void funkcjaCenzura2(String wczytanyTekst, List<String> tablicaBrzydkichSlow) {

        StringBuilder ocenzurowanyTekst = new StringBuilder();
        Scanner skaner = new Scanner(wczytanyTekst);

        while(skaner.hasNext()){// sprawdzenie za każdym razem czy jest następny

            String slowoZNapisu = skaner.next();
            System.out.println("Słowo| "+slowoZNapisu);
            // czy istnieje na liście brzydkich słów
            boolean czySlowoToWulgaryzm = tablicaBrzydkichSlow.contains(slowoZNapisu);
            StringBuilder slowoZGwiazdek = new StringBuilder();
            System.out.println("\tCzy jest wulgaryzmem?| "+czySlowoToWulgaryzm);

            if(czySlowoToWulgaryzm){

                // zlicz litery zrób gwiazdki
                int liczbaLiter = slowoZNapisu.length();
                // tworzy napis z gwiazdek
                for (int i = 0;i<liczbaLiter;i++){
                    slowoZGwiazdek.append("*");
                }
                // zamienić wulgaryzm na gwiazki
                ocenzurowanyTekst.append(slowoZGwiazdek).append(" ");
                System.out.println("\tdodaj| "+slowoZGwiazdek);

            }else{
                // nic nie rób
                ocenzurowanyTekst.append(slowoZNapisu).append(" ");
                System.out.println("\tdodaj| "+slowoZNapisu);
            }
        }
        System.out.println("Ocenzurowany tekst| "+ocenzurowanyTekst);

    }

    private static void funkcjaCenzura(String wczytanyTekst, List<String> tablicaBrzydkichSlow) {
        String zmienionyTekst = wczytanyTekst;
        for (int i=0; i<tablicaBrzydkichSlow.size(); i++)
        {
            String szukaneSlowo = tablicaBrzydkichSlow.get(i);
            if (wczytanyTekst.contains(szukaneSlowo))
            {
                String ocenzurowaneSlowo = "";
                for (int j=0; j<szukaneSlowo.length(); j++)// szukane słowo ma długość
                {
                    ocenzurowaneSlowo += "*";
                }
                zmienionyTekst = zmienionyTekst.replace(szukaneSlowo,ocenzurowaneSlowo);
            }
        }
        System.out.println(zmienionyTekst);
    }

}
