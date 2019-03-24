package pl.sdacademy.java16poz.interfejsy.figury;

/**
 * TrojkatFiguraImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 14:15
 **/
public class TrojkatFiguraImpl implements Figura{

    // odpowiednie pola dla trojkata
    int wysokosc;
    int podstawa;
    int bok;

    // konstruktor
    public TrojkatFiguraImpl(){
        wysokosc = 3;
        bok = 5;
        podstawa = 4;
    }

    public TrojkatFiguraImpl(int wysokosc, int bok, int podstawa){
        this.bok = bok;
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public float obliczPole() {
        return 0;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }

    @Override
    public void wypiszDane() {

    }


}
