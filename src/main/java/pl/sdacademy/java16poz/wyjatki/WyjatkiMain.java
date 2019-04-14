package pl.sdacademy.java16poz.wyjatki;

import java.util.concurrent.TimeUnit;

/**
 * WyjatkiMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.04.2019 11:10
 **/

public class WyjatkiMain {

    public static void main(String[] args) {
        /**
         * TODO Zadanie wyjątki
         * Stworzenie metod zrzucających wyjątki
         * TimeUnit wykorzystaj enum
         * * pobierzSekundy(int minuty,TimeUnit unit)
         * * pobierzSekundy(int dni,TimeUnit unit)
         * w main wywołanie metod
         * złapanie wyjątków,
         * wyświetlenie odpowiedniego komunikatu o zainstniałym wyjątku
         */

        int sekundy = pobierzSekundy(5,TimeUnit.DAYS);
        System.out.println(sekundy);

        int sekundy2 = 0;
        try
        {
            sekundy2 = pobierzSekundy(2,TimeUnit.HOURS);
        }catch (IllegalArgumentException e){
            System.out.println("Wyjątek:"+e.getMessage());
        }
        System.out.println(sekundy2);

    }


    public static int pobierzSekundy(int ilosc, TimeUnit unit){
        if(unit.equals(TimeUnit.HOURS)){
            if(ilosc<0){
                throw new IllegalArgumentException("Godzina > 0");
            }else{
                return ilosc*60*60;
            }
        }
        return -1;// oznacza błędne obliczenie
    }
}
