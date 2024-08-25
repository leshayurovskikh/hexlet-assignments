package exercise;

public class Main {

    public static void main(String[] args) {


        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        System.out.println(segment.getBeginPoint()); // 5
        System.out.println(segment.getEndPoint()); // 2
    }
}
