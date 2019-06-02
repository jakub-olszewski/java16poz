package pl.sdacademy.java16poz.programowanie1.algorithms.tree;


import java.util.List;

/**
 * INode
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:06
 **/
public interface Node<T>{
    /**
     * zwraca referencje rodzica
     * @return
     */
    public Node<T> getParent();

    /**
     * ustawia rodzica dla węzła
     * @param parent
     */
    public void setParent(Node<T> parent);

    /**
     * zwraca przechowywane dane
     * @return
     */
    public T getData();

    /**
     * ustawia dane w węźle
     * @param data
     */
    public void setData(T data);

    /**
     * zwraca stopień węzła
     * @return
     */
    public int getDegree();

    /**
     * zwraca referencje do i-tego dziecka
     * @param i
     * @return
     */
    public Node<T> getChild(int i);

    /**
     * sprawdza czy węzeł jest liściem
     * @return
     */
    public boolean isLeaf();

    /**
     * dodaje do węzła dziecko (inny węzeł)
     * @param child
     * @return
     */
    public Node<T> addChild(Node<T> child);

    /**
     * tworzy i dodaje do węzła dziecko z danymi
     * @param data
     * @return
     */
    public Node<T> addChild(T data);

    /**
     *  usuwa i-te dziecko węzła
     * @param i
     * @return
     */
    public Node<T> removeChild(int i);

    /**
     * usuwa wszystkie dzieci węzła
     */
    public void removeChildren();

    /**
     * zwraca pierwsze dziecko węzła (z lewej)
     * @return
     */
    public Node<T> getLeftMostChild();

    /**
     * zwraca listę dzieci
     * @return
     */
    public List<Node<T>> getChildren();

    /**
     * zwraca kolejny element siostrzany węzła
     * @return
     */
    public Node<T> getRightSibling();

    /**
     * wyświetla węzeł (najczęściej dane)
     * @return
     */
    public String toString();
}