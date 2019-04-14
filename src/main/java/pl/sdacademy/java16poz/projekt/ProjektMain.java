package pl.sdacademy.java16poz.projekt;

import pl.sdacademy.java16poz.obiekty.Zamowienie;

import java.util.ArrayList;
import java.util.List;

/**
 * MenuMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 15:41
 **/
public class ProjektMain {

    public static void main(String[] args) {

        Menu menu = new Menu();
        List<Zamowienie> listaZamowień = new ArrayList<>();
        //listaZamowień.size(); // numer zamówienia

        while(true) {// TODO dodaj przełącznik boolean który kończy
            menu.wyswietl();
            OpcjaMenu opcja = menu.pobierzWybor();

            switch (opcja) {
                case ZAKONCZ:
                    System.out.println("Do widzenia");
                    // TODO użycie przełącznika na zakończ
                    break;
                case ZLOZ_ZAMOWIENIE:
                    // TODO zebranie danych do zamówienia
                    // TODO scanner pobieranie danych do zamówienia
                    // TODO tworzymy nowe zamówienie
                    // TODO dodajemy do listy zamówień
                    // TODO dodaj pozycje do zamówienia
                    // TODO scanner pobieranie danych do pozycji
                    // TODO ręcznie wpisujemy nazwę i kwotę
                    // TODO dodajemy pozycję do zamówienia
                    break;
                case STAN_ZAMOWIENIA:
                    System.out.println("Nie zaimplementowane");
                    // TODO wprowadź numer skanerem z klawiatury
                    // TODO filtrowanie listy zamówień po numerze
                    // TODO petla i warunek na numer zamówienia realizacja filtrowania
                    // TODO wypisz informacje [zamowienie.rachunek()]
                    break;
                case LISTA_ZAMOWIEN:
                    // TODO wypisz liste zamówień
                    break;
                case NIE_POPRAWNIE:
                    System.out.println("Nie poprawny wybór.\nWybierz ponownie...");
            }
        }
    }
}
