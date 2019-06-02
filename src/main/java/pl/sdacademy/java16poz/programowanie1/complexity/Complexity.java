package pl.sdacademy.java16poz.programowanie1.complexity;

/**
 * Complexity - złożność obliczeniowa
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 25.05.2019 11:25
 **/
public class Complexity {

    public void plansza(){
        int x= 10;//1
        int y= 10;//1

        for (int i = 0;i<x;i++){//n
            for(int j=0;j<y;j++){//n
                System.out.println(x+" x "+y+"="+(x*y));//1
            }
        }
        // f(n) = 1+1+n*n*1 = 2 + n^2 = n^2 + 2   ~~ O(n^2)
    }

    public int sum(int[] numbers) {
        int sum = 0;//przypisanie to jedna operacja
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Complexity complex = new Complexity();
        int sum = complex.sum(new int[]{1, 2, 3, 4});
        System.out.println(sum);
    }
}
