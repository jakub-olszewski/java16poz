package pl.sdacademy.java16poz.obiekty;

/**
 * Zamowienie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 10:10
 **/
public class Zamowienie {

    /**
     * Utwórz klasę Zamówienie
     * Dodaj pola numer oraz cena
     * Utwórz metodę pobierzCena() wypisującą cene
     */

    // dodajemy pola
    int numer;
    private float cena;

    /**
     * Konstruktor tworzacy zamowienie
     * @param numer zamowienia
     */
    public Zamowienie(int numer){
        this.numer = numer;
        this.cena = 0;
    }

    // dodajPozycje w zamowieniu

    public float pobierzCena(){
        return cena;
    }

    public String toString(){
        return "Zamowienie nr:"+numer+" cena:"+cena;
    }
}
