package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * Hotel
 *
 * Zadanie
 * Utwórz pole nazwa, adres, kod pocztowy, miasto
 *
 * Konstruktor z nazwa i bezargumentowy
 *
 * metody:
 * pobierzDane()
 * - wypisuje wszystkie dane
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 10:22
 **/
public class Hotel {
    String nazwa;
    String adres;
    int kodPocztowy;
    String miasto;

    public Hotel() {
    }

    public Hotel(String podanaNazwa) {
        nazwa = podanaNazwa;
    }

    public String pobierzDane(){
        return nazwa + "\n"+
                adres + "\n"+
                kodPocztowy + "\n"+
                miasto;
    }

    public void ustawAdres(String ustawionyAdres){
        adres = ustawionyAdres;
    }
    public void ustawKodPocztowy(int ustawionyKodPocztowy){
        kodPocztowy = ustawionyKodPocztowy;
    }
    public void ustawMiasto(String ustawioneMiasto){
        miasto = ustawioneMiasto;
    }
}
