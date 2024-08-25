package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");

        Home flat = new Flat(54.5, 4, 3);
        double area = flat.getArea(); // 58.5
        System.out.println(flat.toString());

        Home cottage = new Cottage(135, 2);
        double area1 = cottage.getArea(); // 135
        System.out.println(cottage.toString());

        List<Home> apartments = new ArrayList<>(List.of(
                new Flat(41, 3, 10),
                new Cottage(125.5, 2),
                new Flat(80, 10, 2),
                new Cottage(150, 3)
        ));

        List<String> result = App.buildApartmentsList(apartments, 0);
        System.out.println(result);
    }


}
