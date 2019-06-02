package pl.sdacademy.java16poz.programowanie1.algorithms.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Node
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:06
 **/
public class NodeImpl<T> implements Node<T> {
    private T data; // dane
    private Node<T> parent; // referencja do rodzica
    private List<Node<T>> children; // lista dzieci

    public NodeImpl() { // konstruktor domyślny
        parent = null;
        children = new LinkedList<Node<T>>();
    }

    public NodeImpl(Node<T> parent) { // konstruktor jednoparametrowy
        this();
        this.parent = parent;
    }

    public NodeImpl(Node<T> parent, T data) { // konstruktor dwuparametrowy
        this(parent);
        this.data = data;
    }


    public Node<T> getParent() {
        return parent;// zwracamy referencję do rodzica
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;// ustawiamy rodzica
    }

    public T getData() {
        return data;// zwracamy przechowywane dane
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getDegree() {
        return children.size();// zwracamy rozmiar listy przechowującej potomków węzła
    }


    public boolean isLeaf() {
        return children.isEmpty();// jeśli lista dzieci jest pusta zwracamy true (węzeł jest liściem)
    }

    public Node<T> addChild(Node<T> child) {
        child.setParent(this);// ustawiamy w dziecku rodzica (wskazujemy na nas)
        children.add(child);// dodajemy dziecko do listy naszych dzieci
        return child;// zwracamy dziecko
    }

    public Node<T> addChild(T data) {
        Node<T> child = new NodeImpl<T>(this, data);//tworzymy nowy węzeł (ustawiamy od razu rodzica i dane)
        children.add(child);// dopis ujemy węzeł do listy naszych dzieci
        return child;// zwracamy dziecko
    }

    public Node<T> getChild(int i){
// zwracamy referencję do i-tego dziecka (metoda get(int) z klasy LinkedList)
        return children.get(i);
    }

    public Node<T> removeChild(int i) {
// usuwamy i-te dziecko (metoda remove(int) z klasy LinkedList)
        return children.remove(i);
    }

    public void removeChildren() {
// usuwamy wszystkie nasze dzieci, czyścimy listę(metoda clear() z klasy LinkedList)
        children.clear();
    }

    /**
     * ierwsza z nich zwróci nam najbardziej wysunięte w lewo dziecko węzła (czyli pierwszego potomka z listy o ile tylko taki istnieje).
     * @return
     */
    public Node<T> getLeftMostChild() {
// jeśli nie mamy dzieci zwrócimy null
        if (children.isEmpty()) return null;
// w przciwnym wypadku pierwsze dziecko z listy naszych dzieci
        return children.get(0);
    }

    public List<Node<T>> getChildren() {
        if (children.isEmpty()) return null;
        return children;
    }

    public Node<T> getRightSibling() {
        if (parent != null) {
            List<Node<T>> childrenParent = parent.getChildren();
            int pozycja = childrenParent.indexOf(this);
            if (childrenParent.size() > pozycja+1)
                return childrenParent.get(pozycja+1);
        }
        return null;
    }

    public String toString() {
        return data.toString();
    }

}
