package pl.sdacademy.java16poz.wstep.typydanych;

/**
 * TypyMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 15:15
 **/
public class TypyMain {

    public static void main(String[] args) {
        String napis = "To jest napis";
        String napis2 = new String();
        String napis3 = new String("Netfix");
        String napis4 = null;// zainicjalizować TRZEBA ! nawet jak jest puste

        System.out.println(napis);
        System.out.println(napis2);
        System.out.println(napis3);
        System.out.println(napis4);

        String napis5 = "Koziołek";
        boolean zmiennaLogiczna = false;
        {
            boolean czyRowne = napis5.equals("Matołek");
            System.out.println("Czy Koziołek to Matołek ? odp. " + czyRowne);
        }
        // napis Koza porównujemy z napisem Koziołek
        // a napis Koziołek ma zamienioną pierwszą literę o na literę p
        "Koza".equals("Koziołek".replace("o", "p"));

        Integer liczbaA = 5; // obiekt ma metody
        int liczbaB = 3;// typ prymitywny nie ma metod

        liczbaA.compareTo(liczbaB);
        //liczbaB.compareTo(liczbaA);// nie możliwe do wykonania

        // porównanie
        { // zmienna czyRowne istnieje tylko pomiedzy klamrami { }
            boolean czyRowne = liczbaA.equals(liczbaB);
        }
        {
            boolean czyRowne = liczbaB == liczbaA; // porównanie a przypisanie ?
        }
        {
            boolean czyRowne = liczbaA == liczbaB;
        }

        char znak = 'a';
        Character znak2 = 'b';

        znak2.equals(znak);

    }

}
