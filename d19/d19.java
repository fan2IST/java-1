package d19;

import java.util.LinkedList;

public class d19 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list.add("hello");
        list.add("Java");
        System.out.println(list);
        list.addFirst("a");
        list.addLast("B");
        System.out.println(list);
        list.push("javaE");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.pop());// 将值取出
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.pop());// 全部取出，并非只拿值
    }
}
