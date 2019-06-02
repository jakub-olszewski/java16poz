package pl.sdacademy.java16poz.wstep.typydanych;

import pl.sdacademy.java16poz.wstep.obiekty.Osoba;
import pl.sdacademy.java16poz.wstep.obiekty.User;

/**
 * StringMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 15:40
 **/
public class StringMain {

    public static void main(String[] args) {
        User uzytkownik = new User();
        Osoba osoba = new Osoba();

        System.out.println(uzytkownik);
        System.out.println(osoba);

        System.out.println(uzytkownik.toString());
        System.out.println(osoba.toString());

        System.out.println("Napis");
        System.out.println("Napis".toString());
    }
}
