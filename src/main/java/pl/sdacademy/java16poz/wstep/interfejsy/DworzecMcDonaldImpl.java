package pl.sdacademy.java16poz.wstep.interfejsy;

/**
 * DworzecMcDonaldImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 12:52
 **/
public class DworzecMcDonaldImpl implements McDonald{

    /*
    Zadanie: Utworz implementacje McDonald z C.H. Posnania
    Frytek nie ma bo skończyły się ziemniaki
     */

    @Override
    public void poproszeFrytki(float kwota) {
        System.out.println("Zamówienie gotowe: Frytki");
    }

    @Override
    public void poproszeMcFlury(float kwota) {
        System.out.println("Zamówienie gotowe: McFlury");
    }
}
