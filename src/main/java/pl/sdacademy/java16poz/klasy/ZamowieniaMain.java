package pl.sdacademy.java16poz.klasy;

import pl.sdacademy.java16poz.obiekty.Zamowienie;

/**
 * ZamowieniaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 10:21
 **/
public class ZamowieniaMain {

    public static void main(String[] args) {

        Zamowienie zamowienie1 = new Zamowienie(1);
        // pobranie ceny zamowienia i wyswietlenie na konsoli
        float aktualnaKwotaDoZaplaty = zamowienie1.pobierzCena();
        System.out.println(aktualnaKwotaDoZaplaty);

        /**
         * Zadanie domowe
         * ----------------------------
         * dodaj metode dodajPozycje(float cena)
         * dodaj kilka pozycji do zamowienia i
         * na końcu pobierzCene()
         * i wyświetl mini rachunek
         */

    }
}
