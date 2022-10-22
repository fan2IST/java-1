/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-10-09 08:54:01
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-10-09 09:46:44
 * @FilePath: \java-1\d30\d30.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d30;

public class d30 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;// 公，母，小
        int d;
        for (; a < 100; a++) {
            for (; b < 100; b++) {
                for (; c < 100;) {
                    d = a + b + 3 * c;
                    if (d == 100) {
                        int f;
                        f = 5 * a + 3 * b + c;
                        if (f == 100) {
                            System.out.println(a + " " + b + " " + 3 * c + " ");
                            break;

                        }
                    }
                    c = c + 3;
                }
                c = 0;
            }
            b = 0;
        }
    }
}
