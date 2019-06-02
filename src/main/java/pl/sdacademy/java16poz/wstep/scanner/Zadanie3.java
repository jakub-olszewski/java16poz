package pl.sdacademy.java16poz.wstep.scanner;

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
         * Zadanie dodatkowe
         * Gra w kości z komputerem
         */
//        Random losuj = new Random();
//        int wylosowano = losuj.nextInt(5);
//        System.out.println(wylosowano);

        boolean warunekKontynuacji = true;
        int numerGry = 0;
        while (warunekKontynuacji) {// gramy aż wygramy ( warunkiem zakończenia jest wygrana
            numerGry++;
            System.out.println("Gra:"+numerGry);
            int mojaLiczba = wylosujIPobierzWartoscKostki();
            System.out.println("wykulałeś kostką:" +mojaLiczba );

            int wylosowano = wylosujIPobierzWartoscKostki();
            System.out.println("Komputer wyolosował liczbę:" + wylosowano);

            if (mojaLiczba > wylosowano && mojaLiczba>=1 && mojaLiczba<=6) {
                System.out.println("brawo, wygrałeś !");
                warunekKontynuacji=false;// wygrałeś nie kontynuujemy dalej gry
            } else if (mojaLiczba < wylosowano) {
                System.out.println("przykro mi przegrałeś, spróbuj ponownie");
            } else {
                System.out.println("remis, spróbuj ponownie");

            }
            System.out.println("---------------------------");
        }
    }

    public static int wylosujIPobierzWartoscKostki(){
        Random losuj = new Random();
        int wylosowano = losuj.nextInt(6) + 1;
        return  wylosowano;
    }
}
