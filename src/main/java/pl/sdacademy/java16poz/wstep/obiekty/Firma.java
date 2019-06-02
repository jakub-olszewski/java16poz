package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * Firma
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 11:05
 **/
public class Firma {

    /**
     * Zadanie domowe
     * -------------------------
     * Dokończyć klasę Firma aby wypisywała niezbędne dane
     * na rachunku pobierzDane();
     */

    //wiele pol w zaleznosci od potrzeb
    String nazwa;

    //konstruktor

    /**
     * Przykład
     * @return
     */
    public String pobierzDane(){
        StringBuilder builder = new StringBuilder();
        builder.append(pobierzNazwe()).append("\n");// nazwa i enter - nowa linia
        return builder.toString();
    }

    public String pobierzNazwe(){
        return nazwa;
    }
}
