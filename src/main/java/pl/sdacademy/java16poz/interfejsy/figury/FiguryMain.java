package pl.sdacademy.java16poz.interfejsy.figury;

/**
 * FiguryMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 13:44
 **/
public class FiguryMain {

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

        Figura trojkatFigura = new TrojkatFiguraImpl();
        float obwodTrojkata = trojkatFigura.obliczObwod();
        trojkatFigura.wypiszDane();

        Figura trojkatFigura2 = new TrojkatFiguraImpl(10,2,5);
        float obwodTrojkata2 = trojkatFigura.obliczObwod();
        trojkatFigura2.wypiszDane();
    }
}
