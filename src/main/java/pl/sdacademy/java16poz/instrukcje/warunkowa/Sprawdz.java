package pl.sdacademy.java16poz.instrukcje.warunkowa;

import pl.sdacademy.java16poz.typnumeryczny.Plec;

/**
 * Sprawdz
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 15:41
 **/
public class Sprawdz {

    public static boolean czyJestPelnoletni(int wiek){
        return wiek>=18;
    }

    // string toLowerCase()
    public static boolean czyJestKobieta(String plec){
        return plec == "kobieta";
    }

    /**
     * Wersja powyższej metody z użyciem typu wyliczeniowego
     * @param plecOsoby
     * @return prawda/fałsz
     */
    public static boolean czyJestKobieta(Plec plecOsoby){
        return plecOsoby.equals(Plec.KOBIETA);
    }

    /**
     * Metoda z użyciem toLowerCase() czyli zmniejsz znaki
     * @param plec
     * @return prawda/fałsz
     */
    public static boolean czyJestKobieta2(String plec){
        String plecMalymiLiterami = plec.toLowerCase();
        return plecMalymiLiterami.equals("kobieta");
    }

    public static boolean czyJestCieplo(int temperatura){
        return false;
    }

    public static boolean czyJestPredkoscDozwolona(float predkosc){
        return false;
    }

    public static boolean czyMaszMandat(float predkosc){
        return false;
    }

    public static boolean czyJestGlosno(float decybel){
        return false;
    }

    /**
     * Uzyj pozostałych metod
     * @return
     */
    public static boolean czyJestZadowolona(){
        boolean odpowiedz= true;
        odpowiedz &= czyJestCieplo(33);
        //odpowiedz = odpowiedz && czyJestCieplo(33); // to samo co wyżej
        odpowiedz |= czyJestKobieta("kobieta");
        return false;
    }
}
