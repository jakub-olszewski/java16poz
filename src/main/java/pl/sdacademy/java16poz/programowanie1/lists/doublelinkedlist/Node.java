package pl.sdacademy.java16poz.programowanie1.lists.doublelinkedlist;

/**
 * Node
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 00:47
 **/
public class Node<E> {

    E element;// element listy dwukierunkowej

    Node<E> next;// następnik

    Node<E> previous;// poprzednik

    /**
     * Konstruktor
     *
     * @param element w węźle
     */
    Node(E element) {
        this.element = element;
    }
}
