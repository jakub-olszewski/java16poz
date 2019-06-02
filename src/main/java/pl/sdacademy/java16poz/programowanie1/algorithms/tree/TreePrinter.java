package pl.sdacademy.java16poz.programowanie1.algorithms.tree;


import java.util.List;

/**
 * TreePrinter - klasa nie będzie wyjaśniana na zajęciach służy tylko poglądowo aby móc wyświetli w
 * przyjemny graficzny sposób drzewo
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 20:56
 **/
public class TreePrinter {


    public static void print(Node root) {
        print(" ", root, true);
    }

    public static void print(String prefix, Node node, boolean isTail) {
        String nodeName = node.toString();
        String nodeConnection = isTail ? "└── " : "├── ";
        System.out.println(prefix + nodeConnection + nodeName);
        List<Node> children = node.getChildren();
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                String newPrefix = prefix + (isTail ? "    " : "│   ");
                print(newPrefix, children.get(i), i == children.size() - 1);
            }
        }
    }
}
