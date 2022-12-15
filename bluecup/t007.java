package bluecup;

import java.util.*;

public class t007 {
    public static void main(String[] args) {
        System.out.println("输入:");
        Scanner in = new Scanner(System.in);
        int innum = in.nextInt();
        List<String> sList = new ArrayList<>();
        for (int i = 0; i <= innum; i++) {// innum输入行数
            sList.add(in.nextLine());// 对输入行数进行限制
        }
        sList.remove(0);
        Collections.sort(sList);

        HashSet<String> hs = new HashSet<>();
        hs.addAll(sList); // list->Set，过滤相同单词
        sList.clear(); // 清集合
        sList.addAll(hs); // 把Set集合中（去掉重复的元素）放到list中
        int sz = sList.size();
        for (int i = sz - 1; i >= 0; i--) {
            System.out.println(sList.get(i));
        }

    }
}
