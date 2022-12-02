/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-21 11:25:08
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-21 17:17:12
 * @FilePath: \java-1\d49\d49.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d49;

import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class d49 {
    public static void main(String[] args) {

    }
}

class Loan {

    public void test() {

        System.out.println("贷款计算:");
        Scanner dScanner = new Scanner(System.in);
        System.out.println("输入利率");
        double t = dScanner.nextDouble();
        if (t < 0) {

        } else {
            System.out.println(t);
        }

    }

}
