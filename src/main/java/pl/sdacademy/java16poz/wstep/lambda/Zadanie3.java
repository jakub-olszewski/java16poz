package pl.sdacademy.java16poz.wstep.lambda;

import pl.sdacademy.java16poz.wstep.obiekty.Osoba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Zadanie3
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 11.05.2019 15:42
 **/
public class Zadanie3 {

    public static void main(String[] args) {

        /**
         * Zadanie : utwórz listę 10 obiektów Osoba. ( imie, nazwisko, wiek )
         * Wyszukaj i wypisz w z użyciem stream() w jednej linii :
         * - osoby o nazwisku Kowalski lub Kowalska
         * - pełnoletnie
         */
        Osoba julia = new Osoba("Julia", "Shewchenko", 15);
        Osoba tatiana = new Osoba("Tatiana", "Ivanowich", 15);
        Osoba oksana = new Osoba("Oksana", "Visil", 17);
        Osoba jan = new Osoba("Jan", "Kowalski", 35);

        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob = Arrays.asList(julia,tatiana,oksana,jan);

        List<Osoba> listaFiltrowana = listaOsob.stream()
               // .filter(o->o.pobierzNazwisko().contains("Kowalsk"))
                .filter(o->o.pobierzNazwisko().equalsIgnoreCase("kowalski")||o.pobierzNazwisko().equalsIgnoreCase("kowalska"))
                .filter(o->o.pobierzWiek()>17)
                .collect(Collectors.toList());

        listaFiltrowana.stream().forEach(System.out::println);
    }

}