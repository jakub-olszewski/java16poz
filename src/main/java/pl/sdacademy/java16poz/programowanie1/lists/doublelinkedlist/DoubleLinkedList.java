package pl.sdacademy.java16poz.programowanie1.lists.doublelinkedlist;

/**
 * DoubleLinkedList
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 00:45
 **/
public interface DoubleLinkedList<E> {

    public boolean isEmpty();

    public int size();

    public E get(int index);

    public boolean add(int index, E element);

    public E remove(int index);
}
