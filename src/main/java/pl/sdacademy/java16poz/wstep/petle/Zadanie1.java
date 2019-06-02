package pl.sdacademy.java16poz.wstep.petle;

import java.util.ArrayList;
import java.util.List;

/**
 * Zadanie2
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 10:05
 **/
public class Zadanie1 {
    public static void main(String[] args) {
        /**
         * Zadanie1
         * Wypisz elementy utworzonej wcześniej Listy zawierającą imiona na literę ‚a’ lub zawierajaca litere 'a'
         * lista 10 imion
         *
         * wersja:
         * a) for
         * b) while
         *
         */
        // List = List<Object>
         List listaImion = new ArrayList();
         // dodawanie w jednej lini po przecinku - vargs
            listaImion.add("Apolinary");
            listaImion.add("Mirek");
            listaImion.add("Żaneta");
            listaImion.add("Halina");
            listaImion.add("Bogusia");
            listaImion.add("Mirosława");
            listaImion.add("Kunegunta");
            listaImion.add("Gertruda");
            listaImion.add("Bożydar");
            listaImion.add("Dżesika");

            // : - z
            // osoba z tłumu
            // osoba : tłum
            // imie z listy imion
            // imie : listaImion
            for(Object imie : listaImion){
                Object imieObiekt = imie;
                String imieString = imie.toString();//poprawna forma
                String imieString2 = (String) imie;//rzutowanie
                // a) || - lub
                // b) && - i
                if(imieString.startsWith("A") || imieString.contains("a"))
                {
                    System.out.println(imie);
                }
            }


        List<String> listaImion2 = new ArrayList<>();
        listaImion2.add("Apolinary");
        listaImion2.add("Kazik");
        listaImion2.add("Mirek");
        listaImion2.add("Żaneta");
        listaImion2.add("Halina");
        listaImion2.add("Bogusia");
        listaImion2.add("Mirosława");
        listaImion2.add("Kunegunta");
        listaImion2.add("Gertruda");
        listaImion2.add("Bożydar");
        listaImion2.add("Dżesika");

        System.out.println("========================");
        for(String imie : listaImion2){
            if(imie.toLowerCase().contains("a"))
            {
                System.out.println(imie);
            }
        }

        // wersja while

        boolean warunek = true;
        int licznik = 0;
        // dopuki warunek spełniony kod się wykonuje
        while(warunek){
            // co dziesiąta kropka ma być kółkiem "o"
            // reszta z dzielenia | przez 10 równa się zero
            if(licznik%10==0){
                System.out.print("o");
            }else{
                System.out.print(".");
            }
            licznik++;
            // zakończenie po 100;
            if(licznik>1000000){
                warunek = false;
            }
            // lub
            //warunek = licznik<100;
        }

        // liczby od 0 do 9 z użyciem while
        int x = 0;
        while (x < 10){
            System.out.println(x);
            x++;
        }


    }
}
