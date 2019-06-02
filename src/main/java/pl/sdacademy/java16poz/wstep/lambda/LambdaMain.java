package pl.sdacademy.java16poz.wstep.lambda;

public class LambdaMain {
    public static void main(String[] args) {

        /**
         * mamy po lewej stronie interfejs, a po prawej wykonanie (sposób działania)
         */

        Liczba3 l = () -> 3.14f;

        Liczba3 l2 = new Liczba3() {
            @Override
            public float bezArgumentu() {
                return 3.14f;
            }
        };
        /**
         * Lambda sprawdza podzielnosc przez 2
         */
        Liczba l1 = (a) -> (a % 2) == 0;
        boolean czyPodzielnaPrzez2 = l1.wartosc(5);

        Liczba l4 = new Liczba() {
            @Override
            public boolean wartosc(int a) {
                return (a % 5) == 0;
            }
        };
        boolean czyPodzielnaPrzez5 = l4.wartosc(10);

        System.out.println(czyPodzielnaPrzez2);
        System.out.println(czyPodzielnaPrzez5);

        Liczba2 sumaWiekszaOd10 = (a, b) -> (a + b) > 10;

        Liczba2 l6 = new Liczba2() {
            @Override
            public boolean test(int a, int b) {
                return (a + b) > 10;
            }
        };
        boolean sumaWiekszaod10 = l6.test(9, 12);
        System.out.println(sumaWiekszaod10);
    }
}