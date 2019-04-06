package pl.sdacademy.java16poz.scanner;

import java.util.Random;

/**
 * Zadanie3
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 13:24
 **/
public class Zadanie3 {

    public static void main(String[] args) {
        /**
         * TODO Zadanie dodatkowe
         * Gra w kości z komputerem
         */
        Random losuj = new Random();
        int wylosowano = losuj.nextInt(5);
        System.out.println(wylosowano);
    }
}
