package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 15:40
 **/
public class User {

    String imie,nazwisko; // jeśli są tego samego typu można napisać po przecinku
    int wiek;

    public User(){
        imie = "name";
        nazwisko = "surname";
        wiek = -1;
    }

    public String toString(){
        return imie+" "+nazwisko;
    }
}
