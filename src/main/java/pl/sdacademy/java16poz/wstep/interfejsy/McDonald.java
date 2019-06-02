package pl.sdacademy.java16poz.wstep.interfejsy;

/**
 * McDonald to interfejs, nie zawiera implementacji
 * czyli sposobu wykonania metod
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 12:48
 **/
public interface McDonald {

    /**
     * Metoda realizujaca zamówienie frytek
     */
    void poproszeFrytki(float kwota);

    /**
     * Metoda realizujaca zamówienie McFlury
     */
    void poproszeMcFlury(float kwota);
}
