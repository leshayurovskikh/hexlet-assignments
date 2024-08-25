package exercise;

// BEGIN
public class Segment {
    Point point1;
    Point point2;


    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint(){
        return point2;
    }

    public Point getEndPoint(){
        return point1;
    }

 public Point getMidPoint(){
        return new Point((getBeginPoint().getX()+getEndPoint().getX()/2),(getBeginPoint().getY()+getEndPoint().getY())/2);
 }
}
// END
