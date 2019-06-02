package pl.sdacademy.java16poz.wstep.interfejsy.figury;

/**
 * ProstokatFiguraImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 09:38
 **/
public class ProstokatFiguraImpl implements Figura{
    int podstawa;
    int wysokosc;
    public ProstokatFiguraImpl (){
        podstawa = 8;
        wysokosc = 12;

    }
public ProstokatFiguraImpl (int podstawa, int wysokosc){
        this.podstawa=podstawa;
        this.wysokosc=wysokosc;


}

    @Override
    public float obliczPole() {
        return podstawa*wysokosc;
    }

    @Override
    public float obliczObwod() {
        return 2*(podstawa+wysokosc);
    }

    @Override
    public void wypiszDane() {
        System.out.println("Dane prostokąta: ");
        System.out.println("-----------------");
        System.out.println("Podstawa= "+podstawa);
        System.out.println("Wysokość= "+wysokosc);
        System.out.println("Pole= "+obliczPole());
        System.out.println("Obwód= "+obliczObwod());
    }
}
