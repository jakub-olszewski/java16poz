package pl.sdacademy.java16poz.wstep.dziedziczenie.helpdesk;

import java.util.ArrayList;
import java.util.List;

/**
 * User
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 09:24
 **/
public abstract class User {

    protected String nazwa;

    //pola
    protected List<Uprawnienia> listaUprawnien;

    //konstruktory
    protected User(String nazwa){
        this.nazwa = nazwa;
        listaUprawnien = new ArrayList();
    }

    protected void dodajUprawnienie(Uprawnienia uprawnienie){
        listaUprawnien.add(uprawnienie);
    }

    protected void przedstawSie(){
        System.out.println(nazwa);
    }

    //metody
    public abstract List<Uprawnienia> pobierzUprawnienia();
}
