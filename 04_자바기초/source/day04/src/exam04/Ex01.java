package exam04;

import exam03.SimpleCalculator;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        int result = cal.add(10, 20);
        System.out.println(result);
        //cal.num = 20;
        System.out.println(cal.num);
        System.out.println(Calculator.num); // 정적 상수
    }
}
