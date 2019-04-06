package pl.sdacademy.java16poz.vargs;

import java.util.ArrayList;
import java.util.List;

/**
 * VargsMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 11:20
 **/
public class VargsMain {

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
    }

    private static void dodajDoListy(List<Integer> listaLiczb, int... liczbyTablica) {
        /**
         * Zadanie
         */
        // for - petla
        // w pętli dodawać elementy tablicy do listy
    }
}