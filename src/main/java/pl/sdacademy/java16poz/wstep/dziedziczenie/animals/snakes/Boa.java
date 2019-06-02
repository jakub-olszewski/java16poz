package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.snakes;

import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal;
import pl.sdacademy.java16poz.wstep.dziedziczenie.animals.mammals.Elephant;

/**
 * Boa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:53
 **/
public class Boa extends Snake {

    public Boa(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Deer
        strangle(animal);
        System.out.printf("%s zjadam %s",getName(),animal.getName());
    }

    // metoda duszenia strangle(Animal animal)
    // nie może udusić słonia!
    public void strangle(Animal animal){
        // jest typu klasy
        if(animal instanceof Elephant){// instanceof - jest instancją(typem) Elephant(słonia)
            System.out.printf("\n\"%s\" nie da rady udusić \"%s\"",this.getName(),animal.getName());
        }else{
            System.out.printf("\n\"%s\" dusi \"%s\"",this.getName(),animal.getName());
        }
    }
}
