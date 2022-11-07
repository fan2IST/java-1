/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-07 10:28:17
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-07 16:06:20
 * @FilePath: \java-1\d44\d44.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d44;

public class d44 {
    public static void main(String[] args) {
        // Person hun = new Person();

        // hun.name = "hutt";
        // hun.address = "fandouhuayuan";
        // hun.email = "114514@qq.com";
        // hun.phone = 114514191;
        // hun.showMessage();
        Employee man = new Employee();
        man.room = "wuhuclass";
        man.day = "2003,0724";
        man.showMessage();

    }
}

class Person {
    String name;
    String address;
    int phone;
    String email;

    public void showMessage() {
        System.out.println("姓名" + name);
        System.out.println("地址" + address);
        System.out.println("电话号" + phone);
        System.out.println("邮件" + email);
    }

}

class Employee extends Person {

    int money;
    String room;
    String day;

    public void showMessage() {
        System.out.println("钱" + money);
        System.out.println("办公室" + room);
        System.out.println("受聘日期" + day);
        super.showMessage();
    }

}
