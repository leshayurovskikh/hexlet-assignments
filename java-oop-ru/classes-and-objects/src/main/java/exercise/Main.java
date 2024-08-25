package exercise;

public class Main {

    public static void main(String[] args) {


        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        Segment segment = new Segment(point1, point2);
        System.out.println(segment.getBeginPoint().toString()); // 5
        System.out.println(segment.getEndPoint()); // 2
    }
}
