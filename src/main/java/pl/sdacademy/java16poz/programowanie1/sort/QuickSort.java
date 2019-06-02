package pl.sdacademy.java16poz.programowanie1.sort;

/**
 * QuickSort2
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 02.06.2019 09:59
 **/
public class QuickSort extends AlgorithmSort {
    @Override
    void sort() {
        quickSort(0, numbers.length-1);
    }

    private void quickSort(int left, int right) {
        while (left < right) {
            System.out.println("*** quicksort *** left="+left+" right="+right);
            int i = divideTable(left, right);
            if ((i - left) <= (right - 1)) {
                quickSort(left, i - 1);
                left = i + 1;
            } else {
                quickSort(i, right);
                right = i - 1;
            }
        }
    }



    private int divideTable(int first, int last) {
        // wybieramy piwot wg którego będziemy dzielić
        // np. piwot ostatni
        int piwot = numbers[last];
        System.out.println("piwot="+piwot);
        // ustalamy zakres na którym będziemy operować
        int i = first;
        int j = last - 1;// o jeden mniejszy bo ostatni jest piwotem

        // pętla wyszukuje kolejne elementy większe i mniejsze od
        // elementu dzielącego (zmienna piwot)
        while (i <= j) {
            while (numbers[i] <= piwot && i < last)
            {
                i++;
            }
            while (numbers[j] > piwot && j > first)
            {
                j--;
            }

            // jeśli elementy są na niewłaściwych pozycjach zamieniamy je
            if (i < j){
                swap(i, j);
                System.out.println("zamiana "+i+" na "+j);
            }else{
                System.out.println(i+" jest większe od "+j);
                System.out.println(numbers[i]+" jest większe od "+numbers[j]);
            }
            print();
            // jeśli indeksy się zrównają kończymy pętlę
            if (i == j) {
                break;
            }

        }
        // na końcu wstawiamy piwot dzielący na właściwą pozycję
        swap(i, last);
        System.out.println("zamiana "+i+" na "+last);

        // i zwracamy tę pozycję
        print();
        return i;
    }
}
