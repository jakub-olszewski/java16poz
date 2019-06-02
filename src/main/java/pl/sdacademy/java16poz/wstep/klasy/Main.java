package pl.sdacademy.java16poz.wstep.klasy;


import pl.sdacademy.java16poz.wstep.obiekty.Kanapka;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 23.03.2019 13:57
 **/
public class Main {

    public static void main(String[] args) {

        String tekst = "Przykładowy tekst...";

        // typ_zmiennej nazwaZmiennej = wartość
        Kanapka kanapkaZPomidorem; // deklaracja

        // wykorzystanie konstruktora bezargumentowy
        kanapkaZPomidorem = new Kanapka();
        String kartkaZeSklademKanapki = kanapkaZPomidorem.podajSklad();

        // wypisanie zawartości kartki na konsole
        System.out.println(kartkaZeSklademKanapki);

        // utworz kanapke z sałatą wykorzystując
        // konsturktor argumentowy
        // wypisz na konsole
        Kanapka kanapkaZSalata;

        String skladKanapkiZSalata = "Bułka,Sałata";
        kanapkaZSalata = new Kanapka(skladKanapkiZSalata);

        System.out.println(kanapkaZSalata.podajSklad());

    }
}
