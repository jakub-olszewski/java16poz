package pl.sdacademy.java16poz.programowanie1.lists;

/**
 * Node
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:03
 **/
public class Node<T> {
     public T value; //aktualny element
     public Node next; //referencja na obiekt kolejny
    /**
     * Konstruktor ustawiający element na obiekt podany jako argument, wstawianie na początek listy
     * @param val obiekt, który chcemy przechowywać
     */
    public Node(T val){
        this(val, null);
    }

    /**
     * Konstruktor, który pozwala wstawić element na określone miejsce
     * @param val obiekt, który chcemy umieścić na liście
     * @param n obiekt kolejny
     */
    public Node(T val, Node n){
        value = val;
        next = n;
    }

    /**
     * @param n kolejny element
     */
    public void setNext(Node n){
        next = n;
    }
}
