package pl.sdacademy.java16poz.instrukcje.warunkowa;

/**
 * WarunekMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 15:09
 **/
public class WarunekMain {

    public static void main(String[] args) {

        // Zadanie:
        // wartosc wiek
        // w zaleznosci od wieku
        // 0-12 podstawowka
        // 12-18 liceum
        // 18-25 studia
        // 25-50 doktorat
        // Uwagi zwróć uwagę na < <= >= >
        // użyj if, else, else if

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



    }
}
