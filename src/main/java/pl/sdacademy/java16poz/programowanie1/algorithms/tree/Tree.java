package pl.sdacademy.java16poz.programowanie1.algorithms.tree;


/**
 * Tree
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:07
 **/
public interface Tree<T> {

    public Node<T> getRoot();
    /**
     * W przejściu wzdłużnym (ang. pre-order traversal) najpierw odwiedzamy korzeń poddrzewa,
     * a następnie przechodzimy kolejno lewe i prawe poddrzewo.
     * @param n
     */
    public void preOrder(Node<T> n);

    /**
     * W przejściu poprzecznym (ang. in-order traversal) najpierw przechodzimy lewe poddrzewo danego węzła,
     * następnie odwiedzamy węzeł i na koniec przechodzimy prawe poddrzewo.
     * @param n
     */
    public void inOrder(Node<T> n);

    /**
     * W przejściu wstecznym (ang. post-order traversal) najpierw przechodzimy lewe poddrzewo, następnie prawe, a dopiero na końcu przetwarzamy węzeł
     * @param n
     */
    public void postOrder(Node<T> n);
}


