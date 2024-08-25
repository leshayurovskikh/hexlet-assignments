package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App{
    public static List<String> buildApartmentsList(List<Home>list, int n) {
        if(n>0&list.isEmpty()){
List<String>res = new ArrayList<>();
Comparator<Home>compareByArea = Comparator.comparing(Home::getArea);
ArrayList<Home> sortedHome = list.stream()
        .sorted(compareByArea)
        .collect(Collectors.toCollection(ArrayList::new));
for (Home list1 :sortedHome){
    res.add(list1.toString());
}
List<String> res2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            res2.add(res.get(i));
        }
        return res2;
    } else {
        ArrayList<String> now = new ArrayList<>();
        return now;
        }
    }
}
// END
