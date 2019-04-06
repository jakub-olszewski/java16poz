package pl.sdacademy.java16poz.obiekty;

import pl.sdacademy.java16poz.projekt.ProjektUtils;

import java.util.ArrayList;
import java.util.List;

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
    // lista elementow PozycjaZamowienia
    private List<PozycjaZamowienia> listaPozycji;

    /**
     * Konstruktor tworzacy zamowienie
     * @param numer zamowienia
     */
    public Zamowienie(int numer){
        this(numer,0);
    }

    public Zamowienie(int numer,float cena){
        this.numer = numer;
        this.cena = cena;
        // ArrayList to implementacja interfejsu List
        // inicjalizacja zmiennej typu List
        this.listaPozycji = new ArrayList<>();
    }

    // dodajPozycje w zamowieniu

    public float pobierzCena(){
        return cena;
    }

    public String toString(){
        return "Zamowienie nr:"+numer+" cena:"+ ProjektUtils.wypiszKwote(cena);
    }

    public void dodajPozycje(String nazwa, float cenaPozycji) {
        // utworzenie pozycji
        PozycjaZamowienia pozycja = new PozycjaZamowienia(nazwa,cenaPozycji);
        // dodania pozycji
        listaPozycji.add(pozycja);
    }
}
