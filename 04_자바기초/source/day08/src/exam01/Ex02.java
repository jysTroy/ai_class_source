package exam01;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args)  throws Exception {
        Class<Ex01> cls = Ex01.class;

        // class 객체가 생성될 때 정의된 에너테이션 구현 객체도 생성
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        int min = myAnno.min();
        int[] max = myAnno.max();

        System.out.printf("min = %d, max = %s%n", min, Arrays.toString(max));

        Constructor<Ex01> con = cls.getConstructor(new Class[] {});
        MyAnno myAnno2 = con.getAnnotation(MyAnno.class);
        int min2 = myAnno2.min();
        int[] max2 = myAnno2.max();
        String value = myAnno2.value();
        System.out.printf("min = %d, max = %s, value = %s%n", min2, Arrays.toString(max2), value);
    }
}
