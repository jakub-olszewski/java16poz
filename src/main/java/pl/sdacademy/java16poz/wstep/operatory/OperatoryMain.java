package pl.sdacademy.java16poz.wstep.operatory;

/**
 * OperatoryMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 11:31
 **/
public class OperatoryMain {

    /**
     * Wyróżniamy w Javie następujące operatory:
     *
     * Przypisania  =, +=, -=, *=, /=
     *
     * Arytmetyczne  +,-,*,/,%,++,--
     *
     * Logiczne  &&, ||, !
     *
     * Relacji  <,<=,>,>=,==, !=
     *
     */
    public static void main(String[] args) {

        /*
        Przypisania  =, +=, -=, *=, /=
         */
        int liczba = 5; // przypisanie wartosci znakiem =
        // += zwiększenie o
        liczba += 5; // zwiększamy liczba o 5 ... liczba wynosi 10

        // -= zmniejszenie o
        liczba -= 1; // zmniejszymy liczba o 1 ... liczba wynosi 9

        // *= zwielokrotnienie
        liczba *= 3; // mnożymy liczba przez 3 ... liczba wynosi 27

        // /= dzielenie przez
        liczba /= 27; // dzielimy liczbe przez 27 ... liczba wynosi 1

        //=======================================================
        /* Arytmetyczne  +,-,*,/,%,++,--
        */
        int liczbaA = 1;
        int liczbaB = 3;
        int liczbaC;
        // +
        liczbaC = liczbaA + liczbaB;
        // -
        liczbaC = liczbaA - liczbaB;
        // * mnożenie
        liczbaC = liczbaA * liczbaB;
        // / dzielenie
        liczbaC = liczbaA / liczbaB;
        // % reszta z dzielenia
        liczbaC = 5 % 2; // liczbaC to 1
        liczbaC = 13 % 7; // liczbaC to 6

        // ++ inkrementacja zwiększenie o 1
        int liczbaE = 3;
        liczbaE++; // liczbaE to 4
        liczbaE++; // liczbaE to 5
        liczbaE++; // liczbaE to 6
        System.out.println("=============");
        System.out.println(liczbaE);
        ++liczbaE; // zwiększenie o 1
        System.out.println(liczbaE); // 7
        System.out.println(++liczbaE);// 8
        System.out.println(liczbaE); // 8
        System.out.println(liczbaE++); // 8
        System.out.println(liczbaE); // 9

        // -- zmniejszenie o 1
        int liczbaF = 5;
        liczbaF--; // liczbaE to 4
        liczbaF--; // liczbaE to 3
        liczbaF--; // liczbaE to 2

        // wzrost o 2
        liczbaF+=2;

        //======================================
        // Logiczne  &&, ||, !
        boolean ideNaSpacer;
        boolean jestCieplo = true;
        boolean jestWeekend = true;

        // && logiczne 'i'
        // ideNaSpacer kiedy jestCieplo i jestWeekend
        ideNaSpacer = jestCieplo && jestWeekend;

        // || logiczne 'lub'

        boolean jestTrzynasta = false;
        boolean jestemGlodny = true;
        // ideJest kiedy jest 13:00 lub jestemGlodny
        boolean ideJesc = jestTrzynasta || jestemGlodny;

        // ! negacja, negowanie zdania logicznego
        boolean padaDeszcz = true;
        boolean niePadaDeszcz = !padaDeszcz;

        boolean koniec = false;
        boolean nieKonczymy = !koniec;

        int liczba4= 33;
        boolean jestPodzielnaPrzez2 = liczba4%2==0;
        boolean nieParzysta = !jestPodzielnaPrzez2;

        // Relacji  <,<=,>,>=,==, !=
        int a = 5;
        int b = 7;
        int c = 1;
        int d = 7;
        //boolean czyAjestWieksza = ?
        boolean czyAjestNajwieksza = a>b && a>c && a>d;
        //boolean czyBjestWieksza = ?
        boolean czyBjestNajmniejsza = b<a && b<c && b<d;
        //czyAjestRowneB
        // == znak porównania
        // = znak przypisania
        boolean czyAjestRowneB = a==b;
        //czyBjestRowneD
        boolean czyBjestRowneD = (b==d);
        //czyDjestRozneC
        boolean czyDjestRozneC = d!=c;
        //czyAjestRowneCiDLubWiekszeOdB
        boolean czyAjestRowneCiDLubWiekszeOdB = (a==b && a==d) || a>b;

    }

    /**
     * Przyklad metody z komentarzem javaDoc
     *
     * @param argument1 oznacza nazwe firmy
     *
     * @param argument2 oznacza wiek
     */
    public static void metoda(int argument1, int argument2){
    }
}
