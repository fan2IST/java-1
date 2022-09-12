package d23;

import java.util.ArrayList;
import java.util.Collections;

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
