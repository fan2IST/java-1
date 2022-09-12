package d22hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class d22 {
    public static void main(String[] args) {
        // MAP操纵一对元素,元素以key-value的形式进行储存
        HashMap map = new HashMap();
        map.put("h", "hello");
        map.put("W", "world");
        map.put("j", "world");
        map.put("W", "javase");
        map.put("s", "javame");
        map.put("d", "javae");
        map.put("f", "javae");
        map.put("g", "wor");
        map.put("h", "w");
        map.put("Wr", "worl");
        map.put("f", "javae2");
        System.out.println(map);
        map.put("a", "wor");
        System.out.println(map);
        System.out.println(map.containsKey("a"));// 判断是否有key
        System.out.println(map.containsValue("javae"));// 判断是否有value
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
