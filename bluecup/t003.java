/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 13:41:36
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-29 14:13:16
 * @FilePath: \java-1\bluecup\t003.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package bluecup;

public class t003 {
    public static void main(String[] args) {
        int a = 10;
        String b = Integer.toString(16, a);// a转16进制

        for (;; a++) {
            b = Integer.toString(16, a);// 赋值与b
            int d = Integer.parseInt(b);// string类型转int
            int c = a % d;
            if (c != 0) {
                System.out.println(a + b);

            } else {
                System.out.println(a + b);
                break;

            }

        }

    }
}
