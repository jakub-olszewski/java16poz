package pl.sdacademy.java16poz.programowanie1.algorithms.heaptree;


/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 13:56
 **/
public class Main {

    public static void main(String[] args) {
        //5 3 17 10 84 19 6 22 9
        HeapTree heapTree = new HeapTree();

        heapTree.insert(5);
        heapTree.insert(3);
        heapTree.insert(17);
        heapTree.insert(10);
        heapTree.insert(84);
        heapTree.insert(19);
        heapTree.insert(6);
        heapTree.insert(22);
        heapTree.insert(9);
        heapTree.insert(34);
        heapTree.insert(99);

        HeapTreePrinter.print(heapTree.getRoot());
    }
}
