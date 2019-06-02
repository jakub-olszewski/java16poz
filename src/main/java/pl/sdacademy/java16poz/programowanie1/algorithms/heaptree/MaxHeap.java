package pl.sdacademy.java16poz.programowanie1.algorithms.heaptree;

/**
 * MaxHeap
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 23:59
 **/
public class MaxHeap {

    public int[] getHeap() {
        return heap;
    }

    private int[] heap;
    private int size;
    private int maxsize;

    // Constructor to initialize an
    // empty max heap with given maximum
    // capacity.
    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MAX_VALUE;
    }



    // Returns position of parent
    private int parent(int pos)
    {
        return pos / 2;
    }

    // Below two functions return left and
    // right children.
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    // Returns true of given node is leaf
    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // A recursive function to max heapify the given
    // subtree. This function assumes that the left and
    // right subtrees are already heapified, we only need
    // to fix the root.
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;

        if (heap[pos] < heap[leftChild(pos)] ||
                heap[pos] < heap[rightChild(pos)]) {

            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Inserts a new element to max heap
    public void insert(int element)
    {
        heap[++size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i< heap.length; i++){
        System.out.print(" | "+ heap[i]);
    }

    }

    // Remove an element from max heap
    public int extractMax()
    {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }


}

