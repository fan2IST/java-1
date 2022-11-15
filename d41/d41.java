/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-10-24 10:34:48
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-10-24 11:45:02
 * @FilePath: \java-1\d41\d41.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d41;

public class d41 {
    public static void main(String[] args) {
        Person person = new Person("小明", true, 4);
        System.out.println(person.getAge());

    }
}

/**
 * intrduce
 */
class Person {

    public Person(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;

        this.age = age;

    }

    private String name;
    private boolean gender;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return this.gender;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
