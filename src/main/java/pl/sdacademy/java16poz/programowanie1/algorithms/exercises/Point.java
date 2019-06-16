package pl.sdacademy.java16poz.programowanie1.algorithms.exercises;

/**
 * Klasa - 'Point' w pakiecie programowanie1.algorithns
 *
 * Zadanie
 * ----------------------------------------------------
 * Utwórz klase punkt.
 * Utwórz metodę distance(Point point)
 * wyliczajacą odległość pomiedzy dwoma punktami ( wzor pitagorasa)
 *
 * Napisz 3 testy weryfikujace
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 01.06.2019 23:08
 **/
public class Point {

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double x;
    double y;

    public double distance(Point point){
        return Math.sqrt((point.y - y) * (point.y - y) + (point.x - x) * (point.x - x));
    }

}
