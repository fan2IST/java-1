/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-04 08:26:35
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-04 08:40:58
 * @FilePath: \java-1\d43\d43.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d43;

/**
 
 */
class Parent {
    int v = 20;

    public void m1() {
        System.out.println("父类中的一个方法");
    }

}

class Son extends Parent {
    String v = "子类中的一个变量";

    public void m1() {
        System.out.println("子类的一个方法");

    }

    public void m2() {
        System.out.println(v);
        System.out.println("父类中的变量‘值为；" + super.v);
        m1();
        super.m1();
    }
}

public class d43 {
    public static void main(String[] args) {
        Son e = new Son();
        e.m2();
    }
}
