package pl.sdacademy.java16poz.operatory;

/**
 * LiczbyMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 12:11
 **/
public class LiczbyMain {

    /**
     * Zadanie stwórz klasę liczba
     * posiada konstruktor z argumentem double
     * posiada konstruktor z argumentem int
     * posiada konstruktor z argumentem float
     * pole wartosc jest double
     * posiada metody:
     * * jest parzysta
     * * jest nieparzysta
     * * pierwiastek() zwraca pierwiastek
     * * doKwadratu() zwraca do kwadratu
     * * doPotegi(int potega) podnosi i zwraca potege
     * * dodaj(Liczba a) dodaje i zwraca liczbę
     * * odejmij(Liczba a) odejmuje i zwraca liczbę
     * * wartosc() zwraca wartość double
     * * wartoscCalkowita() ***
     * * toString() zwraca liczbe jako napis
     */

    public static void main(String[] args) {
        Liczba a = new Liczba(3);
        Liczba b = new Liczba(6);
        boolean czyJestParzysta = a.jestParzysta();
        System.out.printf("Czy liczba %s jest parzysta? odp: %b",a,czyJestParzysta);

        float x = 6.55f;
        Liczba y = new Liczba(6.55f);

        //boolean czyRowne = x == y;

        String x1 = "3";
        int y1 = 3;

        //czyRowne = x1 ==y1;


//    Liczba c = a.dodaj(b); // 8
//
//    Liczba d = new Liczba(3.14f);
//    System.out.println(d);
//    double wartoscD = d.wartosc();
//
//    // podniesienie do kwadratu
//    Liczba bDoKwadratu = b.doKwadratu();// 25
//    // wykonanie i przetestowanie wszystkich metod
//
    }


}
