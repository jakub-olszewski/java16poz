package pl.sdacademy.java16poz.programowanie1.sort;

/**
 * Insertionsort
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.05.2019 22:04
 **/
public class InsertionSort extends AlgorithmSort {
    
    @Override
    void sort() {
        sortImpl_3();
    }

    private void sortImpl_3(){
            for (int i = 1; i < numbers.length; i++) {// i to insertElement
                for(int j = i ; j > 0 ; j--){
                    if(numbers[j] < numbers[j-1]){
                        swap(j, j-1);
                    }
                }
            }
    }

    /**
     * Rozwiązanie z prezentacji
     */
    private void sortImpl_2(){
        for(int i = 2; i < numbers.length; i++){
            int insertElement = numbers[i];
            int j = i-1;
            while (j > 0 && (numbers[j] > insertElement)){
                numbers[j+1] = numbers[j];
                j = j - 1;
            }
            numbers[j+1] = insertElement;
        }
    }

    private void sortImpl_1(){
        int i, key, j;
        for (i = 1; i < numbers.length; i++)
        {
            key = numbers[i];
            j = i - 1;

            while (j >= 0 && numbers[j] > key)
            {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
    }
}
