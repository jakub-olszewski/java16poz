package pl.sdacademy.java16poz.programowanie1.algorithms.heaptree;

/**
 * Node
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 10:01
 **/
public interface Node {

    /**
     * Metoda pobiera lewy węzeł
     * @return węzeł lewy
     */
    Node getLeft();

    /**
     * Metoda ustawia lewy węzeł
     * @param node wezeł wstawiany
     */
    void setLeft(Node node);


    /**
     * Metoda pobiera prawy węzeł
     * @return węzeł prawy
     */
    Node getRight();

    /**
     * Metoda ustawia prawy węzeł
     * @param node ustawiany węzeł
     */
    void setRight(Node node);


    /**
     * Metoda pobiera klucz z węzła
     * @return klucz
     */
    int getKey();

    /**
     * Metoda pobiera rodzica węzła
     * @return węzeł rodzic
     */
    Node getParent();

    /**
     * Metoda ustawia rodzica
     * @param parent ustawiany rodzic
     */
    void setParent(Node parent);

    void setKey(int key);
}
