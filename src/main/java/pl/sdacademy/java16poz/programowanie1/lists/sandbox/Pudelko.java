package pl.sdacademy.java16poz.programowanie1.lists.sandbox;

/**
 * Pudelko na frytki
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 09:57
 **/
public class Pudelko extends Frytki {

    Frytki frytki;

    /**
     * Metoda do wkładania frytek do pudełka
     * @param frytki
     */
    public void wloz(Frytki frytki){
        System.out.println("Do pudelka trafia "+frytki);
        this.frytki = frytki;
    }
}
