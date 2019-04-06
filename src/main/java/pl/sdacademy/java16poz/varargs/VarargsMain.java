package pl.sdacademy.java16poz.varargs;

import java.util.ArrayList;
import java.util.List;

/**
 * VarargsMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 11:20
 **/
public class VarargsMain {

    public static void wypisz(int... tablica){
        for(int i =0; i < tablica.length;i++){
            // element z tablicy tablica[1]
            System.out.print(tablica[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        System.out.printf("%d%d%d\n",1,2,3);//4
        System.out.printf("%d%d\n",1,2);//4
        System.out.printf("%d\n",1);//2

        wypisz(1,2,3);
        wypisz(1,2);
        wypisz(1);

        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(3);
        //...

        dodajDoListy(listaLiczb,1,2,3);
        wypiszListe(listaLiczb);
        // wypisać i sprawdzić czy dodało poprawnie
    }

    private static void wypiszListe(List<Integer> listaLiczb) {
        // TODO Zadanie wypisz zawartość listy z użyciem pętli
    }

    private static void dodajDoListy(List<Integer> listaLiczb, int... liczbyTablica) {
        /**
         * Zadanie
         */
        // for - petla
        // w pętli dodawać elementy tablicy do listy


        for(int i =0; i < liczbyTablica.length;i++){
            // element z tablicy tablica[1]
            int elementTablicy = liczbyTablica[i];
            //dodawanie do listy
            listaLiczb.add(elementTablicy);
        }
    }
}
