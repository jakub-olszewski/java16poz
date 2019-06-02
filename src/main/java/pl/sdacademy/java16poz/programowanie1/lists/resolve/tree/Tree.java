package pl.sdacademy.java16poz.programowanie1.lists.resolve.tree;

/**
 * Tree
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:07
 **/
public interface Tree<T> {

    public Node<T> getRoot();

    public void preOrder(Node<T> n);

    public void inOrder(Node<T> n);

    public void postOrder(Node<T> n);
}
