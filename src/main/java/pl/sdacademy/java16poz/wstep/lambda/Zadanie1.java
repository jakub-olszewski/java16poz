package pl.sdacademy.java16poz.wstep.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Zadanie1 {
    public static void main(String[] args) {

        //stworz tablice 5 nazw pozycji (String), oraz wypisz z uzyciem petli for
        String[] tablicePozycji = {"pozycja1", "pozycja2", "pozycja3", "pozycja4", "pozycja5"};

        for(String pozycja : tablicePozycji){
            System.out.println(pozycja);
        }

        //wykonaj powyzsze z uzyciem stream'a

        Arrays.stream(tablicePozycji).forEach(p -> System.out.println(p)); //to jest stream   p to pozycja - nazwa parametru
        System.out.println("....");
        Arrays.asList(tablicePozycji).forEach(System.out::println); //to jest lista

        /*
        sortowanie bez uzycia lambdy
         */
        Comparator<String> sortujPoNazwie = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        Arrays.sort(tablicePozycji, sortujPoNazwie);
        System.out.println(tablicePozycji);

        // sortowanie z uzyciem lambda
        Comparator<String> sortujPoNazwieLambda = (String o1,String o2) -> o1.compareToIgnoreCase(o2);
        Arrays.sort(tablicePozycji, sortujPoNazwie);

        // lub

        Arrays.sort(tablicePozycji, (String o1,String o2) -> o1.compareToIgnoreCase(o2));
        Arrays.asList(tablicePozycji).forEach(System.out::println);

    }




    private static class WypiszTablice {
        private String[] tablicePozycji;

        public WypiszTablice(String... tablicePozycji) {
            this.tablicePozycji = tablicePozycji;
        }

        public void invoke() {
            for (String pozycja : tablicePozycji) {
                System.out.println(pozycja);
            }
                   }
    }
}