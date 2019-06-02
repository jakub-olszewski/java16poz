package pl.sdacademy.java16poz.wstep.petle;

import java.util.Random;

/**
 * Zadanie1
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 10:05
 **/
public class Zadanie2 {
    public static void main(String[] args) {
        /**
         * Wypisz parzyste elementy utworzonej wcześniej tablicy zawierającą liczby
         * tablica 10 liczb od 0 do 1000
         * + dodatkowo użycie Random() czyli losowania
         *
         * 1. Stwórz tablice
         * 2. Przypisz elementy
         * 3. Wypisz
         *
         * wersja:
         * a) for
         * b) while
         */

        wersjaFOR();
        wersjaWHILE();
    }

    public static void wersjaWHILE(){
            int[] tablicaMoja = new int[10];
            Random tablicaRandom = new Random();

            int i = 0;
            while (i < tablicaMoja.length) {
                tablicaMoja[i] = tablicaRandom.nextInt(1000) + 1;
                int liczba = tablicaMoja[i];// losowanie i przypisanie
                if (czyJestParzysta(liczba)) {// czy jest parzysta
                    System.out.print("Liczba:" + (i+1) + " | ");// random jest od zera dlatego +1
                    System.out.println(liczba);
                }
                i++;
            }

        }

    public static void wersjaFOR(){
        int [] tablicaMoja = new int[10];
        Random tablicaRandom = new Random();

        for (int i=0; i<tablicaMoja.length; i++)
        {
            // przypisujemy do tablicy wylosowaną liczbę
            tablicaMoja[i]=tablicaRandom.nextInt(1000)+1;
        }

        for (int i=0; i<tablicaMoja.length; i++) {
            int liczba = tablicaMoja[i];// liczba z tablicy

            if (czyJestParzysta(liczba)) {// sprawdzamy czy jest parzysta
                System.out.print("Iteracja:" + i + " | ");// jeśli prawda
                System.out.println(liczba);// to wypisujemy
            }
        }
    }

    public static boolean czyJestParzysta(int liczba){
        return liczba%2==0;
    }
}
