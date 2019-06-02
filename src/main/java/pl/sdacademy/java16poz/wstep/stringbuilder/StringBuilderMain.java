package pl.sdacademy.java16poz.wstep.stringbuilder;

import pl.sdacademy.java16poz.wstep.obiekty.Firma;
import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

/**
 * StringBuilderMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 10:56
 **/
public class StringBuilderMain {

    public static void main(String[] args) {
        String napisCudzyslow = "";
        String napisZKonstruktora = new String("");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";
        System.out.println(napis);
        System.out.printf(napis,12);
        System.out.println("Napis");
        System.out.println(napisZKonstruktora);
        System.out.println(napisNull);
//        System.out.println(napisBezInicjalizacji);

        // przyklad rachunku
        // nie używamy "Firma X" + "adres" +" zamowienie 1"
        StringBuilder builder = new StringBuilder();
        Firma firma = new Firma();
        builder.append(firma.pobierzNazwe());


        Zamowienie zamowienie1 = new Zamowienie(1);
        builder.append("Cena zamowienia:");
        builder.append(zamowienie1.pobierzCena());

        System.out.println(builder);

        float cena = 23.1281232f;// dopisujemy f aby
        // odróżnić f-float od d-double
        System.out.printf("\nCena :%f zł\n",cena);
        // formatowanie kwoty
        System.out.printf("\nCena :%.2f zł\n",cena);

        int numer = 123;
        /**
         * \n enter
         * \t tabulator wcięcie
         */
        System.out.printf("\nZamowienie %d\n\tkwota: %.2f",numer,cena);

    }
}
