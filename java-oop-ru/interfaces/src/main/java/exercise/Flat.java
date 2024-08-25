package exercise;

// BEGIN
public class Flat implements Home {

    double area; //— жилая площадь квартиры, число типа double
    double balconyArea; // — площадь балкона, число типа double
    int floor; // — этаж, на котором расположена квартира

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }

    @Override
    public double getArea() {

        return area + balconyArea;
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
}
// END
