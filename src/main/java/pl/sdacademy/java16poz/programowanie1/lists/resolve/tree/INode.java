package pl.sdacademy.java16poz.programowanie1.lists.resolve.tree;

import pl.sdacademy.java16poz.programowanie1.lists.resolve.btree.BSTreePrinter;

import java.util.List;

/**
 * INode
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:06
 **/
public interface INode<T> extends BSTreePrinter.PrintableNode {
    public Node<T> getParent(); // zwraca referencje rodzica
    public void setParent(Node<T> parent); // ustawia rodzica dla węzła
    public T getData(); // zwraca przechowywane dane
    public void setData(T data); // ustawia dane w węźle
    public int getDegree(); // zwraca stopień węzła
    public Node<T> getChild(int i); // zwraca referencje do i-tego dziecka
    public boolean isLeaf(); // sprawdza czy węzeł jest liściem
    public Node<T> addChild(Node<T> child); // dodaje do węzła dziecko (inny węzeł)
    public Node<T> addChild(T data); // tworzy i dodaje do węzła dziecko z danymi
    public Node<T> removeChild(int i); // usuwa i-te dziecko węzła
    public void removeChildren(); // usuwa wszystkie dzieci węzła
    public Node<T> getLeftMostChild(); // zwraca pierwsze dziecko węzła (z lewej)
    public List<Node<T>> getChildren(); // zwraca listę dzieci
    public Node<T> getRightSibling(); // zwraca kolejny element siostrzany węzła
    public String toString(); // wyświetla węzeł (najczęściej dane)
}