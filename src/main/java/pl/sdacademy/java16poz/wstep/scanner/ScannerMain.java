package pl.sdacademy.java16poz.wstep.scanner;

import java.util.Scanner;

/**
 * ScannerMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 12:38
 **/
public class ScannerMain {

    public static void main(String[] args) {

        // String napis -----------------------------------
        String napis = "Dziś jest ładna pogoda idealna do programowania xD";

        Scanner skaner = new Scanner(napis);

        System.out.println(skaner.next());
        System.out.println(skaner.next());
        System.out.println(skaner.next());

        // wypisz w pętli słowa z napisu ?
        boolean warunekKontynuacji = skaner.hasNext();// has/is zwraca boolean
        //for/while
        while(skaner.hasNext()){// sprawdzenie za każdym razem czy jest następny
            System.out.println("Słowo| "+skaner.next());
        }

        // z klawiatury ------------------------------
        Scanner skanerKlawiatury = new Scanner(System.in);

        System.out.println("Podaj swoje imie:");
        String imie = skanerKlawiatury.nextLine();

        System.out.println("Cześć "+imie+" !");
        System.out.println("Jak się czujesz?");
        String samopoczucie = skanerKlawiatury.nextLine();
        if(samopoczucie.toLowerCase().contains("dobrze")){
            System.out.println("miło słyszeć");
        }else{
            System.out.println("przykro mi jutro będzie lepiej...");
        }

    }
}
