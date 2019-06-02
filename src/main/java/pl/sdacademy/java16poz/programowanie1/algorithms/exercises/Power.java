package pl.sdacademy.java16poz.programowanie1.algorithms.exercises;

/**
 * Power potęga
 *
 * Zadanie
 * ----------------------------------------------------
 * Utwórz klasę Power z metodą naive(long x, int y)
 * podnoszącą x do potęgi y
 *
 * Napisz 3 testy weryfikacyjne
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 02.06.2019 09:09
 **/
public class Power {

    public static long fast(long x, int y) {
        long result = 1;
        while (y > 0) {
            if ((y & 1) == 0) {
                x *= x;
                y >>>= 1;
            } else {
                result *= x;
                y--;
            }
        }
        return result;
    }

    public static long naive(long x, int y) {
        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
