package pl.sdacademy.java16poz.wstep.kolekcje;

import pl.sdacademy.java16poz.wstep.interfejsy.figury.Figura;
import pl.sdacademy.java16poz.wstep.interfejsy.figury.KoloFiguraImpl;
import pl.sdacademy.java16poz.wstep.interfejsy.figury.TrojkatFiguraImpl;
import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

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

        List<Zamowienie> listaZamowien = new ArrayList();
        //dodac zamowienie
        dodajZamowienieDoListy(listaZamowien,1,2.99f);
        wypiszListeZamowien(listaZamowien);
        dodajZamowienieDoListy(listaZamowien,2,23.79f);
        wypiszListeZamowien(listaZamowien);
        dodajZamowienieDoListy(listaZamowien,3,76.29f);
        wypiszListeZamowien(listaZamowien);

        posumowanieZamowien(listaZamowien);
    }

    private static void posumowanieZamowien(List<Zamowienie> listaZamowien) {
        float suma = 0;

        for(Zamowienie zamowienie: listaZamowien){
            zamowienie.pobierzCena();
        }

        for(int i=0;i<listaZamowien.size();i++ ){
            Zamowienie zamowienie = listaZamowien.get(i);
            zamowienie.pobierzCena();
        }

        System.out.println("====== SUMA : "+suma);
    }

    private static void wypiszListeZamowien(List<Zamowienie> listaZamowien) {
        System.out.println("==== Lista zamówień ===");
        for(int i=0;i<listaZamowien.size();i++ ){
            System.out.println(i+1+"."+listaZamowien.get(i));
        }
        System.out.println("-----------------------");
    }

    public static void dodajZamowienieDoListy(List listaZamowien, int numer, float cena){
        Zamowienie zamowienie= new Zamowienie(numer,cena);
        listaZamowien.add(zamowienie);
        System.out.println("=> dodanie zamowienia : "+zamowienie);
    }


}
