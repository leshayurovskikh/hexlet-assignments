package exercise;

// BEGIN
public class Cottage implements Home {

    double area; //— Общая площадь коттеджа, число типа double
    int floorCount; //— количество этажей

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        int res = 0;
        if(getArea()>another.getArea()){
            res = 1;
        } else if (getArea()<another.getArea()) {
            res = -1;
        } else if (getArea()==another.getArea()) {
            res = 0;
        }
        return res;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
