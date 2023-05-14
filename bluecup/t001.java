/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 13:05:00
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-29 13:36:58
 * @FilePath: \java-1\bluecup\001.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package bluecup;

public class t001 {
    public static void main(String[] args) {
        int a = 2022;
        String b = Integer.toBinaryString(a);
        System.out.println(Integer.toBinaryString(a));
        for (;; a++) {
            b = Integer.toBinaryString(a);
            if (b.indexOf("000000") != -1) {
                System.out.println(b);
                System.out.println(a);
                break;
            } else {
                System.out.println(b);
                System.out.println(a);
            }

        }

    }
}
