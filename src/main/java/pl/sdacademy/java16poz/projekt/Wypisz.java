package pl.sdacademy.java16poz.projekt;

import pl.sdacademy.java16poz.wstep.obiekty.PozycjaZamowienia;
import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

public class Wypisz {
    public static void daneOZamowieniu(Zamowienie element) {
        element.wypiszRachunek();
    }

    public static void nieZnaleziono() {
        System.out.println("Nie znaleziono");
    }

    public static void daneOPozycji(PozycjaZamowienia pozycja) {
pozycja.prettyPrint();
    }
}