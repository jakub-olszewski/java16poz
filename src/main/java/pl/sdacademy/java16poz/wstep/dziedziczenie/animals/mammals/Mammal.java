package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.plants.Plant;

/**
 * Mammal
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:08
 **/
public class Mammal extends Animal {
    public Mammal(String name) {
        super(name); //super oznacza kontruktor klasy ktora rozszezamy czyli animal
    }

    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getClass().getSimpleName(),plant.getName());
    }
}
