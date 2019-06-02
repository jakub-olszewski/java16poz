package pl.sdacademy.java16poz.wstep.dziedziczenie;

import pl.sdacademy.java16poz.wstep.obiekty.PozycjaZamowienia;

/**
 * DziedziczenieMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:15
 **/
public class DziedziczenieMain {

    public static void main(String[] args) {

        PozycjaZamowienia pozycjaZamowienia = new PozycjaZamowienia("Frytki",5.99f);
        // pozycjaZamowienia jest obiektem - rozszerza klase Object
        // posiada jej wlasciwosci
        pozycjaZamowienia.hashCode();

    }
}
