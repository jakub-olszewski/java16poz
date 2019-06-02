package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.plants.Plant;

/**
 * Squirrel
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
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

