package pl.sdacademy.java16poz.programowanie1.algorithms.exercises;

/**
 * Klasa - 'Fibonacci' w pakiecie programowanie1.algorithns
 *
 * Zadanie1
 * Napisz implementacje wypisjacą n-tą liczbe fibonacciego
 * a) z użyciem rekurencji
 * b) z użyciem pętli for
 *
 * Napisz po 3 testy weryfikujące
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 01.06.2019 22:57
 **/
public class Fibonacci {

    /**
     * Algorytm rekurencyjny
     * @param n
     * @return
     */
    public int recursive(int n) {
        if(n <= 1) {
            return n;
        }
        return recursive(n-1) + recursive(n-2);
    }

    /**
     * Algorytm z użyciem pętli
     * @param n
     * @return
     */
    public int loop(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }

}
