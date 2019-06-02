package pl.sdacademy.java16poz.wstep.klasy;

import pl.sdacademy.java16poz.wstep.obiekty.Trojkat;

/**
 * TrojkatMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 11:51
 **/
public class TrojkatMain {
    public static void main(String[] args) {
        // utworzenie trojkata
        Trojkat nowyTrojkat = new Trojkat(3,4,5);

        // obliczenie pola
        double pole = nowyTrojkat.obliczPole();
        System.out.println(pole);

        // obliczenie obwodu
        int obwod = nowyTrojkat.obliczObwod();
        System.out.println(obwod);

        // wypisanie informacji
        nowyTrojkat.wypiszInfo();

    }


}
