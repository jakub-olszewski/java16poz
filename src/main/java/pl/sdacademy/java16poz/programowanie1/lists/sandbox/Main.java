package pl.sdacademy.java16poz.programowanie1.lists.sandbox;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 09:48
 **/
public class Main {

    public static void main(String[] args) {
        // tworzymy mc donald
        McDonald mcDonald = new McDonald();
        // tworzymy pojemnij na frytki
        Pudelko pojemnikNaFrytki = new Pudelko();
        // do pojemnika na frytki wrzucamy frytki z MC Donald
        Frytki frytki = mcDonald.poproszeFrytki();
        frytki.polejKetchupem();
        pojemnikNaFrytki.wloz(frytki);

        Telewizor telewizor = new Telewizor();
        telewizor.ustawKanal(5);
    }
}
