package pl.sdacademy.java16poz.wstep.dziedziczenie.helpdesk;

import java.util.List;

/**
 * Klient
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 09:24
 **/
public class Klient extends User{

    public Klient(){
        super("Klient");
        dodajUprawnienie(Uprawnienia.KLIENT);
    }

    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
