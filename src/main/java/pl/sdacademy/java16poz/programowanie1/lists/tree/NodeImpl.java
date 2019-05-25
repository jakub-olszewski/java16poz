package pl.sdacademy.java16poz.programowanie1.lists.tree;

import pl.sdacademy.java16poz.programowanie1.lists.resolve.tree.BSTreePrinter;
import pl.sdacademy.java16poz.programowanie1.lists.resolve.tree.INode;

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


    @Override
    public Node<T> getParent() {
        return null;
    }

    @Override
    public void setParent(Node<T> parent) {

    }

    @Override
    public T getData() {
        return null;
    }

    @Override
    public void setData(T data) {

    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public Node<T> getChild(int i) {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Node<T> addChild(Node<T> child) {
        return null;
    }

    @Override
    public Node<T> addChild(T data) {
        return null;
    }

    @Override
    public Node<T> removeChild(int i) {
        return null;
    }

    @Override
    public void removeChildren() {

    }

    @Override
    public Node<T> getLeftMostChild() {
        return null;
    }

    @Override
    public List<Node<T>> getChildren() {
        return null;
    }

    @Override
    public Node<T> getRightSibling() {
        return null;
    }
}
