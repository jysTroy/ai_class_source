package exam06;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("사과", "오렌지", "멜론", "망고"));
        Collections.sort(fruits, Comparator.reverseOrder());
        System.out.println(fruits);
    }
}
