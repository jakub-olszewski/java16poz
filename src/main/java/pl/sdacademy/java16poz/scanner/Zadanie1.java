package pl.sdacademy.java16poz.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

        //w petli for porowynywac i zapamietywac obecna
        //najwieksza

    }

    private static void wczytajLiczby(List<Integer> liczbyWczytane) {
        //w petli ze skanerem wczytac
        //ujemna kończy wczytywanie
        System.out.println("Wprowadź liczby:");
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
