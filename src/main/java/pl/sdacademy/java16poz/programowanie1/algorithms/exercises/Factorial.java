package pl.sdacademy.java16poz.programowanie1.algorithms.exercises;

/**
 * Klasa - 'Factorial' w pakiecie programowanie1.algorithns
 *
 * Algorym silnia
 *
 * Zadanie1
 * Napisz metodę wyliczającą silnię
 * a) z użyciem rekurencji
 * b) z użyciem pętli
 * Napisz 3 testy weryfikujące.
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 01.06.2019 22:48
 **/
public class Factorial {

    public Factorial(int n) {
        this.n = n;
    }

    int n;
    int result;

    int get(){
        return result;
    }

    /**
     * Implementacja z użyciem pętli
     * @param n
     */
    private void solve(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
    }


    /**
     * Z użyciem rekurencji
     * @param n
     * @return
     */
    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}
