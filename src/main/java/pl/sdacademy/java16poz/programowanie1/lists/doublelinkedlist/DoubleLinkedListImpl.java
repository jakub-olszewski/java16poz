package pl.sdacademy.java16poz.programowanie1.lists.doublelinkedlist;

import pl.sdacademy.java16poz.programowanie1.lists.List;

/**
 * DoubleLinkedList
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 00:41
 **/
public class DoubleLinkedListImpl<E> implements List<E> {

    private Node<E> first;
    private Node<E> last;


    @Override
    public void add(E element) {
        add( size(), element);
    }

    @Override
    public boolean delete(int index) {
        return remove(index)!=null;
    }

    @Override
    public void set(int index, E value) {
        add(index,value);
    }

    @Override
    public void clear() {

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int size = 0;
        Node<E> currentNode = first;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public E get(int index) {
        return getNode(index).element;
    }



    private Node<E> getNode(int index) {
        if (isEmpty() || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        Node<E> currentNode = first;
        int currentIndex = index;
        while (currentIndex > 0) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index " + index);
            }
            currentNode = currentNode.next;
            currentIndex--;
        }
        return currentNode;
    }



    public boolean add(int index, E element) {
        if (first == null && index == 0) {
            first = new Node<>(element);
            last = first;
            return true;
        }

        Node<E> nodeAtIndex = getNode(index);

        // adding at the end of the list
        if (nodeAtIndex == null) {
            Node<E> previousLast = last;
            last = new Node<>(element);
            last.previous = previousLast;
            previousLast.next = last;
            return true;
        }

        // adding at the beginning of the list
        if (nodeAtIndex.previous == null) {
            Node<E> previousFirst = first;
            first = new Node<>(element);
            first.next = previousFirst;
            previousFirst.previous = first;
            return true;
        }

        Node<E> newNode = new Node<>(element);
        Node<E> previous = nodeAtIndex.previous;
        previous.next = newNode;
        newNode.previous = previous;

        newNode.next = nodeAtIndex;
        nodeAtIndex.previous = newNode;
        return true;
    }

    public E remove(int index) {
        Node<E> nodeToRemove = getNode(index);
        Node<E> previousNode = nodeToRemove.previous;
        Node<E> nextNode = nodeToRemove.next;
        E removedElement = nodeToRemove.element;

        // removing first node
        if (previousNode == null) {
            if (nextNode == null) {
                first = null;
                last = null;
            }
            else {
                first = nextNode;
                nextNode.previous = null;
            }
            return removedElement;
        }

        // removing last node
        if (nextNode == null) {
            last = previousNode;
            previousNode.next = null;
            return removedElement;
        }

        previousNode.next = nextNode;
        nextNode.previous = previousNode;

        return removedElement;
    }
}
