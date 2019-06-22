package pl.sdacademy.java16poz.wstep.wyjatki;

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
         * Zadanie wyjątki
         * Stworzenie metod zrzucających wyjątki
         * TimeUnit wykorzystaj enum
         * * pobierzSekundy(int minuty,TimeUnit unit)
         * * pobierzSekundy(int dni,TimeUnit unit)
         * w main wywołanie metod
         * złapanie wyjątków,
         * wyświetlenie odpowiedniego komunikatu o zainstniałym wyjątku
         */


        int sekundy = 0;
        try
        {
            sekundy = pobierzSekundy(2,TimeUnit.HOURS);
            System.out.println(sekundy);
            //sekundy = pobierzSekundy(100,TimeUnit.DAYS);
            //System.out.println(sekundy);
            sekundy = pobierzSekundy(5,TimeUnit.HOURS);
            System.out.println(sekundy);
            sekundy = pobierzSekundy(3,TimeUnit.HOURS);
            System.out.println(sekundy);
            sekundy = pobierzSekundy(3,TimeUnit.MINUTES);
            System.out.println(sekundy);
        }catch (IllegalArgumentException e){
            System.out.println("Wyjątek:"+e.getMessage());
        }
        //System.out.println(sekundy);


    }


    public static int pobierzSekundy(int ilosc, TimeUnit unit){

        if(ilosc<0){
            throw new IllegalArgumentException(unit.name()+" > 0"+" you have "+ilosc);
        }
        if(unit.equals(TimeUnit.HOURS) && ilosc>24 ){
            throw new IllegalArgumentException(unit.name()+" < 24"+" you have "+ilosc);
        }
        if(unit.equals(TimeUnit.DAYS) && ilosc>30 ){
            throw new IllegalArgumentException(unit.name()+" < 24"+" you have "+ilosc);
        }
        // ... dokończyć wyjątki na minuty i sekundy
        if ( unit.equals(TimeUnit.MINUTES) && ilosc>60 || unit.equals(TimeUnit.SECONDS)&& ilosc>60){
            throw  new IllegalArgumentException(unit.name()+" < 60");
        }


//        int result = ilosc;
//        switch (unit){
//            case DAYS:
//                result *= 24;
//            case HOURS:
//                result *= 60;
//            case MINUTES:
//                result *= 60;
//                break;
//            default:
//                result = -1;
//        }

        int result = 0;
        switch (unit){
            case DAYS:
                result = ilosc*60*60*24;
                break;
            case HOURS:
                result = ilosc*60*60;
                break;
            case MINUTES:
                result = ilosc*60;
                break;

            default:
                result = -1;
        }

        return result;// oznacza błędne obliczenie
    }
}
