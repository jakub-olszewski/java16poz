package pl.sdacademy.java16poz.programowanie1.lists.listnumber;

/**
 * NodeNumber
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:04
 **/
public class NodeNumber {
    Integer value; //aktualny element
    private NodeNumber next; //referencja na obiekt kolejny, następnik

    /**
     * Konstruktor ustawiający element na obiekt podany jako argument, wstawianie na początek listy
     * @param value obiekt, który chcemy przechowywać
     */
    public NodeNumber(Integer value){
        this(value, null);
    }

    /**
     * Metoda czyści noda (wagonik- odcina i czyści)
     */
    public void clear(){
        next = null;// odciecie wagonika
        value = null;// wyczysczenie wagonika
    }

    /**
     * Konstruktor, który pozwala wstawić element na określone miejsce
     * @param value obiekt, który chcemy umieścić na liście
     * @param node obiekt kolejny
     */
    public NodeNumber(Integer value, NodeNumber node){
        this.value = value;
        next = node;
    }

    /**
     * @param node kolejny element
     */
    public void setNext(NodeNumber node){
        next = node;
    }

    public NodeNumber getNext() {
        return next;
    }
}
