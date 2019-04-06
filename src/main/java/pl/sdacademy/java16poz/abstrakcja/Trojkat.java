package pl.sdacademy.java16poz.abstrakcja;

/**
 * Trojkat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:59
 **/
public class Trojkat extends Figura {
    public Trojkat(int bok1,int bok2,int podstawa, int wysokosc) {
        super("Trójkąt");
        this.a = podstawa;
        this.b = bok1;
        this.c = bok2;
        this.h = wysokosc;
    }

    @Override
    public float obliczPole() {
        return 1/2*(a*h);
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
