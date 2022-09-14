package d23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class d23 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);
        Collections.addAll(list, "java", "javase", "javace");
        System.out.println(list);
        Collections.reverse(list);// 反转
        System.out.println(list);
        Collections.swap(list, 1, 3);// 交换
        System.out.println(list);
        Collections.sort(list);// 排序
        System.out.println(list);
        int index = Collections.binarySearch(list, "java");// 折半查找
        System.out.println(index);
        System.out.println(Collections.max(list));

    }

}

class class1 {
    int a, b;
    private int c, d;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof class1)) {
            return false;
        }
        class1 class1 = (class1) o;
        return a == class1.a && b == class1.b && c == class1.c && d == class1.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

}
