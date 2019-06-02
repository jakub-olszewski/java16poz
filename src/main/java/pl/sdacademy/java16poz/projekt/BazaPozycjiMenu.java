package pl.sdacademy.java16poz.projekt;


import pl.sdacademy.java16poz.wstep.obiekty.PozycjaZamowienia;

import java.util.HashMap;

public class BazaPozycjiMenu extends HashMap<Integer, PozycjaZamowienia> {
    /**
     * konstruktor który tworzy bazę pozycji wymaganej do projektu zamówień
     */
    public BazaPozycjiMenu(){// O(13) ~ O(1)
        super(); //tworzenie mapy//1
        put(1, new PozycjaZamowienia("Kaczka", 25));//4
        put(2, new PozycjaZamowienia("Frytki", 7));//4
        put(3, new PozycjaZamowienia("Ziemniaki", 8));//4
    }

    /**
     * metoda pobiera pozycje
     *
     * @param numerPozycji - numer pozycji którą pobieramy
     * @return - zwraca pozycję zamówienia
     */
    public PozycjaZamowienia pobierzPozycje(int numerPozycji) {

        return get(numerPozycji);
    }

    /**
     * metoda zwraca informację o istnieniu danej pozycji
     * @param numerPozycji- numer sprawdzanej pozycji
     * @return- zwraca prawada/falsz gdy zawiera
     */
    public boolean czyZawieraPozycje (int numerPozycji) {
        return containsKey(numerPozycji);
    }

    /**
     * metoda wypisuje pozycje z bazy
     */

    public void wypiszPozycjeZBazy() {
        StringBuilder podumowanieNapis = new StringBuilder();//1

        for (Entry<Integer, PozycjaZamowienia> element : entrySet()) {// 10*n
            int numer =element.getKey();
            PozycjaZamowienia pozycja = element.getValue();
            float cena = pozycja.pobierzCene();
            String nazwa = pozycja.pobierzNazwe();
           podumowanieNapis.append(numer).append(" ").append(nazwa).append(" ").append(cena).append("\n");

            // TODO dodaj metodę toString() do klasy pozycjaZamowienia
            // TODO użyj stringbuilder do wypisywania powyższych informacji
        }
        System.out.println(podumowanieNapis.toString());//1
        // f(n) =  1+ 10*n +1 = 10n +2   ~ O(n)
    }

}