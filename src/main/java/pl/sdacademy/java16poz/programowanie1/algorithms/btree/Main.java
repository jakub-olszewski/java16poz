package pl.sdacademy.java16poz.programowanie1.algorithms.btree;


/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 09:21
 **/
public class Main {
    // 50, 17, 72, 54, 76, 23, 12, 9, 14, 19, 67
    // 25
    public static void main(String[] args) {
        BTree btree = new BTree();
        btree.insert(50);
        btree.insert(17);
        btree.insert(72);
        btree.insert(54);
        btree.insert(76);
        btree.insert(23);
        btree.insert(12);
        btree.insert(9);
        btree.insert(14);
        btree.insert(19);
        btree.insert(67);
        btree.insert(25);


        BTreePrinter.print(btree.getRoot());

    }
}
