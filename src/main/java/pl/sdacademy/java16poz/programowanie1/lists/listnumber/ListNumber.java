package pl.sdacademy.java16poz.programowanie1.lists.listnumber;

import javafx.beans.binding.Bindings;

/**
 * LIstNumber
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 17.05.2019 10:38
 **/
// alt + insert + enter
public interface ListNumber {
    void add(int e);

    boolean isEmpty();

    int size();

    int get(int index);
}
