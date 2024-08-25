package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");

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
