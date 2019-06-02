package pl.sdacademy.java16poz.programowanie1.sort;

/**
 * Selectionsort
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.05.2019 21:37
 **/
public class SelectionSort extends AlgorithmSort {

    @Override
    void sort() {
        sortImpl_4();
    }

    void sortImpl_4(){
        int position = 0;
        while (position != numbers.length){
            int positionOfSmallest = indexOfSmallest(position);
            swap(position,positionOfSmallest);
            position++;
        }
    }

     void sortImpl_3(){
        int position=0;
        while (!isLastPosition(position)){
            int positionOfSmallest = indexOfSmallest(position);
            swap(position,positionOfSmallest);
            position++;
        }
    }

    void sortImpl_2(){
        boolean isLast = false;
        int position = 0;
        while (!isLast){
            int positionOfSmallest = indexOfSmallest(position);
            swap(position,positionOfSmallest);
            position++;
            if(isLastPosition(position)){
                isLast = true;
            }
        }
    }

    private boolean isLastPosition(int position) {
        return position==numbers.length;
    }

    void sortImpl_1(){
        for(int last = (numbers.length-1); last >= 1; last--){
            int largest = indexOfLargest(numbers, (last+1));
            //zamiana numbers[largest] z numbers([last])
            swap(largest, last);
        }
    }

    /**
jd     * Metoda znajduje indeks najwiekszej wartosci w numbers
     * @param numbers tablica liczb
     * @param size rozmiar tablicy
     * @return indeks najwiekszej wartosci
     */
    public int indexOfLargest(int numbers[], int size){

        int largest = 0;
        for(int i = 1; i < size; ++i){
            if(numbers[i] > numbers[largest]){
                largest = i;
            }
        }

        return largest;

    }

    /**
     * Metoda zwraca indeks pozycji elementu najmniejszego
     * pod pozycji do końca
     * @param position
     * @return
     */
    private int indexOfSmallest(int position){
        int smallest = position;
        for(int i = position; i < numbers.length; ++i){
            // number[i] - to wartosc z pozycji i'tej
            if(numbers[i] < numbers[smallest]){
                smallest = i;
            }
        }

        return smallest;

    }


}
