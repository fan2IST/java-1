/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 15:11:43
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-12-24 16:22:24
 * @FilePath: \java-1\bluecup\t007.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
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
