package pl.sdacademy.java16poz.programowanie1.algorithms.exercises;

/**
 * Klasa - 'Prime' w pakiecie programowanie1.algorithns
 *
 * Prime - liczby piersze
 *
 * Zadanie
 * -------------------------------------------------------------
 * Metoda sprawdzajaca czy dana liczba jest liczba pierwsza
 * Napisz 3 testy weryfikujace
 *
 * Zadanie
 * -------------------------------------------------------------
 * Metoda wypisujaca liczby pierwsze z zakresu od do
 * np od 0 do 100
 * Napisz 3 testy weryfikujące
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 01.06.2019 23:02
 **/
public class Prime {

    boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    boolean isPrime2(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public void primeRange(int from, int to){
        int i;
        int num = 0;
        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;

        //Empty String
        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = isPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.primeRange(0,100);
    }

}
