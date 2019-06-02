package pl.sdacademy.java16poz.wstep.operatory;

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
        System.out.printf("Czy liczba %s jest parzysta? odp: %b\n",a,czyJestParzysta);

        float x = 6.55f;
        Liczba y = new Liczba(6.55f);

        //boolean czyRowne = x == y;

        String x1 = "3";
        int y1 = 3;

        //czyRowne = x1 ==y1;

        boolean czyJestNieParzysta = b.jestNieParzysta();

        System.out.printf("Czy liczba %s jest nie parzysta? odp: %b\n",b,czyJestNieParzysta);

        Liczba p = new Liczba(144);
        System.out.printf("Pierwiastek liczby %s wynosi: %s\n",p,p.pierwiastek());

        Liczba k = new Liczba(6);
        System.out.printf("Liczba %s podniesiona do kwadratu wynosi: %s\n", k, k.doKwadratu());

        Liczba z = new Liczba(9);
        int potega = 3;
        System.out.printf("Liczba %s podniesiona do potegi trzeciej wynosi %s:\n",z,z.doPotegi(3)  );


        System.out.printf("Liczba %s podniesiona do potegi %d wynosi %s:\n",z,potega,z.doPotegi(potega)  );
//    Liczba c = a.dodaj(b); // 8
        // dodaj(Liczba a) dodaje i zwraca liczbę

        Liczba liczbaO = new Liczba(5);
        Liczba liczbaU = new Liczba(2);
        Liczba wynik = liczbaO.dodaj(liczbaU);
        System.out.printf("Liczba %s dodana do %s wynosi %s\n",liczbaO,liczbaU,wynik);

        //odejmowanie
        System.out.printf("Liczba %s odejta od %s wynosi %s\n",liczbaO, liczbaU,liczbaO.odejmij(liczbaU));

        Liczba liczbaPrzecinkowa = new Liczba(3.141592);
        int liczbaInt = liczbaPrzecinkowa.wartoscInt();
        System.out.printf("Liczba %s kastowana do inta wynosi %d\n",liczbaPrzecinkowa,liczbaInt);
    }


}
