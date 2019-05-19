package pl.sdacademy.java16poz.programowanie1.lists;

/**
 * Lista
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:36
 **/
public interface List<T> {
    /**
     * Metoda dodaje element do listy
     * @param element
     */
    void add(T element);

    /**
     * Metoda zwraca true, lub false, gdy lista jest, lub nie jest pusta - najlepiej wykorzystać metodę size()
     * @return true/false
     */
    boolean isEmpty();

    /**
     * Metoda zwraca rozmiar listy
     * @return rozmiar
     */
    int size();

    /**
     * Metoda zwraca wartość obiektu z elementu listy o wskazanym indeksie
     * @param index
     * @return wartość
     */
    T get(int index);

    /**
     * Metoda usuwa element przechowujący obiekt podany jako parametr
     * @return prawda gdy zostanie usunięty
     */
    boolean delete(int index);// -

    /**
     * Metoda ustawia obiekt w elemencie o podanej pozycji
     * @param index na liście
     * @param value ustawiania wartość
     */
    void set(int index, T value);

    /**
     * Metoda czyści listę. W przypadku listy z wartownikiem wystarczy ustawić jego następnik na wartość null.
     */
    void clear();

    String toString();
}
