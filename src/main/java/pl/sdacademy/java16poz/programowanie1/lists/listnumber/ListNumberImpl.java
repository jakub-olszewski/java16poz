package pl.sdacademy.java16poz.programowanie1.lists.listnumber;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.NoSuchElementException;

/**
 * ListNumberImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:42
 **/
public class ListNumberImpl implements ListNumber {

    private NodeNumber head = new NodeNumber(null); //wartownik
    private int size; //rozmiar listy

    /**
     * Konstruktor domyślny, tworzy pustą listę
     */
    public ListNumberImpl(){
        clear();
    }
    /**
     * Metoda "czyszcząca" listę, w rzeczywistości ustawia pierwszy element listy, czyli pole next wartownika na null
     */
    public void clear(){
        head.clear();
        size=0; // wyzerowanie licznika
    }

    @Override
    public void add(int e) {
        //throw new NotImplementedException();
        if(isEmpty()){
            //head = new NodeNumber(e);
            head.value = e;
        }else{
            // TODO dodawanie elementu gdy już mamy inny
            //nodeLast().setNext(new NodeNumber(e));
            getNode(size-1).setNext(new NodeNumber(e));

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
    public int get(int index) {
        return getNode(index).value;
    }

    private NodeNumber getNode(int index){
        NodeNumber node = head;

        for (int i = 0; i < index; i++) { // wykonaj 'index' kroków z węzła na węzeł

            node = node.getNext();

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
            head = head.getNext();
        } else {

            NodeNumber prev = getNode(index - 1);
            if (prev.getNext() == null) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds, actual size " + index);
            }
            prev.setNext(prev.getNext().getNext());
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
    public void set(int index, int value) {
        getNode(index).value = value;
    }
}
