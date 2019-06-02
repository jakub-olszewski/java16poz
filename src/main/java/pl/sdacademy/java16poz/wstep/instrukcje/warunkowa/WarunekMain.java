package pl.sdacademy.java16poz.wstep.instrukcje.warunkowa;

import pl.sdacademy.java16poz.wstep.typnumeryczny.Plec;
import static pl.sdacademy.java16poz.wstep.typnumeryczny.Plec.KOBIETA;

/**
 * WarunekMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 15:09
 **/
public class WarunekMain {

    public static boolean jestPomiedzy(int wartosc,int min,int max){
        return wartosc<=max && wartosc>min;
    }
    public static void main(String[] args) {

        // Zadanie:
        // wartosc wiek
        // w zaleznosci od wieku
        // 0-12 podstawowka
        // 12-18 liceum
        // 18-25 studia
        // 25-50 doktorat

        // jest pełnoletni

        // Uwagi zwróć uwagę na < <= >= >
        // użyj if, else, else if

        int wiek = 15;

        if(wiek<=12){
            System.out.println("Podstawowka");
        }else if(wiek<=18){
            System.out.println("Liceum");
        }else if(18<wiek && wiek<=25){
            System.out.println("Studia");
        }else if(jestPomiedzy(wiek,25,50)){
            System.out.println("Doktorat");
        }

        int godzina = 8;

        if(godzina>24 || godzina<0){
            System.out.println("Nie prawidłowa godzina");
        }else if(godzina==13){
            System.out.println("Przerwa obiadowa");
        }else if(godzina>9 && godzina<16){
            System.out.println("Zajęcia");
        }else{
            System.out.println("Czas poza zajęciami");
        }


        if(Sprawdz.czyJestCieplo(33)){
            System.out.println("Fajna pogoda");
        }else{
            System.out.println("Znośna pogoda");
        }
        String plec = "kobieta";
        if(Sprawdz.czyJestKobieta(plec)){
            System.out.println("Jestem kobietą");
        }

        // wersja z typem wyliczeniowym
        Plec plec2 = KOBIETA;
        if(Sprawdz.czyJestKobieta(plec2)){
            System.out.println("Jestem kobietą");
        }

        //Sprawdz.czyJestZadowolona(); metoda prywatna: pomocniczePytanieDoKobiety
        // nie jest tutaj widoczna
    }
}
