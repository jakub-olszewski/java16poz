package pl.sdacademy.java16poz.operatory;

/**
 * Liczba
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 12:41
 **/
public class Liczba {

    double wartosc;

    public Liczba (int wartosc){
        this.wartosc = wartosc;
    }

    public Liczba (double wartosc){
        this.wartosc = wartosc;
    }

    public Liczba (float wartosc){
        this.wartosc = wartosc;
    }

    public boolean jestParzysta(){
        return wartosc%2==0;
    }

    public String toString(){
        return String.valueOf(wartosc); //zapisanie liczby jako tekst
    }

}
