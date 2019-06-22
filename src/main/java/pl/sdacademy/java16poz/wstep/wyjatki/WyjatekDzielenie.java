package pl.sdacademy.java16poz.wstep.wyjatki;

import java.util.Scanner;

/**
 * WyjatekDzielenie
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 22.06.2019 11:58
 **/
public class WyjatekDzielenie {

    public static void main(String[] args) {
        // dzielenie przez 0

        double liczba = 2019;

        /**
         *
         * 1. oddzielamy deklaracje od inicjalizacji
         * 2. łapiemy wyjątek
         */
        double wynik;
        try
        {
            //wynik = 2019/0;
        }catch (ArithmeticException e){
            //System.out.println("ojoj mamy wyjątek ... ");
            throw new IllegalArgumentException("Error divide by zero");
        }
// wyjątek powoduje przerwanie działania aplikacji - dalej

        int liczbaWprowadzona = new Scanner(System.in).nextInt();
        if(liczbaWprowadzona==666){
            throw new IllegalArgumentException("Wiedz, że coś się dzieje...");
        }

    }
}
