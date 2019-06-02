package pl.sdacademy.java16poz.programowanie1.algorithms.heap;

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


    /**
     * Metoda zwraca pozycje rodzica w tablicy kopca
     * @param position
     * @return
     */
    private int parent (int position){
        return (position-1)/2;
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

    /**
     * Metoda zamienia pozycje current z pozycją parent
     * @param current to pozycja bierzaca w tablicy
     * @param parent
     */
    private void swap(int current, int parent)
    {
        int tmp;
        tmp = heap[current];
        heap[current] = heap[parent];
        heap[parent] = tmp;
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
        heap [size]= element;
        // current to pozycja dodawnego elementu
        int current = size;
        size++;


        // zamieniamy kiedy nasza wartość jest większa od rodzica
        // dopóki jest większa
        while (heap[current]>heap[parent(current)]){
            swap (current, parent(current));
            current = parent(current);
        }

    }

    public void print()
    {
        for (int i = 0; i< heap.length; i++){
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

