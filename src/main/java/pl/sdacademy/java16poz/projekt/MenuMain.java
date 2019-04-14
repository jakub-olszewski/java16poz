package pl.sdacademy.java16poz.projekt;

/**
 * MenuMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 15:41
 **/
public class MenuMain {

    public static void main(String[] args) {
        Menu menu = new Menu();
        while(true) {
            menu.wyswietl();
            OpcjaMenu opcja = menu.pobierzWybor();

            switch (opcja) {
                case ZAKONCZ:
                    System.out.println("Do widzenia");
                    break;
                case STAN_ZAMOWIENIA:
                    System.out.println("Nie zaimplementowane");
                    break;
                case NIE_POPRAWNIE:
                    System.out.println("Nie poprawny wybór. Wybierz ponownie...");
            }
        }
    }
}
