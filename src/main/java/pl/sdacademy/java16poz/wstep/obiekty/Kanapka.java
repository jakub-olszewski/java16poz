package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * Kanapka
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 23.03.2019 13:56
 **/
public class Kanapka {

    // właściwości - pola
    String sklad;

    // konstruktor bezargumentowy
    // NazwaKlasy
    public Kanapka(){
        sklad = "Nie znany";
    }

    // konstruktor argumentowy
    // zawiera argument którego wartość
    // zostaje przypisana do wlasciwości
    // kanapki czyli jej skladu
    public Kanapka(String podanySklad){
        sklad = podanySklad;
    }


    // metody - funkcje
    public String podajSklad(){
        return sklad;
    }

}
