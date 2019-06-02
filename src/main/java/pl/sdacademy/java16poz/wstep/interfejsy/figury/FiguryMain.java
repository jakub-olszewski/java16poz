package pl.sdacademy.java16poz.wstep.interfejsy.figury;

/**
 * FiguryMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 13:44
 **/
public class FiguryMain {

    public static void witaj(){
        System.out.println("--- Figury ---");
    }

    public static void main(String[] args) {

        /** interfejs: Figura
         *  * metoda: float obliczPole()
         *  * metoda: float obliczObwod()
         *  * metoda: void wypiszDane() - pretty print, przyjazne dla użytkownika
         *
         *  Klasy: ( implementować interfejs Figura )
         *  * TrojkatFiguraImpl
         *  * KwadratFiguraImpl
         *  * KoloFiguraImpl
         *  * ProstokatFiguraImpl
         *
         *  Klasy zawieraja odpowiednie pola - wymagane do metod
         *
         *  Main:
         *   Tworzenie wszystkich figur. Wypisanie pól i obwodów
         *
         *   Dodatkowowo: suma pól i suma obwodów
         *
         *
         */

        witaj();// metoda zaimplementowana na początku

        Figura trojkatFigura = new TrojkatFiguraImpl();
        float obwodTrojkata = trojkatFigura.obliczObwod();
        trojkatFigura.wypiszDane();

        Figura trojkatFigura2 = new TrojkatFiguraImpl(10,2,5);
        float obwodTrojkata2 = trojkatFigura.obliczObwod();
        trojkatFigura2.wypiszDane(); // metoda wypisuje dane obiektu trojkatFigura2

        Figura koloFigura = new KoloFiguraImpl();

        // deklaracja: float obwodKolo;
        // inicjalizajca: obwodKolo = 12;
        // koloFigura - zmienną która posiada metode obliczObwod()

        /**
         * w linii 59 tworzymy zmienna obwodKolo i przypisujemy
         * wartość zwróconą przez metodę o nazwie obliczObwod()
         * wykonanej na obiekcie o nazwie koloFigura
         */
        float obwodKolo = koloFigura.obliczObwod();
        koloFigura.wypiszDane();

        // stworzy prostokat domyslne parametry
        Figura prostokatFigura = new ProstokatFiguraImpl();
        float obwodProstokata = prostokatFigura.obliczObwod();
        prostokatFigura.wypiszDane();

        // stworzyc kwadrat domyslne parametry
        Figura kwadratFigura = new KwadratFiguraImpl();
        float obwodKwadratu = kwadratFigura.obliczObwod();
        kwadratFigura.wypiszDane();

        // suma wszystkich obwodów
        float sumaObwodow = 0;
        //sumaObwodow = obwodKolo+obwodKwadratu+obwodProstokata...
        // += to zwiększenie o ...
        sumaObwodow += obwodKolo;
        // to jest to samo co ...
        //sumaObwodow = sumaObwodow + obwodKolo;
        sumaObwodow += obwodKwadratu;
        sumaObwodow += obwodProstokata;
        sumaObwodow += obwodTrojkata;

        System.out.println("Suma obwodów figur = "+sumaObwodow);
    }
}
