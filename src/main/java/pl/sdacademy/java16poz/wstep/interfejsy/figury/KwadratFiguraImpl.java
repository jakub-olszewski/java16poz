package pl.sdacademy.java16poz.wstep.interfejsy.figury;

/**
 * KwadratFiguraImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 09:29
 **/
public class KwadratFiguraImpl implements Figura {

    int bok;
    public KwadratFiguraImpl (){
        bok=10;
    }

    public KwadratFiguraImpl(int bok){
        this.bok=bok;
    }

    @Override
    public float obliczPole() {
        return bok*bok;
    }

    @Override
    public float obliczObwod() {
        return 4*bok;
    }

    @Override
    public void wypiszDane() {
        System.out.println("dane kwadratu:");
        System.out.println("---------------");
        System.out.println("bok= "+bok);
        System.out.println("pole= "+obliczPole());
        System.out.println("obwód= "+obliczObwod());
    }
}
