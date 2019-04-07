package pl.sdacademy.java16poz.dziedziczenie.helpdesk;

import java.util.ArrayList;
import java.util.List;

/**
 * Klient
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 09:24
 **/
public class Klient extends User{

    public Klient(){
        super("klient");
        dodajUprawnienie(Uprawnienia.KLIENT);
    }

    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
