package pl.sdacademy.java16poz.programowanie1.lists.sandbox.typygeneryczne.pudelka;

/**
 * PudelkoNa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 12:28
 **/
public class PudelkoNa<T> {

    public PudelkoNa(T zawartosc) {
        this.zawartosc = zawartosc;
    }

    T zawartosc;

    public void pokazZawartosc(){
        System.out.println("Zawartosc pudelko na "+zawartosc);
    }

    public void wloz(T zawartosc){
        this.zawartosc = zawartosc;
    }

    public T pobierzZawartosc(){
        return zawartosc;
    }


}
