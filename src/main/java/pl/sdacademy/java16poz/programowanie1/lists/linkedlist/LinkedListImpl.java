package pl.sdacademy.java16poz.programowanie1.lists.linkedlist;

import pl.sdacademy.java16poz.programowanie1.lists.List;
import pl.sdacademy.java16poz.programowanie1.lists.Node;
/**
 * LinkedListImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 00:49
 **/
public class LinkedListImpl<T> implements List<T> {

    private Node<T> head = new Node(null); //wartownik
    private int size; //rozmiar listy

    /**
     * Konstruktor domyślny, tworzy pustą listę
     */
    public LinkedListImpl(){
        clear();
    }
    /**
     * Metoda "czyszcząca" listę, w rzeczywistości ustawia pierwszy element listy, czyli pole next wartownika na null
     */
    public void clear(){
        head.setNext(null);
        size=0;
    }

    @Override
    public void add(T e) {
        //throw new NotImplementedException();
        if(isEmpty()){
            head.value = e;
        }else{
            // TODO dodawanie elementu gdy już mamy inny
            //nodeLast().setNext(new NodeNumber(e));
            getNode(size-1).setNext(new Node(e));

        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        // TODO pobieranie elementu
        return getNode(index).value;
    }

    private Node<T> getNode(int index){
        Node node = head;

        for (int i = 0; i < index; i++) { // wykonaj 'index' kroków z węzła na węzeł

            node = node.next;

            if (node == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds, actual size " + (i + 1));
            }
        }
        return node;
    }

    @Override
    public boolean delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds, actual size 0");
        }

        if (index == 0) {
            head = head.next;
        } else {

            Node prev = getNode(index - 1);
            if (prev.next == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds, actual size " + index);
            }
            prev.setNext(prev.next.next);
            size--;
            return true;
        }
        size--;
        return false;
    }

//    private NodeNumber nodeLast() {
//
//        if (isEmpty()) {
//            throw new NoSuchElementException();
//        }
//
//        NodeNumber last = head;
//        while (last.getNext() != null) {
//            last = last.getNext();
//        }
//        return last;
//    }

    @Override
    public void set(int index, T value) {
        getNode(index).value = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> node = head;
        while (node != null) {
            builder.append(node.value);
            builder.append(", ");
            node = node.next;
        }
        return builder.toString();
    }
}
