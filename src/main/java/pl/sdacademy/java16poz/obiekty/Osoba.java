package pl.sdacademy.java16poz.obiekty;

/**
 * Osoba
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 23.03.2019 15:04
 **/
public class Osoba {

    // pola , imie, nazwisko, wiek
    public String imie;
    String nazwisko;
    int wiek;

    // konstruktor
    // * bezargumentowy ( imie = Brak , nazwisko = Brak, wiek =0 )
   public Osoba() {
       imie = "Brak";
       nazwisko = "Brak";
       wiek = 0;
   }
    // * argumentowy (imie,nazwisko) wiek = 0;
    public Osoba(String podaneImie, String podaneNazwisko)
    {
        imie = podaneImie;
        nazwisko = podaneNazwisko;
        wiek = 0;
    }
    // * argumentowy (imie,nazwisko,wiek)

    // metody:
    // pobierzImie()
    // pobierzNazwisko()
    // pobierzWiek()
    // zmienNazwisko(String noweNazwisko)
    // zmienWiek(int nowyWiek)



}
