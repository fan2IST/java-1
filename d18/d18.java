package d18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings("unchecked")
public class d18 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        System.out.println(list.size());
        System.out.println(list.contains("5"));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("3");
        list.remove(0);
        System.out.println(list);
        list.add(1, "wuhu");
        System.out.println(list);
        list.set(1, "wuhu2");
        System.out.println(list);
        System.out.println(list.indexOf("4"));
        List list1 = list.subList(1, 3);
        System.out.println(list1);

    }
}
