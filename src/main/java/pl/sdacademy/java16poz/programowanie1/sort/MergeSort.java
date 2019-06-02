package pl.sdacademy.java16poz.programowanie1.sort;

/**
 * Mergesort
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.05.2019 22:45
 **/
public class MergeSort extends AlgorithmSort {

    private int[] helper;

    @Override
    void sort() {
        validateInput(numbers);
        int number = numbers.length;
        this.helper = new int[number];
        mergeSort(0, number - 1);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            // indeks elementu srodkowego
            int middle = low + (high - low) / 2;
            // sortowanie lewej strony tablicy
            mergeSort(low, middle);
            // sortowanie prawej strony tablicy
            mergeSort(middle + 1, high);
            // kombinowane czesciowe sortowanie
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        // kopiowanie lewej i prawej strony do tablicy pomocnej - helper
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // kopiowanie najmniejszych wartosci na lewo lub prawo orginalnej tablicy
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // kopiowanie reszty lewej strony tablicy do docelowej tablicy - numbers
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        //Add
        // kopiowanie reszty prawej strony tablicy do docelowej tablicy - numbers
        while (j <= high) {
            numbers[k] = helper[j];
            k++;
            j++;
        }
    }
}
