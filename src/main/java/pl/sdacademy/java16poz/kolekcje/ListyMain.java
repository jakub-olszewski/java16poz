package pl.sdacademy.java16poz.kolekcje;

import pl.sdacademy.java16poz.interfejsy.figury.Figura;
import pl.sdacademy.java16poz.interfejsy.figury.KoloFiguraImpl;
import pl.sdacademy.java16poz.interfejsy.figury.TrojkatFiguraImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ListyMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 14:16
 **/
public class ListyMain {

    public static void main(String[] args) {

        //interfejsy
        Figura trojkatFigura = new TrojkatFiguraImpl();
        Figura koloFigura = new KoloFiguraImpl();

        //listy
        List listaPrzebojow = new ArrayList(); //domyślnie używamy
        List listaPrzebojow10 = new LinkedList();

        //interfejs Figura ma 2 różne implementacje
        //lista ma 2 różne implementacje

        listaPrzebojow.add("Abba - Mamma mi");
        listaPrzebojow.add("Just5");

        // wypisanie elementów listy
        for(int i=0;i<listaPrzebojow.size();i++){
            System.out.println(i+1+". "+listaPrzebojow.get(i));
        }
        System.out.println("=========================================");
        // wypisanie elementow listy z użyciem : dwukropka
        for(Object przeboj : listaPrzebojow){ // : takie 'z'
            System.out.println(przeboj);
        }

        //Zadanie:
        //Stwórz liste zamówień
        //Stwórz metodę dodawania nowego zamowienia do listy
        //stwórz metodę wypisywania zamówień (for)

        //dodaj 3 zamówienia za każdym dodaniem wypisz stan listy zamówień

        //za pomocą pętli for zrób podsumowanie zamówień wypisują
        // sumę wszystkich zamówień

    }
}
