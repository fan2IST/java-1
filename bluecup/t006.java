/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 14:58:20
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-29 15:12:05
 * @FilePath: \java-1\bluecup\t006.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-11-29 14:58:20
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-29 15:06:01
 * @FilePath: \java-1\bluecup\t006.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package bluecup;

import java.util.Scanner;

public class t006 {
    public static void main(String[] args) {
        Scanner tScanner = new Scanner(System.in);
        int t = tScanner.nextInt();
        int c = tScanner.nextInt();
        int s = tScanner.nextInt();
        double v = c * 1.0 / t;
        double out = (s - c) / v;
        System.out.printf("%.0f", out);

    }
}
