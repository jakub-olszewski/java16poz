package pl.sdacademy.java16poz.wstep.instrukcje.warunkowa;

import pl.sdacademy.java16poz.wstep.typnumeryczny.Plec;

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
        if (temperatura>30){
            return true;
        }
        else {
            return false;
        }
        //zamiast kodu powyżej wystarczy jedna linia
        //return temperatura>30;
    }

    public static boolean czyJestPredkoscDozwolona(float predkosc){
        return predkosc<=50;
        // negacja
        // predkosc>50
    }

    public static boolean czyMaszMandat(float predkosc){
        return !czyJestPredkoscDozwolona(predkosc);
    }

    public static boolean czyJestGlosno(float decybel){
        return decybel>80;
    }

    /**
     * Uzyj pozostałych metod
     * @return
     */
    public static boolean czyJestZadowolona(){
        boolean odpowiedz= false;
        boolean pytanie = pomocniczePytanieDoKobiety(33,60);
        return odpowiedz;
    }

    private static boolean pomocniczePytanieDoKobiety(int temperatura, int decybel){
        boolean wynik = true;
        // '&= wartość' dopisanie do zmiennej po lewej stronie
        // 'odpowiedz = odpowiedz && wartość'
        // podobnie z '|='
        // 'odpowiedz = odpowiedz || wartość'
        wynik &= czyJestCieplo(temperatura);
        wynik |= czyJestKobieta("kobieta");
        wynik &= czyJestGlosno(decybel);
        return wynik;
    }
}
