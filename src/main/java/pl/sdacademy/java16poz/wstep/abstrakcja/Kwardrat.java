package pl.sdacademy.java16poz.wstep.abstrakcja;

/**
 * Kwardrat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:24
 **/
public class Kwardrat extends Figura{

    public Kwardrat(int a) {
        // super wywołanie konstruktora z Figury
        super("Kwadrat");
        this.a = a;
    }

    @Override
    public float obliczPole() {
        return a*a;
    }

    @Override
    public float obliczObwod() {
        return 4*a;
    }
}
