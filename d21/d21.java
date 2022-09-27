package d21;

import java.util.Iterator;
import java.util.TreeSet;
@SuppressWarnings("unchecked")
public class d21 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(9);// 唯一有序
        System.out.println(set.size());
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
