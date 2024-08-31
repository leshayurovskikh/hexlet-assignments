package exercise;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Tag img = new SingleTag("img", Map.of("class", "v-10", "id", "wop"));
        System.out.println(img.toString()); // <img class="v-10" id="wop">
    }
}
