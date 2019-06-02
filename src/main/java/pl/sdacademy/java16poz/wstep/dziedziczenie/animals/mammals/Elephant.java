package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Vegenarian;


/**
 * Elephant
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:26
 **/
public class Elephant extends Mammal implements Vegenarian, Prey {

    public Elephant(String name) {
        super(name);
    }

    public void runAwayFrom(Animal animal) {
        System.out.printf("%s nie uciekne przed nikim hahaha",getName());
    }
}
