package pl.sdacademy.java16poz.wstep.dziedziczenie.animals;

/**
 * Animal
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 10:10
 **/
public class Animal {

    private String name;
    private boolean escape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {

        this.name = name;
        this.escape=false;
        System.out.printf("\n%s urodził się",this.getName());
    }

    public boolean isEscape()
    {
        return escape;
    }

    public void setEscape(boolean escape)
    {
        this.escape = escape;
    }

    public void runAwayFrom(Animal animal)
    {
        System.out.printf("\n%s uciekł przed %s",this.getName(),animal.getName());
        setEscape(true);
    }
}
