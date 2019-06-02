package pl.sdacademy.java16poz.programowanie1.lists.resolve.tree;

import java.util.List;
import java.util.function.Function;

/**
 * Main
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 22:09
 **/
public class Main {

    public static void main(String[] args) {

        // tworzymy węzeł będący korzeniem
        Node<String> korzen = new Node<String>(null, "Adam");

        // dodajemy do niego kolejne węzły
        Node<String> n1 = korzen.addChild("Ewa");
        Node<String> n2 = korzen.addChild("Jarek");
        Node<String> n3 = korzen.addChild("Marta");

        n1.addChild("Jurek");
        n1.addChild("Max");
        n1.addChild("Iza");

        n2.addChild("Iwona");

        n3.addChild("Rafał");
        n3.addChild("Ola");

        // tworzymy drzewo i wskazujemy, który węzeł jest korzeniem
        Tree<String> drzewo = new TreeImpl<String>(korzen);

        System.out.print("Pre Order: ");
        drzewo.preOrder(korzen);
        System.out.print("\nPost Order: ");
        drzewo.postOrder(korzen);
        System.out.print("\nIn Order: ");
        drzewo.inOrder(korzen);
        System.out.println ();

        Function<Node, List<Node>> getChildrenFunc = node -> getChildrenOf(node);
        System.out.println("");
        TreePrinter.print("", korzen, getChildrenFunc, true);    }

    private static List<Node> getChildrenOf(Node node) {
        return node.getChildren();
    }

}
