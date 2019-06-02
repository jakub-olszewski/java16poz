package pl.sdacademy.java16poz.wstep.dziedziczenie.animals.plants;

/**
 * Plant
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:30
 **/
public class Plant {
        String name;

    public Plant(String name) {
        this.name = name;
    }

    public Plant() {
        System.out.println("\n"+getClass().getSimpleName()+" rosnie...");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
