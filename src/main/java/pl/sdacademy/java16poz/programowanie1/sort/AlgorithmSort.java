package pl.sdacademy.java16poz.programowanie1.sort;

import java.util.Arrays;

/**
 * Table
 * Czym się różni klasa od klasy abstrakcyjnej od interfejsu
 *
 * klasa - zawiera pola, konstruktory, metody z implementacjami,
 *
 * interjest - zawiera tylko deklaracje metod, nie zawiera implementacji i nie konstruktorów
 *
 * klasa abstrakcyjna - zawiera pola, konstruktory, metody z implementacjami, oraz zawiera deklaracje metod abstrakcyjnych
 *
 * Uwaga. Nie można tworzyć obiektu typu klasa abstrakcyjna
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.05.2019 21:14
 **/
public abstract class AlgorithmSort {
    protected int[] numbers;

    /**
     * Metoda wczytuje tablice liczb do algorytmu sortującego
     * @param numbers
     */
    public void load(int[] numbers) {
        if(numbers==null){
            throw new IllegalArgumentException("Tablica nie może być nullem");
        }
        if(numbers.length==0){
            throw new IllegalArgumentException("Tablica jest pusta!");
        }
        this.numbers = numbers;
    }

    abstract void sort();

    public int[] get() {
        return numbers;
    }

    public void print(){
        StringBuilder result = new StringBuilder();

        //wersja stream
        Arrays.stream(numbers).forEach(number -> result.append("| "+number));
        result.append("|");

        //wersja bez stream
//        for(int number: numbers){
//            System.out.print("| "+number);
//        }
//        System.out.println("|");
        System.out.println(result);
    }

    /**
     * Metoda zamienia wartości w indeksach i j
     * @param i indeks
     * @param j indeks
     */
    protected void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    protected void validateInput(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("You can't pass a null instance as parameter.");
        }
    }
}
