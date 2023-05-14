/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 14:18:44
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-29 14:53:29
 * @FilePath: \java-1\bluecup\t005.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package bluecup;

import java.util.ArrayList;

public class t005 {
    public static void main(String[] args) {

        int a = 2022;
        ArrayList bList = new ArrayList<>();
        for (int i = 0; i < 2022; i++) {
            for (int j = 2; j < i; j++) {
                int g = i % j;
                if (g != 0) {
                    bList.add(i);
                    System.out.println(i);
                } else {

                }

            }
        }

    }

}
