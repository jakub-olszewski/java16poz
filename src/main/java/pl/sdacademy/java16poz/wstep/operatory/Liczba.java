package pl.sdacademy.java16poz.wstep.operatory;

/**
 * Liczba
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 12:41
 **/
public class Liczba {

    private double wartosc;

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

    public boolean jestNieParzysta(){
        //return wartosc%2!=0;
        return !jestParzysta();
    }

    public Liczba pierwiastek(){
        double pierwiastekZwartosci = Math.sqrt(wartosc);
        Liczba wynik = new Liczba(pierwiastekZwartosci);
        return wynik ;
    }

    public Liczba doKwadratu(){
        return new Liczba(wartosc*wartosc);
    }
    public Liczba doPotegi(int wykladnik) {
        double potegaZWartosc = Math.pow(wartosc,wykladnik);
        Liczba wynik = new Liczba(potegaZWartosc);
        return wynik;

    }
    //dodaj(Liczba a) dodaje i zwraca liczbę
    public Liczba dodaj(Liczba innaLiczba){
        double wynik = this.wartosc + innaLiczba.wartosc;
        return new Liczba(wynik);
    }

    public Liczba dodaj(double wartosc){
        double wynik = this.wartosc + wartosc;
        return new Liczba(wynik);
    }

    public Liczba odejmij(Liczba liczba)
    {
        return new Liczba(wartosc - liczba.wartosc);
    }

    public boolean rowna(Liczba liczba){
        return wartosc == liczba.wartosc;
    }

    public double wartosc(){
        return wartosc;
    }

    public int wartoscInt(){
        return (int) wartosc;
    }

    public float wartoscFloat(){
        return (float) wartosc;
    }

}
