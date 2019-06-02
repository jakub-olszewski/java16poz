package pl.sdacademy.java16poz.programowanie1.algorithms.stack;

import java.util.Optional;

/**
 * Stack
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 10:21
 * alt+insert+enter   -> generowanie testu
 **/
public interface Stack<T> {

    /**
     * Metoda położenie/wstawienie elementu na stos
     * @param element wstawiany
     */
    void push(T element);

    /**
     * Metoda zdejmuje element ze stosu
     * @return element ze stosu
     */
    Optional<T> pop();

    /**
     * Metoda podgląda element ze stosu
     * @return element ze stosu
     */
    Optional<T> peek();

    /**
     * Metoda sprawdza czy stosu jest pusty
     * @return prawda/falsz czy jest pusty
     */
    boolean isEmpty();

    /**
     * Metoda wypisuje stos w czytelny sposób
     * @return stos jako napis
     */
    String toCoolString();
}
