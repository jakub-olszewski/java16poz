package pl.sdacademy.java16poz.programowanie1.sort;

/**
 * Bubblesort
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.05.2019 21:07
 **/

public class BubbleSort extends AlgorithmSort {

    public void sortImpl_1() {
        boolean swapped = true;
        for(int i = numbers.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    swap(j,j+1);
                    swapped = true;
                }
            }
            print();
        }
    }

    public void sortImpl_2(){
        int i, j;
        for (i = 0; i < numbers.length-1; i++)
            for (j = 0; j < numbers.length-i-1; j++){
                if (numbers[j] > numbers[j+1])
                {
                    swap(j,j+1);
                }
                print();
            }
    }

    public void sortImpl_3(){
        boolean isSwaped = false;
        boolean isSorted = false;
        int i = 0;
        while (!isSorted){
            if(i==numbers.length-1){
                if(!isSwaped){
                    isSorted = true;
                    continue;
                }
                i = 0;
                isSwaped = false;
            }
            if (numbers[i+1] < numbers[i])
            {
                swap(i,i+1);
                isSwaped = true;
            }
            print();
            i++;
        }
    }


        @Override
    public void sort(){
            sortImpl_1();
    }


}