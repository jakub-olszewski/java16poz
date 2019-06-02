package pl.sdacademy.java16poz.wstep;
//generate test
//alt + enter

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.10.2018 10:00
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");

        // deklaracja
        int zamiennaLiczbowa;
        String zmiennaTekstowa;

        // inicjalizacje - nadaliśmy wartość
        zamiennaLiczbowa = 0;

        // 2in1 deklaracja i inicjalizacja w jednej linii
        int liczbaUczestnikow = 18;

        // Zadanie
        // Zainicjuj zmienna tekstowa i wypisz ja na konsole
        zmiennaTekstowa = "Tekst przykladowy";

        System.out.println(zmiennaTekstowa);

        // uzycie metody
        int liczbaZwracana = 234;
        String napis = zwracaLiczbeJakoTekst(liczbaZwracana);
        System.out.println(napis);

        // przyklad poprosze haslo do wifi
        System.out.println(poproszeHasloDoWifi());

        int a = 20, b = 15;
        String wynik= dodaj(a,b);
        System.out.println(wynik);

        System.out.println("Wynik: "+dodajInt(a, b));

        int zmiennaA = 2, zmiennaB = 4;
        int wynikInt = dodajInt(zmiennaA, zmiennaB);
        System.out.println("Wynik: "+wynikInt);

        System.out.println("Wynik: "+dodajInt(5, 3));
    }

    public static int dodajInt(int liczbaA, int liczbaB){
        return liczbaA+liczbaB;
    }

    public static String dodaj( int a, int b) {
        int suma= a+b;
        return  "Wynik: " + suma;

    }

    public static String poproszeHasloDoWifi(){
        return "123asdv";
    }

    public static String zwracaLiczbeJakoTekst(int liczba){
        return "Liczba:"+liczba;
    }

    public static void wyswietlLiczbe(String tekst){
        System.out.println(tekst);
    }
}
