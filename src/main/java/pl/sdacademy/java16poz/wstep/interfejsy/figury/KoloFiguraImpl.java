package pl.sdacademy.java16poz.wstep.interfejsy.figury;

/**
 * KoloFiguraImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 14:49
 **/
public class KoloFiguraImpl implements Figura{

    // wlasciwosci
    float promien;
    private float PI = ((float)Math.PI);

    @Override
    public float obliczPole() {
        return PI*promien*promien;
    }

    @Override
    public float obliczObwod() {
        return 2*PI*promien;
    }

    @Override
    public void wypiszDane() {
        System.out.println("*** Kolo");
        System.out.println("* promien = "+promien);
        System.out.println("* obwod = "+obliczObwod());
        System.out.println("* pole= "+obliczPole());
    }
}
