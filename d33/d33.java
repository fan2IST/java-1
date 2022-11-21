/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-10-22 14:51:08
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-10-23 18:30:55
 * @FilePath: \java-1\d33\d33.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @Author: fan2IST fanISTREC2DX@outlook.com
 * @Date: 2022-10-22 14:51:08
 * @LastEditors: fan2IST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-10-23 18:26:31
 * @FilePath: \java-1\d33\d33.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d33;

@SuppressWarnings("unchecked")
public class d33 {
    public static void main(String[] args) {
        String str1 = "java";
        String strr2 = new String("java");
        char[] array = { 'j', 'a', 'v', 'a', 'h', 'e', 'l', 'l', 'o' };
        String str3 = new String(array);
        System.out.println(str1);
        System.out.println(strr2);
        System.out.println(str3);
        System.out.println(str3.length());// 判断长度
        System.out.println(str3.isEmpty());// 判断是否为空
        System.out.println(str3.charAt(2));// 取第。。。个字符
        System.out.println(str3.indexOf("H"));
        System.out.println(str1.equals(strr2));
        String str4 = "JAVA";
        System.out.println(str1.equalsIgnoreCase(str4));// 忽略大小写进行比较
        System.out.println(str1.startsWith("java"));
        System.out.println(str1.startsWith("java"));// 是否以java结尾
        System.out.println(str3.substring(2, 4));// 截取2-6
        str3 = str3.replaceAll("h", "fuck");
        System.out.println(str3);
        String[] split = str3.split(",");
        for (String str : split) {
            System.out.println(str);
        }
        byte[] bytes = str3.getBytes();
        char[] chars = str3.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println(str3.toUpperCase());// 转换为大写

    }
}

/**
 * Innerd33
 */
