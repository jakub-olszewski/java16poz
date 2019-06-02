package pl.sdacademy.java16poz.wstep.klasy;

import pl.sdacademy.java16poz.wstep.obiekty.Hotel;

/**
 * HotelMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 11:13
 **/


public class HotelMain {
    public static void main(String[] args) {

        String nazwa = "Astra";
        String adres = "Ul.Długa";
        int kodPocztowy = 61000;
        String miasto = "Poznan";

        Hotel astraHotel = new Hotel("Astra");
        astraHotel.ustawAdres(adres);
        astraHotel.ustawKodPocztowy(kodPocztowy);
        astraHotel.ustawMiasto(miasto);
        System.out.println(astraHotel.pobierzDane());

    }
}
