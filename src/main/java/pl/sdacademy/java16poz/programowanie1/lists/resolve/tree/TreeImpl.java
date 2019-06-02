package pl.sdacademy.java16poz.programowanie1.lists.resolve.tree;

/**
 * TreeImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:07
 **/
public class TreeImpl<T> implements Tree<T> {
    private Node<T> root; // referencja do korzenia

    public TreeImpl() { // konstruktor domyślny
        root = null;
    }

    public TreeImpl(Node<T> root) { // konstruktor jednoparametrowy
        this.root = root;
    }


    public Node<T> getRoot() {
        return root;
    }

    /**
     * W przejściu wzdłużnym (ang. pre-order traversal) najpierw odwiedzamy korzeń poddrzewa,
     * a następnie przechodzimy kolejno lewe i prawe poddrzewo.
     * @param n
     */
    public void preOrder(Node<T> n) {
        System.out.print(n + " ");
        Node<T> temp = n.getLeftMostChild();
        while (temp != null) {
            preOrder(temp);
            temp = temp.getRightSibling();
        }
    }

    /**
     * W przejściu poprzecznym (ang. in-order traversal) najpierw przechodzimy lewe poddrzewo danego węzła,
     * następnie odwiedzamy węzeł i na koniec przechodzimy prawe poddrzewo.
     * @param n
     */
    public void inOrder(Node<T> n) {
        if (n.isLeaf())
            System.out.print(n + " ");
        else {
            Node<T> temp = n.getLeftMostChild();
            inOrder(temp);
            System.out.print(n + " ");
            temp = temp.getRightSibling();
            while (temp != null) {
                inOrder(temp);
                temp = temp.getRightSibling();
            }
        }
    }

    /**
     * W przejściu wstecznym (ang. post-order traversal) najpierw przechodzimy lewe poddrzewo, następnie prawe, a dopiero na końcu przetwarzamy węzeł
     * @param n
     */
    public void postOrder(Node<T> n) {
        Node<T> temp = n.getLeftMostChild();
        while (temp != null) {
            postOrder(temp);
            temp = temp.getRightSibling();
        }
        System.out.print(n + " ");
    }


}