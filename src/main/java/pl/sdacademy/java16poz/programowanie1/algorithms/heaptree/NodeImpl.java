package pl.sdacademy.java16poz.programowanie1.algorithms.heaptree;

/**
 * Node
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 09:21
 **/
public class NodeImpl implements Node {
    // klucz liczba całkowita, węzeł lewy, węzeł prawy, węzeł rodzic
    int key;

    @Override
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    Node left, right, parent = null;
    // konstruktor z kluczem
    NodeImpl(int key) {
        this.key = key;
    }
}
