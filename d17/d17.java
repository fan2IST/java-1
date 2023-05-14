package d17;
import java.util.ArrayList;

public class d17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(98);
        list.add(97);
        list.add(96);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 80) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}