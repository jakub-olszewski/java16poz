package pl.sdacademy.java16poz.programowanie1.algorithms.stack;

/**
 * StackMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 13:01
 **/
public class StackMain {

    public static void main(String[] args) {
        Stack stack = new StackImpl();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.toCoolString());
        stack.pop();
        System.out.println(stack.toCoolString());
        stack.pop();
        System.out.println(stack.toCoolString());
        stack.pop();
    }
}
