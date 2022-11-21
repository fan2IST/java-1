/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-18 08:26:29
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-18 09:39:30
 * @FilePath: \java-1\d46\d46.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d46;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("输入浮点数");
                double num = scanner.nextDouble();
                System.out.println(num);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("异常类型" + e.toString());// TODO: handle exception
                flag = true;
                scanner.next();

            } finally {
                System.gc();
                System.out.println("释放");
            }
        }

        System.out.println("芜湖");

    }
}
