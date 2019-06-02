package pl.sdacademy.java16poz.wstep.optional;

import pl.sdacademy.java16poz.wstep.obiekty.Zamowienie;

import java.util.Optional;
import java.util.Scanner;

/**
 * OptionalMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.04.2019 10:55
 **/
public class OptionalMain {

    public static void main(String[] args) {
        /*
         empty() - tworzy pusty Optional z wartością null.

         of(T value) - tworzy Optional z podaną wartością. W przypadku przekazania null dostaniemy NullPointerException.

         ofNullable(T value) - również tworzy Optional z podaną wartością, w przypadku przekazania null nie zostanie zgłoszony wyjątek.

         Optional(T value) - konstruktor rzucający błąd w przypadku przekazania wartości null.

         isPresent() - zwraca boolean mówiący czy w środku znajduje się jakaś wartość czy też null.

         get() - pobranie przechowywanego obiektu. Jeżeli takiego nie dostaniemy: NoSuchElementException
         */

        Zamowienie zamowienie = null;
        // łapanie wyjątku
        try
        {
            Optional<Zamowienie> optionalZamowienie = Optional.of(zamowienie);
        }catch (NullPointerException e){
            System.out.println("Ojoj... wystąpił wyjątek 0x00003243b");
            System.out.println("Wiadomość:"+e.getMessage());
            //e.printStackTrace();
        }

        // ustalamy że zamówienie możebyć null wtedy możemy użyć ofNullable
        Optional<Zamowienie> optionalZamowienie = Optional.ofNullable(zamowienie);

        // wersja bez optional
        String tekst = null;
        if(tekst!=null){
            // kod który ma się wykonać
        }

        // to samo co powyżej z użyciem optional
        Optional<String> optionalTekst = Optional.ofNullable(tekst);
        if(optionalTekst.isPresent()){// czy optional tekst ma zawartość
            // kod który ma się wykonać
            // w tym miejscu jest zawartość
            // możemy ją pobrać
            String tekstZOptional = optionalTekst.get();
        }

        // pusty optional
        Optional<String> optionalPusty = Optional.empty();

        System.out.println("Program wykonuje się dalej...");

        Scanner scanner = new Scanner(System.in);
        Optional<String> scannerOptional = Optional.ofNullable(scanner.nextLine());
        if(scannerOptional.filter(s -> s.isEmpty()).isPresent()){
            System.out.println("Pusty");
        }else{
            System.out.println("jest");
        }
}
}
