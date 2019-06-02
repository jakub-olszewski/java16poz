package pl.sdacademy.java16poz.wstep.abstrakcja;

/**
 * Figura
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 14:20
 **/
public abstract class Figura {

    private String nazwa;
    protected int a;
    protected int b;
    protected int c;
    protected int r;
    protected int h;

    public Figura(String nazwa){
        this.nazwa = nazwa;
        this.a = -1;
        this.b = -1;
        this.r = -1;
        this.h = -1;
    }

    // abstrakcyjne metody nie posiadaja implemntacji
    public abstract float obliczPole();
    public abstract float obliczObwod();

    public void wypiszDane(){
        System.out.println("=============================");
        System.out.println(nazwa);
        wypiszZmienna("a",a);
        wypiszZmienna("b",b);
        wypiszZmienna("r",r);
        wypiszZmienna("h",h);
        System.out.println("Pole:"+obliczPole());
        System.out.println("Obwód:"+obliczObwod());
    }

    private void wypiszZmienna(String tytul,int zmienna){
        if(zmienna>0){
            System.out.println(tytul+"="+zmienna);
        }
    }
}
