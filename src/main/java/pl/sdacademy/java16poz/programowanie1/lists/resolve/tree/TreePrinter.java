package pl.sdacademy.java16poz.programowanie1.lists.resolve.tree;

import java.util.List;
import java.util.function.Function;

/**
 * TreePrinter - klasa nie będzie wyjaśniana na zajęciach służy tylko poglądowo aby móc wyświetli w
 * przyjemny graficzny sposób drzewo
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.05.2019 20:56
 **/
public class TreePrinter {

        public static <T> void print(String prefix, T node, Function<T, List<T>> getChildrenFunc, boolean isTail) {
        String nodeName = node.toString();
        String nodeConnection = isTail ? "└── " : "├── ";
        System.out.println(prefix + nodeConnection + nodeName);
        List<T> children = getChildrenFunc.apply(node);
        if(children!=null){
        for (int i = 0; i < children.size(); i++) {
            String newPrefix = prefix + (isTail ? "    " : "│   ");
            print(newPrefix, children.get(i), getChildrenFunc, i == children.size()-1);
        }}
    }
}
