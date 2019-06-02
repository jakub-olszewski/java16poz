package pl.sdacademy.java16poz.programowanie1.lists.resolve.btree;


/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 23:17
 **/
public class Main {

    public static void main(String[] args) {
        // 50, 17, 72, 54, 76, 23, 12, 9, 14, 19, 67
        // 25
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

        BSTreePrinter.print(btree.getRoot());



    }
}
