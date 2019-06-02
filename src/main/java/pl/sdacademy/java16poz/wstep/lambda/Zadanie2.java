package pl.sdacademy.java16poz.wstep.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Zadanie2
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 11.05.2019 15:35
 **/
public class Zadanie2 {

    public static void main(String[] args) {

        /**
         * Zadanie: Stwórz listę 10 imion, za pomocą stream wypisz imiona zawierające literę a,
         * kończące się na litere a, oraz zawierające więcej 5 znaków
         *
         * Uwaga. W jednej linijce tworzenie listy oraz w jednej linijce wypisywanie z filtrowaniem
         */
        List<String> listaImion = Arrays.asList("Julia","Anna","Weronika","Monika","Klaudyna");// ...

        // użycie własnego pretty printa
        listaImion.stream().forEach(PrettyPrint::print);



    }
}
