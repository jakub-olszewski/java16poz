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

        dodajDoListy(listaLiczb,4,5,6,7,8,9);
        wypiszListe(listaLiczb);
        // wypisać i sprawdzić czy dodało poprawnie

        List<Integer> listaNowychLiczb = stworzListeLiczb(32,34,233,234,12);

    }

    /**
     * Zadanie: Wykorzystaj ... i zaimplementuj metode ktora zwraca liste liczb
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @param i4
     * @return
     */
    private static List<Integer> stworzListeLiczb(int i, int i1, int i2, int i3, int i4) {
        return null;
    }

    private static void wypiszListe(List<Integer> listaLiczb) {
        // TODO Zadanie wypisz zawartość listy z użyciem pętli
        for (int liczba : listaLiczb){
            System.out.println(liczba);
        }
    }

    private static void dodajDoListy(List<Integer> listaLiczb, int... liczbyTablica) {
        /**
         * Zadanie
         */
        // for - petla
        // w pętli dodawać elementy tablicy do listy

        //listaLiczb.clear();
        for(int i =0; i < liczbyTablica.length;i++){
            // element z tablicy tablica[1]
            int elementTablicy = liczbyTablica[i];
            //dodawanie do listy
            listaLiczb.add(elementTablicy);
        }
    }
}
