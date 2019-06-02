package pl.sdacademy.java16poz.programowanie1.algorithms.stack;

import pl.sdacademy.java16poz.programowanie1.lists.Node;

import java.util.Optional;

/**
 * StackImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 01:22
 **/
public class StackImpl<T> implements Stack<T> {

    private Node<T> top;

    @Override
    public void push(T element) {
        Node node = new Node<>(element);// tworzymy nowy node
        if (isEmpty()) {//jeśli top jest nullem
            top = node;// tworzymy nowy node
        } else {// jesli top nie jest nullem
            node.next = top;//jego następnikiem jest top
            top = node;//nowy stworzony jest teraz top'em
        }
    }

    @Override
    public Optional<T> pop() {
        if (isEmpty()) {//jeśli jest pusto
            return Optional.empty();// zwróć pusty optional
        } else {
            Optional<T> num = Optional.of(top.value);// zapisanie tymczasowo wartości top
            top = top.next;// teraz top'em będzie jego następnik
            return num;
        }
    }

    @Override
    public Optional<T> peek() {
        if (isEmpty()) {//jeśli stos jest pusty
            return Optional.empty();//zwraca nam pusty optional
        } else {
            return Optional.of(top.value);//tworzenie i zwrócenie
            // optionala z wartości top
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }



    @Override
    public String toCoolString() {
        StringBuilder sb = new StringBuilder();
        Node walker = top;

        while (walker != null) {
            sb.append("+-----+\n| ").append(walker.value).append(" |\n+-----+\n   |   \n");
            walker = walker.next;
        }
        return sb.toString();
    }


}
