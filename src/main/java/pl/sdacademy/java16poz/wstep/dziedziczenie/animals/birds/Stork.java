package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.birds;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Predator;


/**
 * Stork
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:29
 **/
public class Stork extends Bird implements Predator {

    public Stork(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Stork
    }
}
