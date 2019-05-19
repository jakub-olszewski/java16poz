package pl.sdacademy.java16poz.programowanie1.lists.sandbox;

/**
 * Frytki
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 09:46
 **/
public class Frytki {
    /**
     * Metoda polewanie ketchupem frytek
     */
    public void polejKetchupem(){
        System.out.println("Frytki polane ketchupem...");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
