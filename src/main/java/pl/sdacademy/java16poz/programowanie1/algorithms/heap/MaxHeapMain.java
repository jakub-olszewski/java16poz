package pl.sdacademy.java16poz.programowanie1.algorithms.heap;


/**
 * MaxHeapMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 00:00
 **/
public class MaxHeapMain {

    public static void main(String[] arg)
    {
        MaxHeap maxHeap = new MaxHeap(8);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();

    }
}
