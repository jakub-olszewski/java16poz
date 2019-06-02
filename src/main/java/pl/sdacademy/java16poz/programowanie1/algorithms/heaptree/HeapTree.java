package pl.sdacademy.java16poz.programowanie1.algorithms.heaptree;


import java.util.ArrayList;
import java.util.List;

/**
 * BTree
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 26.05.2019 09:21
 **/
public class HeapTree {

    List<Node> nodes;

    public HeapTree(){
        size = 0;
        nodes = new ArrayList<>();
    }
    public Node getRoot() {
        return root;
    }
    int size;

    boolean isEmpty(){
        return root == null;
    }

    public int getLevel(Node n) {
        if (n == root) return 0;
        else return 1 + getLevel(n.getParent());
    }

    Node root;
    /**
     *
     * @param key
     */
    public void insert(int key) {
        Node newNode = new NodeImpl(key);
        if(size==0){
            root = newNode;
        }else{
            int parent = parent(size);
            int left = leftChild(size);
            int right = rightChild(size);


            Node parentNode = getNode(parent);
            Node leftNode = getNode(left);
            Node rightNode = getNode(right);

            newNode.setParent(parentNode);
            newNode.setLeft(leftNode);
            newNode.setRight(rightNode);

            if(parentNode.getLeft()==null){
                parentNode.setLeft(newNode);
            }else{
                parentNode.setRight(newNode);
            }
        }

        nodes.add(newNode);
        heapify(size);
        size++;
    }

    private void heapify(int position){


        while(getNode(position).getKey()>getNode(parent(position)).getKey()) {
            swap(position, parent(position));
            position = parent(position);
        }
//        while (heap[current] > heap[parent(current)]) {
//            swap(current, parent(current));
//            current = parent(current);
//        }
    }

    private void swap(int position, int parent) {
        int tmp;
        Node positionNode = getNode(position);
        Node parentNode = getNode(parent);
        int positionKey = positionNode.getKey();
        int parentKey = parentNode.getKey();
        tmp = positionKey;
        positionNode.setKey(parentKey);
        parentNode.setKey(tmp);
    }

    private Node getNode(int position) {
        if(position>size){
            return null;
        }else{
            return nodes.get(position);
        }
    }

    // Returns position of parent
    private int parent(int pos)
    {
        return (pos-1) / 2;
    }

    // Below two functions return left and
    // right children.
    private int leftChild(int pos)
    {
        return (2 * pos)  ;
    }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
}
