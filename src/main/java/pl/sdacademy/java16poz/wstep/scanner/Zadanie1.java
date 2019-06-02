package pl.sdacademy.java16poz.wstep.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Zadanie1
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 13:11
 **/
public class Zadanie1 {

    public static void main(String[] args) {
        /**
         *  Zadanie
         * Utwórz tablice zawierającą liczby wczytane za pomocą scanner
         * wypisz największą liczbę
         *
         * Dla chętnych:
         * Utwórz tablice zawierającą liczby wylosowane z użyciem Random()
         */
        List<Integer> liczbyWczytane = new ArrayList<>();
        wczytajLiczby(liczbyWczytane);// z klawiatury
        wypiszLiczby(liczbyWczytane);
        wypiszNajwieksza(liczbyWczytane);// wypisz na konsoli

    }

    private static void wypiszLiczby(List<Integer> liczbyWczytane) {
        System.out.println("Liczby:");
        for(int liczba : liczbyWczytane){
            System.out.print(liczba+" ");
        }
    }

    private static void wypiszNajwieksza(List<Integer> liczbyWczytane) {

        int maksymalna = 0;
        // wprowadzamy 1 22 55 33
        // 1
        // sprawdzamy czy 1>0 tak 1 = maksymalna
        // sprawdzamy czy 22>1 tak 22 = maksymalna
        // sprawdzamy czy 55>22 tak 55 = maksymalna
        // sprawdzamy czy 33>55 nie
        for (int liczba : liczbyWczytane){
            if(liczba>maksymalna){
                maksymalna = liczba;
            }
        }
        System.out.println("maksymalna:"+maksymalna);
        //w petli for porowynywac i zapamietywac obecna
        //najwieksza

    }

    private static void wczytajLiczby(List<Integer> liczbyWczytane) {
        //w petli ze skanerem wczytac
        //ujemna kończy wczytywanie
        System.out.println("Wprowadź liczby większe od zera:");
        Scanner skaner = new Scanner(System.in);
        int wczytanaLiczba;
        wczytanaLiczba = skaner.nextInt();
        if(wczytanaLiczba>0){
            liczbyWczytane.add(wczytanaLiczba);
        }
        while (wczytanaLiczba>0) {
            wczytanaLiczba = skaner.nextInt();
            if (wczytanaLiczba > 0) {
                liczbyWczytane.add(wczytanaLiczba);
            }
        }
    }
}
