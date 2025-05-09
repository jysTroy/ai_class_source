package exam01;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex07 {
    public static void main(String[] args) {
        Random randome = new Random();
//        randome.ints().limit(10).forEach(System.out::println);
        randome.ints(10).forEach(System.out::println);
    }
}
