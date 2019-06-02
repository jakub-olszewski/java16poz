package pl.sdacademy.java16poz.programowanie1.algorithms.queue;

import java.util.Optional;

import pl.sdacademy.java16poz.programowanie1.lists.Node;

/**
 * QueueImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 10:24
 **/
public class QueueImpl<T> implements Queue<T> {

    Node<T> front;
    Node<T> back;

    public void enqueue(T element) {
        Node<T> node = new Node<>(element);
        if(isEmpty()) {
            back = node;
            front = node;
        } else {
            back.next = node;
            back = node;
        }
    }

    public Optional<T> dequeue() {

        if(isEmpty()) {
            return Optional.empty();
        } else {

            Node<T> element = front;
            front = front.next;

            if(front == null) {
                back = null;
            }
            return Optional.of(element.value);
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public Optional<T> peek() {
        if(front == null) {
            return Optional.empty();
        } else {
            return Optional.of(front.value);
        }
    }



}
