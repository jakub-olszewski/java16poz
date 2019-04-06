package pl.sdacademy.java16poz.abstrakcja;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstrakcjaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:19
 **/
public class AbstrakcjaMain {

    public static void main(String[] args) {

        List<Figura> listaFigur = new ArrayList<>();

        Figura figuraKwadrat = new Kwardrat(5);
        listaFigur.add(figuraKwadrat);

        Figura figuraTrojkat = new Trojkat(5,3,4,3);
        listaFigur.add(figuraTrojkat);

        Figura figuraKolo= new Kolo(5);
        listaFigur.add(figuraKolo);

        //varargs
        dodajFiguryDoListy(listaFigur,figuraKwadrat,figuraTrojkat,figuraKolo);

        float sumaPol = 0;
        for (Figura figura : listaFigur){
            figura.wypiszDane();
            figura.obliczPole();
        }

        //TODO utwórz pozostałe figury i wypisz dane o nich
        //wykorzystując klasę abstrakcyjną
        //dodaj pola i obwody wszystkich figur
        //wykorzystaj listy i pętle
        //
        //dodatkowo: wykorzystaj varargs
        //           i oblicz sume obwodów

    }

    private static void dodajFiguryDoListy(List<Figura> listaFigur, Figura figuraKwadrat, Figura figuraTrojkat, Figura figuraKolo) {
    // jednoczesnie ,dodać wypisać i obliczyć pole
    }
}
