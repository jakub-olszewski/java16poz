package pl.sdacademy.java16poz.wstep.obiekty;

/**
 * PozycjaZamowienia
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 09:17
 **/
public class PozycjaZamowienia {

    // pola: nazwa, ilosc, cenaJednostki
    String nazwa;
    short ilosc;
    float cenaJednostki;

    public PozycjaZamowienia(String nazwa, float cenaJednostki){
        // wykorzystanie innego konstruktora w konstruktorze
        this(nazwa,cenaJednostki,(short)1);
    }

    public PozycjaZamowienia(String nazwa,float cenaJednostki, short ilosc){
        this.nazwa = nazwa;
        this.cenaJednostki = cenaJednostki;
        this.ilosc = ilosc;
    }

    public float pobierzCene(){
        return cenaJednostki;
    }

    public float pobierzSume(){
        return ilosc*cenaJednostki;
    }

    public void prettyPrint() {
        StringBuilder builder = new StringBuilder();
        builder.append("----------------------------").append("\n");
        builder.append("\t Zamówienie: ").append(nazwa).append("\n");
        builder.append("\t Ilość: ").append(ilosc);
        builder.append("\t Cena: ").append(cenaJednostki).append(" zł");
        //builder.append("\n");
        System.out.println(builder.toString());
    }

    public String pobierzNazwe() {
        return nazwa;
    }

    // metody : pobierzSume(), pobierzCene() /jednostki

    // konstruktor: nazwa,cena,ilosc
    // kostruktor: nazwa, cena ,(domyslnie ilosc =1)


}
