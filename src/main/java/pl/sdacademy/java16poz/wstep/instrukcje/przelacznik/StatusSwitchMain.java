package pl.sdacademy.java16poz.wstep.instrukcje.przelacznik;

import pl.sdacademy.java16poz.wstep.typnumeryczny.Status;

/**
 * StatusSwitchMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 12:27
 **/
public class StatusSwitchMain {

    /**
     * Zadanie:
     * Wykorzystując typ wyliczeniowy – enum  Status ( uzytkownika)
     * i switch utwórz metodę wypisująca komunikat w zależności od statusu.
     * DOSTEPNY,NIEDOSTEPNY,NIEAKTYWNY
     */
    public static void main(String[] args) {

        Status mojStatus = Status.AKTYWNY;

        wypiszStatus(mojStatus);

        // ale dlaczego zrobiłeś to switchem ?
        // można było to zrobić w jednej lini jak poniżej
        System.out.println(mojStatus.toString().toLowerCase());

    }

    public static void wypiszStatus(Status mojStatus){
        switch(mojStatus){
            case AKTYWNY:
                System.out.println("aktywny");
                break;
            case ZALOGOWANY:
                System.out.println("zalogowany");
                break;
            case NIE_ZALOGOWANY:
                System.out.println("nie zalogowany");
        }
    }

}
