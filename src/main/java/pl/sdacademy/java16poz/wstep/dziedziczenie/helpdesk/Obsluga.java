package pl.sdacademy.java16poz.wstep.dziedziczenie.helpdesk;

import java.util.List;

/**
 * Obsluga
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 10:14
 **/
public class Obsluga extends User{
    protected Obsluga() {
        super("Obsługa");
        dodajUprawnienie(Uprawnienia.OBSLUGA);
    }

    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
