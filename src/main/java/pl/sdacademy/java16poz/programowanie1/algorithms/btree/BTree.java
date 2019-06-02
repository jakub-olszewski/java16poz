package pl.sdacademy.java16poz.programowanie1.algorithms.btree;


/**
 * BTree
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 09:21
 **/
public class BTree {
    public Node getRoot() {
        return root;
    }

    boolean isEmpty(){
        return root == null;
    }

    Node root;
    /**
     * 
     * @param key
     */
    public void insert(int key) {
        // TODO jeśli jest pusty utwórz nowy węzeł i przypisz do korzenia

        // TODO jeśli nie jest pusty to szukamy odpowiedniego rodzinca

        // TODO dopuki jest zajęty węzeł, szukamy odpowiednio: jeśli nasza wartość
        //  jest mniejsza od węzła idziemy w lewo w przeciwnym wypadku w prawo

        // TODO gdy pojawi się wolny węzeł to zapiszmy sobie jego rodzica

        // TODO tworzymy nowy węzeł z wartością którą chcemy ustawić

        // TODO pobieramy wartość klucza tego rodzica

        // TODO jeśli nasza wartość jest mniejsza to na rodzicu ustawiamy nowo stworzony węzeł jako lewy
        // w przeciwnym wypadku ustawiamy jako prawy

        if(isEmpty())
            root = new NodeImpl(key);
        else {
            Node marker = root;
            Node parent = null;
            while(marker != null) {
                parent = marker;
                marker = (key <marker.getKey() ) ? marker.getLeft() : marker.getRight();
            }

            Node newNode = new NodeImpl(key);

            if( key < parent.getKey() ) {
                parent.setLeft(newNode);
            }
            else {
                parent.setRight(newNode);
            }
        }
    }
}
