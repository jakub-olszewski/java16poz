package pl.sdacademy.java16poz.wstep.instrukcje.przelacznik;

import pl.sdacademy.java16poz.wstep.obiekty.Osoba;
import pl.sdacademy.java16poz.wstep.typnumeryczny.Ocena;

/**
 * SwitchMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 11:59
 **/
public class SwitchMain {

    public static void main(String[] args) {

        Ocena mojaOcena = Ocena.BRAK;

        // -------------------------- metoda nie statyczna
        Osoba janusz = new Osoba();
        // na obiekcie janusz mozemy wywolac po . kropce metodę
        janusz.pobierzNazwisko();
        // --------------------------


        // -------------------------- metoda statyczna
        // tutaj nie mam obiektu ? dlatego do metody dopisujemy 'static'
        powiedzMiJakSieUcze(mojaOcena);

    }

    public static void powiedzMiJakSieUcze(Ocena mojaOcena){
        switch (mojaOcena){
            case BRAK:
                System.out.println("Uczestniczysz w zajęciach ?");
                break;
            case CELUJACY:
                System.out.println("Nie wiem co powiedzieć, idealnie !");
                break;
            case DOBRY:
                System.out.println("Dobrze, tak trzymaj");
            case DOPUSZCZAJACY:
                System.out.println("W miare, ale wiesz, że można lepiej");
                //break;
            case NIEDOSTATECZNY:
                System.out.println("Super, ale musisz bardzo często ćwiczyć");
                break;
            default:// opcja nie obsługiwana powyżej
                System.out.println("Nie rozumiem pytania");
        }
    }
}
