package pl.sdacademy.java16poz.wstep.abstrakcja;

/**
 * Kolo
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:58
 **/
public class Kolo extends Figura {
    public Kolo(int promien) {
        super("Kolo");
        this.r = promien;
    }

    @Override
    public float obliczPole() {
        return (float)Math.PI*r*r;
    }

    @Override
    public float obliczObwod() {
        return 2*(float)Math.PI*r;
    }
}
