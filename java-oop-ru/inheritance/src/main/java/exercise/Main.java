package exercise;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Tag p = new PairedTag(
                "p",
                Map.of("id", "abc"),
                "Text paragraph",
                new ArrayList<Tag>()
        );

        System.out.println(p.toString());
    }
}
