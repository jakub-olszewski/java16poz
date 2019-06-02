package pl.sdacademy.java16poz.wstep.tablice;

import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

/**
 * TabliceMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 13:27
 **/
public class TabliceMain {

    public static void main(String[] args) {
        /**
         * Utwórz tablice zawierającą 4 liczby
         * Utwórz tablice zawierającą 5 Miast
         */
        int[] tablicaLiczb = new int[4];
        tablicaLiczb[0]=0;
        tablicaLiczb[1]=11;
        tablicaLiczb[2]=222;
        tablicaLiczb[3]=33;
        //tablicaLiczb[4]=4; nie istnieje bo tablica ma 4 elementy
        //liczone od zera


        String[] tablicaMiast = {"Poznań","Wrocław","Warszawa","Kraków","Puck"};

        //Zadanie wypisz 3 element z tablic ...
        //tablica liczb
        System.out.println(tablicaLiczb[2]);

        //tablica miast
        System.out.println(tablicaMiast[2]);

        //Zadanie
        //Utworz tablice zamowien dodaj do tablicy zamowienie
        Zamowienie[] tablicaZamowien = new Zamowienie[2];
        tablicaZamowien[0]=new Zamowienie(1);
        tablicaZamowien[1]=new Zamowienie(2);

        System.out.println("Wyswietl zamowienie 1:");
        System.out.println(tablicaZamowien[0]);
    }
}
