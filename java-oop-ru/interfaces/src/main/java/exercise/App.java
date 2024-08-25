package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int n) {
        List<String> result = new ArrayList<>();
        if (n > 0 & n <= list.size()) {
            List<String> res = new ArrayList<>();
            Comparator<Home> compareByArea = Comparator.comparing(Home::getArea);
            ArrayList<Home> sortedHome = list.stream()
                    .sorted(compareByArea)
                    .collect(Collectors.toCollection(ArrayList::new));
            for (Home list1 : sortedHome) {
                res.add(list1.toString());
            }
            List<String> res2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                res2.add(res.get(i));
            }
            result = res2;
        }
        return result;
    }
}
// END
