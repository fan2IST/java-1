/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-10-25 17:41:02
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-10-25 17:44:27
 * @FilePath: \java-1\d35\d35.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d35;

import java.text.SimpleDateFormat;
import java.util.Date;

public class d35 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        String format1 = format.format(date);
        System.out.println(format1);

    }
}
