package pl.sdacademy.java16poz.wstep.petle;

/**
 * PetlaForMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 13:54
 **/
public class PetlaForMain {

    public static void main(String[] args) {
        String[] tablicaMiast = {"Poznań","Wrocław","Warszawa","Kraków","Puck"};

        // licznik ; warunek zakończenia ; krok
        // stosujemy literki i,j,k,l,m,n,o
        for (int i=0; i<tablicaMiast.length; i++){
            String miasto = tablicaMiast[i];
            System.out.print("Iteracja:"+i+" | ");
            System.out.println(miasto);
        }

        //for (int =0)

    }
}
