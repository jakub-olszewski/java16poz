package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.interfaces.Predator;

/**
 * Lion
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:29
 **/
public class Lion extends Mammal implements Predator {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal)
    {
        if (animal.isEscape())
        {
            System.out.printf("\n%s: %s uciekłeś mi :(",this.getName(),animal.getName());
        }
        else
        {
            System.out.printf("\n%s: %s złapałem Cię i zjadłem",this.getName(),animal.getName());
        }

        // kod opisujacy wykonanie metody przez Lion
    }
}
