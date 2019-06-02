package pl.sdacademy.java16poz.wstep.dziedziczenie.helpdesk;

import java.util.List;

/**
 * Administrator
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 10:12
 **/
public class Administrator extends User {

    protected Administrator() {
        super("Administrator");
        dodajUprawnienie(Uprawnienia.ALL);
    }

    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
