package pl.sdacademy.java16poz.wstep.interfejsy;

/**
 * McDonaldMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 13:17
 **/
public class McDonaldMain {

    public static void main(String[] args) {

        McDonald dworzecMcDonald = new DworzecMcDonaldImpl();

        // utworzenie implementacji z CH Posnania
        McDonald posnaniaMcDonald = new PosnaniaMcDonaldImpl();

        // wywołanie dostępnych metod
        dworzecMcDonald.poproszeFrytki(10);
        posnaniaMcDonald.poproszeFrytki(10);
        dworzecMcDonald.poproszeMcFlury(10);
        posnaniaMcDonald.poproszeMcFlury(10);



    }
}
