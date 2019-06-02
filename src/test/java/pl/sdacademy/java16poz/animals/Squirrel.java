package pl.sdacademy.java16poz.animals;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.plants.Plant;

/**
 * Squirrel
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 11:04
 **/
public class Squirrel extends Mammal implements Vegenarian, Prey {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n %s je %s",this.getName(), plant.getName());
    }
}
