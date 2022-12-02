/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-25 08:46:45
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-25 09:29:18
 * @FilePath: \java-1\d50\d50.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d50;

public class d50 {
    public static void main(String[] args) {

        int c[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(c[1][0]);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.println(c[j][i]);
            }
        }
    }
}
