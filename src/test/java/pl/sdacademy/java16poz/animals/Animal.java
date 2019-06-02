package pl.sdacademy.java16poz.animals;

/**
 * Animal
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 11:06
 **/
public class Animal  {

    public String getName() {
        return name;
    }

    private String name;

    public Animal(String name){
        this.name = name;
        System.out.printf("\n%s(%s) urodził się",this.name,getClass().getSimpleName());
    }

    public void runAwayFrom(pl.sdacademy.java16poz.wstep.dziedziczenie.animals.Animal animal) {
        System.out.printf("\n %s ucieka przed %s",this.getName(),animal.getName());
    }
}
