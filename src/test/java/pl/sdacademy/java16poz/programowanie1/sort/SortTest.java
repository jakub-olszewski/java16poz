package pl.sdacademy.java16poz.programowanie1.sort;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.programowanie1.TestBase;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * SortTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 27.05.2019 21:09
 **/
public class SortTest extends TestBase {
    // given
    int[] numbers;
    int[] sortedNumbers;
    AlgorithmSort algorithmSort;

    /**
     * Metoda setUp służy do tworzenia elementów wymaganych w testach
     * inicjuje je
     */
    @Before
    public void setUp(){
        numbers = initNumbers(1,3,80,5,67,3,2,57,32,79);
        sortedNumbers = initNumbers(1,2,3,3,5,32,57,67,79,80);
    }


    public static int getrnd10000() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }


    /**
     * Test sprawdza zrzucenie wyjątku
     * throw
     */
    @Test(expected = IllegalArgumentException.class)
    public void nullTableTest(){
        algorithmSort = new BubbleSort();
        algorithmSort.load(null);

    }

    @Test
    public void emptyTableTest(){
        algorithmSort = new BubbleSort();
        try {
            algorithmSort.load(new int[0]);
        }catch(Exception exception){
            assertTrue("Wyjątek powinien być typu IllegalArgumentException",exception instanceof IllegalArgumentException);
            assertTrue("Wyjątek powinien mieć wiadomość",exception.getMessage().equals("Tablica jest pusta!"));
        }

    }

    private void algorithmSortTest(AlgorithmSort testedAlgorithmSort){
        //given
        algorithmSort = testedAlgorithmSort;

        //when
        execute(algorithmSort);

        //when
        assertTable("Liczby powinny być posortowane rosnąco", sortedNumbers,algorithmSort.get());
    }


        @Test
    public void bubbleSortTest(){
        algorithmSortTest(new BubbleSort());
    }


    @Test
    public void selectionSortTest(){
        algorithmSortTest(new SelectionSort());
    }

    @Test
    public void insertionSortTest(){
        algorithmSortTest(new InsertionSort());
    }

    @Test
    public void quickSortTest(){
        algorithmSortTest(new QuickSort());
    }

    @Test
    public void mergeSortTest(){
        algorithmSortTest(new MergeSort());
    }

    /**
     *
     * @param tableSort algorytm testowany
     */
    private void execute(AlgorithmSort tableSort){
        tableSort.load(numbers);
        tableSort.print();
        tableSort.sort();
        tableSort.print();
    }

}
