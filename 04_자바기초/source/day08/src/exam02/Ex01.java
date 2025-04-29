package exam02;

import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("이름1");
        items.add("이름2");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");

        for (int i = items.size() - 1; i >= 0; i--){
            items.remove(i);
        }

//        for (int i = 0; i < items.size(); i++) {
//            items.remove(i);
            /**
             * 총 배열 수 4
             * 0번 째 이름1 삭제 후 재구성
             * 0번 째 이름2는 남기고 1번 째 이름3 삭제 후 재구성
             * 0번째 이름2는 남기고 1번 째 이름4 남기고
             * 2번 째 이름 5 삭제 // 이름2, 이름4가 남음
             */

//            String name = items.get(i);
//            System.out.println(name);


        System.out.println(items); // items.toString();
        /*for (String item : items) {
            System.out.println(item);
        }*/
    }
}
