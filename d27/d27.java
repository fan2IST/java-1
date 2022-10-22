/*
 *                        _oo0oo_
 *                       o8888888o
 *                       88" . "88
 *                       (| -_- |)
 *                       0\  =  /0
 *                     ___/`---'\___
 *                   .' \\|     |// '.
 *                  / \\|||  :  |||// \
 *                 / _||||| -:- |||||- \
 *                |   | \\\  - /// |   |
 *                | \_|  ''\---/''  |_/ |
 *                \  .-\__  '-'  ___/-. /
 *              ___'. .'  /--.--\  `. .'___
 *           ."" '<  `.___\_<|>_/___.' >' "".
 *          | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *          \  \ `_.   \_ __\ /__ _/   .-` /  /
 *      =====`-.____`.___ \_____/___.-`___.-'=====
 *                        `=---='
 * 
 * 
 *      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 
 *            佛祖保佑     永不宕机     永无BUG
 */

/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-09-30 08:42:33
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-09-30 08:45:30
 * @FilePath: \java-1\d27\d27.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */

package d27;

import java.util.Scanner;

public class d27 {
    public static void main(String[] args) {
        try (Scanner dScanner = new Scanner(System.in)) {
            System.out.print("输一个");
            int d = dScanner.nextInt();
            int f = d / 10;
            System.out.println(f);
            switch (f) {
                case 9:
                    System.out.println("A");
                    break;

                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;

                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("remake");
                    break;
            }
        }

    }
}
