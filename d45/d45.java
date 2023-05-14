/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-11 09:15:06
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-11 09:22:24
 * @FilePath: \java-1\d45\d45.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d45;

public class d45 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        bird b = new bird();
        t.eat();
        b.eat();

    }
}

abstract class Animal {
    abstract void eat();

}

class Tiger extends Animal {
    void eat() {
        System.out.println("t1");

    }
}

class bird extends Animal {

    void eat() {
        System.out.println("b2");
    }
}
