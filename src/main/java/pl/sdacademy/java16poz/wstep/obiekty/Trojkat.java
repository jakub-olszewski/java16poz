package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * Trojkat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 11:49
 **/
public class Trojkat {
    // zalozenia trojkat prostokatny - nie sprawdzamy warunku trojkata


    // odpowiednie pola
    int wysokosc;
    int podstawa;
    int bok;

    // konstruktor
    public Trojkat(int a, int h, int b)
    {
        wysokosc = h;
        podstawa = a;
        bok = b;
    }

    // metody:
    // * oblicz pole,  * - mnożenie   + - dodawanie
    public double obliczPole()
    {
        return 0.5*podstawa*wysokosc;
    }
    // * oblicz obwod
    public int obliczObwod(){
        return podstawa+wysokosc+bok;
    }

    // * wypiszInfo() - informacje o trojkacie wszystkich
    public void wypiszInfo(){
        System.out.println("wysokość: " + wysokosc);
        System.out.print("podstawa: " );
        System.out.println(podstawa);
        System.out.println("bok: " + bok);
    }
}
