package D24;

import java.util.ArrayList;
import java.util.List;

public class d24 {
    public static void main(String[] args) {
        test(new ArrayList<String>());
        test(new ArrayList<Integer>());
    }

    public static void test(ArrayList<?> list) {// 泛型通配符
        System.out.println(list);
    }
}
