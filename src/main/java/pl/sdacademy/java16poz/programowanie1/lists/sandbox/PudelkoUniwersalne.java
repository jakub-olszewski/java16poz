package pl.sdacademy.java16poz.programowanie1.lists.sandbox;

/**
 * PudelkoUniwersalne
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 11:55
 **/
public class PudelkoUniwersalne<T> {
    T zawartosc;

    public void pokazZawartosc(){
        System.out.println("Zawartość pudełka:"+zawartosc);
    }

    public PudelkoUniwersalne(T zawartosc){
        this.zawartosc = zawartosc;
    }

    public T pobierzZawartosc(){
        return zawartosc;
    }
}
