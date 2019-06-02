package pl.sdacademy.java16poz.wstep.interfejsy.figury;

/**
 * Figura
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 14:04
 **/
public interface Figura {

    /**
     * Metoda do obliczania pola figury
     * @return zwraca obliczone pole
     */
    float obliczPole();

    /**
     * Metoda do obliczania powodu
     * @return zwraca obliczone pole
     */
    float obliczObwod();

    /**
     * Metoda wypisujaca dane o figurze
     */
    void wypiszDane();


}
