package pl.sdacademy.java16poz.obiekty;

/**
 * PozycjaZamowienia
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 09:17
 **/
public class PozycjaZamowienia {

    // pola: nazwa, ilosc, cenaJednostki
    String nazwa;
    short ilosc;
    float cenaJednostki;

    public PozycjaZamowienia(String nazwa, float cenaJednostki){
        // wykorzystanie innego konstruktora w konstruktorze
        this(nazwa,cenaJednostki,(short)1);
    }

    public PozycjaZamowienia(String nazwa,float cenaJednostki, short ilosc){
        this.nazwa = nazwa;
        this.cenaJednostki = cenaJednostki;
        this.ilosc = ilosc;
    }

    public float pobierzCene(){
        return cenaJednostki;
    }

    public float pobierzSume(){
        return ilosc*cenaJednostki;
    }

    // metody : pobierzSume(), pobierzCene() /jednostki

    // konstruktor: nazwa,cena,ilosc
    // kostruktor: nazwa, cena ,(domyslnie ilosc =1)


}
