/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-21 11:04:32
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-21 11:17:34
 * @FilePath: \java-1\d48\d48.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d48;

public class d48 {
    public static void main(String[] args) {
        String s = "abc";
        if (s.equals("abc")) {
            throw new NumberFormatException();
        } else {
            System.out.println(s);
        }
    }
}
