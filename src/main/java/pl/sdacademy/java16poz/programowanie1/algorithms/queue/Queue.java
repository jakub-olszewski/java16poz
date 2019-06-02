package pl.sdacademy.java16poz.programowanie1.algorithms.queue;

import java.util.Optional;

/**
 * Queue Kolejka
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 01:20
 **/
public interface Queue<T> {

    /**
     * Metoda dodaje do kolejki element
     * @param element dodany do kolejki
     */
    void enqueue(T element);

    /**
     * Metoda pobiera z kolejki
     * @return optional z elementem z kolejki
     */
    Optional<T> dequeue();

    /**
     * Metoda sprawdza ilość obiektów w kolejce
     * @return rozmiar
     */
    boolean isEmpty();

    /**
     * Metoda zerka/podgląda na element gotowy do pobrania z kolejki
     * @return element z kolejki
     */
    Optional<T> peek();
}
