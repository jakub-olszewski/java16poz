package pl.sdacademy.java16poz.programowanie1.lists.sandbox.typygeneryczne.pudelka;

import pl.sdacademy.java16poz.programowanie1.lists.sandbox.Pudelko;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 12:12
 **/
public class Main {

    public static void main(String[] args) {
        Chipsy chipsyLays = new Chipsy();
        Lody lodyGrycan = new Lody();
        Czekolada czekoladaMilka = new Czekolada();

        PudelkoNaChipsy pudelkoNaChipsy = new PudelkoNaChipsy(chipsyLays);
        PudelkoNaLody pudelkoNaLody = new PudelkoNaLody(lodyGrycan);
        PudelkoNaCzekolada pudelkoNaCzekolada = new PudelkoNaCzekolada(czekoladaMilka);

        //TODO Zadanie typy generyczne
        //stwórz klase generyczna w pakiecie 'pudelko'
        //nazwa klasy PudelkoNa<T>
        //utworz metody:
        //          T pobierzZawartosc()
        //          void pokazZawartosc()
        //          void wloz(T zawartosc)
        //tworzymy 3 pudelka na lody chipsy i czekolade
        //i wrzucamy przez konstruktor nasze produkty
        //odpowiedź:
        PudelkoNa<Chipsy> opudelkoNaChipsy = new PudelkoNa<>(chipsyLays);
        PudelkoNa<Lody> opudelkoNaLody = new PudelkoNa<>(lodyGrycan);
        PudelkoNa<Czekolada> opudelkoNaCzekolada = new PudelkoNa<>(czekoladaMilka);

    }
}
