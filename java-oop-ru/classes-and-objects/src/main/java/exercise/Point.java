package exercise;

// BEGIN
public class Point {
    int a;
    int b;


    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int getX() {
        return a;
    }

    public int getY() {
        return b;
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
// END
