package pl.sdacademy.java16poz.wstep.dziedziczenie.helpdesk;

/**
 * HelpDeskMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 09:10
 **/
public class HelpDeskMain {
    public static void main(String[] args) {
        /**
         * Utwórz klasę abstrakcyjna User tak by metoda
         * przedstawSie zależała od tego kim jesteśmy.
         * Administrator->User, Obsluga->User,Klient->User
         * Klasa abstrakcyjna zawiera metodę abstrakcyjną:
         * - List<Uprawnienia> pobierzUprawnienia()
         * - enum Uprawnienia
         *
         * Administrator:
         * ALL
         *
         * User:
         * USER
         *
         * Klient:
         * KLIENT
         */
        Administrator admin = new Administrator();
        admin.przedstawSie();// Administrator
        Obsluga obsluga = new Obsluga();
        obsluga.przedstawSie();// Obsluga
        Klient klient = new Klient();
        klient.przedstawSie();// klient

    }
}
