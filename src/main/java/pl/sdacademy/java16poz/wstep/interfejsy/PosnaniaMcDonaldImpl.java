package pl.sdacademy.java16poz.wstep.interfejsy;

/**
 * PosnaniaMcDonaldImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 13:25
 **/
public class PosnaniaMcDonaldImpl implements McDonald{

    @Override
    public void poproszeFrytki(float kwota) {
        System.out.println("Zamówienie nie możliwe: brak produktu");
    }

    @Override
    public void poproszeMcFlury(float kwota) {
        System.out.println("Zamówienie gotowe: McFlury");
    }
}
