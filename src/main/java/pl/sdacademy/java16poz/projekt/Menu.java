package pl.sdacademy.java16poz.projekt;

import java.util.Scanner;

/**
 * Menu
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 15:41
 **/
public class Menu {


    public void wyswietl() {
        System.out.println("======================");
        System.out.println("====== MC DONALD =====");
        System.out.println("======================");
        System.out.println("Menu:");
        System.out.println("1. Złóż zamówienie");
        System.out.println("2. Sprawdź status");
        System.out.println("0. Zakończ");

    }

    public OpcjaMenu pobierzWybor() {
        System.out.println("---------------------");
        System.out.println("Twój wybór: ");
        Scanner skaner = new Scanner(System.in);
        int opcja = skaner.nextInt();
        switch (opcja){
            case 1 :
                return OpcjaMenu.ZLOZ_ZAMOWIENIE;

            case 0 :
                return OpcjaMenu.ZAKONCZ;

            default:
                return OpcjaMenu.NIE_POPRAWNIE;
        }

    }
}
