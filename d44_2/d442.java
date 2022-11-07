/*
 * @Author: fanIST fanISTREC2DX@outlook.com
 * @Date: 2022-11-07 11:07:44
 * @LastEditors: fanIST fanISTREC2DX@outlook.com
 * @LastEditTime: 2022-11-07 15:58:20
 * @FilePath: \java-1\d44_2\d442.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package d44_2;

public class d442 {
    public static void main(String[] args) {

        student S = new student("xiaoming", "nan", 16, 114514, 73, 68, 79);
        System.out.println("平均成绩" + S.aver() + "最好成绩" + S.max() + "最差成绩" + S.min());
        System.out.println("学生信息" + S.toString());
    }
}

class Person {
    String name;
    String sex;
    int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        name = "hututu";
        sex = "wuzhuangzhishengji";
        age = 16;
    }

    public String toString() {

        return "名字" + name + "性别" + sex + "年龄" + age;

    }

}

class student extends Person {
    ;
    int no;
    int scoreEn;
    int scoreCh;
    int scoreMath;

    public student(String name, String sex, int age, int no, int scoreEn, int scoreCh, int scoreMath) {
        super(name, sex, age);
        this.no = no;
        this.scoreEn = scoreEn;
        this.scoreCh = scoreCh;
        this.scoreMath = scoreMath;
        scoreCh = 70;
        scoreCh = 89;

    }

    public int aver() {
        int a;
        a = (scoreEn + scoreCh + scoreMath) / 3;
        return a;
    }

    public int max() {
        if (scoreEn > scoreCh) {
            if (scoreEn > scoreMath) {
                return scoreEn;
            } else {
                return scoreMath;
            }
        } else {
            if (scoreCh > scoreMath) {
                return scoreCh;
            } else {
                return scoreMath;
            }
        }

    }

    public int min() {
        if (scoreEn > scoreCh) {
            if (scoreCh > scoreMath) {
                return scoreMath;
            } else {
                return scoreCh;
            }
        } else {
            if (scoreEn > scoreMath) {
                return scoreMath;
            } else {
                return scoreEn;
            }
        }

    }
}