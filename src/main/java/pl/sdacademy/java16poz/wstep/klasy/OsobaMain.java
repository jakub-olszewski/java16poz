package pl.sdacademy.java16poz.wstep.klasy;

import pl.sdacademy.java16poz.wstep.obiekty.Osoba;

/**
 * OsobaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 23.03.2019 15:22
 **/
public class OsobaMain {
    public static void main(String[] args) {
        Osoba nowaOsoba = new Osoba("Janusz","Kiepski");
        System.out.println(nowaOsoba.imie);
        System.out.println(nowaOsoba.pobierzNazwisko());
        // zmiana nazwiska
        nowaOsoba.zmienNazwisko("Nowak");

        // wyswietlenie/pobranie ponownie nazwiska
        System.out.println(nowaOsoba.pobierzNazwisko());
    }
}
