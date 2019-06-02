package pl.sdacademy.java16poz.wstep.obiekty;

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

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    // * argumentowy (imie,nazwisko) wiek = 0;
    public Osoba(String podaneImie, String podaneNazwisko)
    {
        imie = podaneImie;
        nazwisko = podaneNazwisko;
        wiek = 0;
    }
    // * argumentowy (imie,nazwisko,wiek)
    public Osoba(String podaneImie, String podaneNazwisko, int podanyWiek){
       imie = podaneImie;
       nazwisko = podaneNazwisko;
       wiek = podanyWiek;
    }



    // metody:
    // pobierzImie()
    public String pobierzImie(){
        return imie;
    }

    // pobierzNazwisko()

    public String pobierzNazwisko(){
       return nazwisko;
    }

    // pobierzWiek()
    public int pobierzWiek(){
       return wiek;
    }

    // zmienNazwisko(String noweNazwisko)
    public void zmienNazwisko(String noweNazwisko)
    {
       nazwisko = noweNazwisko;
    }

    // zmienWiek(int nowyWiek)
    public void zmienWiek(int nowyWiek)
    {
        wiek = nowyWiek;
    }



}
