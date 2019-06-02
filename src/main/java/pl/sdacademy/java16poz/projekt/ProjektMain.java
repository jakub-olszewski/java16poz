package pl.sdacademy.java16poz.projekt;

import pl.sdacademy.java16poz.wstep.obiekty.PozycjaZamowienia;
import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MenuMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 15:41
 **/
public class ProjektMain {

    public static void main(String[] args) {

        Menu menu = new Menu();
        List<Zamowienie> listaZamowien = new ArrayList<>();
        //listaZamowień.size(); // numer zamówienia

        while(true) {// TODO dodaj przełącznik boolean który kończy
            menu.wyswietl();
            OpcjaMenu opcja = menu.pobierzWybor();

// TODO scanner pobieranie danych do pozycji
            Scanner skaner = new Scanner(System.in);

            switch (opcja) {
                case ZAKONCZ:
                    System.out.println("Do widzenia");
                    // TODO użycie przełącznika na zakończ
                    break;
                case ZLOZ_ZAMOWIENIE:
                    //  zebranie danych do zamówienia
                    // tworzymy nowe zamówienie
                    int numer = listaZamowien.size()+1;
                    Zamowienie zamowienie = new Zamowienie(numer);
                    // TODO dodajemy do listy zamówień

                    BazaPozycjiMenu mapaPozycji = new BazaPozycjiMenu();
                    mapaPozycji.wypiszPozycjeZBazy();
                    System.out.println("Podaj numer: ");
                    int numerPozycji = skaner.nextInt();
                    PozycjaZamowienia pobranaPozycja = mapaPozycji.pobierzPozycje(numerPozycji);
                    zamowienie.dodajPozycje(pobranaPozycja);

                   /* // TODO ręcznie wpisujemy nazwę i kwotę
                    System.out.println("Podaj nazwę pozycji:");
                    String nazwa = skaner.nextLine();
                    // TODO pobieranie ceny
                    System.out.println("Podaj cenę pozycji:");
                    boolean czyPrawidlowaKwota = false;
                    float cena = 0;
                    while (!czyPrawidlowaKwota){
                        try {
                            Scanner skanerKwota = new Scanner(System.in);
                            cena = skanerKwota.nextFloat();
                            czyPrawidlowaKwota = true;
                        }catch(InputMismatchException e){
                            System.out.println("Nie prawidłowa kwota użyj przecinka");
                        }
                    }*/

                    // TODO poniżej wstaw pobraną cenę
                    // dodajemy pozycję do zamówienia
                    //zamowienie.dodajPozycje(nazwa,cena);
                    // TODO dodatkowo dodawanie wielu pozycji
                    // dodanie zamówienia do listy zamówień
                    listaZamowien.add(zamowienie);
                    break;
                case SPRAWDZ_ZAMOWIENIE:
                    System.out.println("Wprowadź numer zamówienia: ");
                    // TODO wprowadź numer skanerem z klawiatury
                    int szukanyNumerZamowienia = skaner.nextInt();
                    boolean czyZnaleziono=false;
                    // TODO filtrowanie listy zamówień po numerze
                    for (Zamowienie element: listaZamowien){
                        if(szukanyNumerZamowienia==element.pobierzNumer()){ //elementem jest zamówienie
                            Wypisz.daneOZamowieniu(element);
                        czyZnaleziono=true;
                        }

                    }
                    if(!czyZnaleziono){// wykrzyknik oznacza nie(negacja)
                        Wypisz.nieZnaleziono();
                    }
                    // TODO petla i warunek na numer zamówienia realizacja filtrowania
                    // TODO wypisz informacje [zamowienie.rachunek()]

                    break;
                case LISTA_ZAMOWIEN:

                    // TODO wypisz liste zamówień
                    // TODO użyć pętli do wyświetlenia listy
                    // for(Typ zamowienie: listaZamowien )
                    // {     zamowienie.pobierzNumer();
                    //       zamowienie.pobierzCene();
                    //       uzywając StringBuilder
                    //       ładnie wypisać
                    // }
                    for(Zamowienie zamowienieElement :listaZamowien){
                        int numerZamowienia = zamowienieElement.pobierzNumer();
                        System.out.println("Zamówienie nr. "+numerZamowienia);
                        List<PozycjaZamowienia>  listaPozycji = zamowienieElement.pobierzPozycje();
                        for(PozycjaZamowienia pozycja:listaPozycji){
                            System.out.println();
                            pozycja.prettyPrint();
                        }
                    }
                    menu.powrot();
                    break;
                case NIE_POPRAWNIE:
                    System.out.println("Nie poprawny wybór.\nWybierz ponownie...");
            }
        }
    }
}
