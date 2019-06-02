package pl.sdacademy.java16poz.programowanie1.algorithms.tree;



/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 13:49
 **/
public class Main {

    public static void main(String[] args) {
        // tworzymy węzeł będący korzeniem
        // utwórz konstruktor(parent, data)
        Node<String> root = new NodeImpl<String>(null, "Adam");

        // dodajemy do niego kolejne węzły
        Node<String> n1 = root.addChild("Ewa");
        Node<String> n2 = root.addChild("Jarek");
        Node<String> n3 = root.addChild("Marta");

        n1.addChild("Jurek");
        n1.addChild("Max");
        n1.addChild("Iza");

        n2.addChild("Iwona");

        n3.addChild("Rafał");
        n3.addChild("Ola");

        // Zadanie dodatkowe: implementacja TreeImpl
        // tworzymy drzewo i wskazujemy, który węzeł jest korzeniem
        Tree<String> drzewo = new TreeImpl<String>(root);

        TreePrinter.print(root);
    }
}
