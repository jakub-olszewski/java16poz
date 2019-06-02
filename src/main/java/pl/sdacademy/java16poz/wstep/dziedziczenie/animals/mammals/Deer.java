package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals;


import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.plants.Plant;

/**
 * Deer
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
 **/
public class Deer extends Mammal implements Vegenarian, Prey {

    public Deer(String name) {
        super(name);
    }

    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getClass().getSimpleName(),plant.getName());
        // kod opisujacy wykonanie metody przez Deer
    }

    // nadpisanie metody z animal
    public void runAwayFrom(Animal animal) {
        System.out.printf("\n%s ucieka przed %s",getName(),animal.getName());
    }
}
