package d9this2;

public class d92 {
    public static void doSome() {
        System.out.println("dosome");
    }

    public void doOther() {
        System.out.println("doother");
        System.out.println("test,2see，c699");
    }

    public static void method1() {
        d92.doSome();// 完整
        doSome();// 省略
        d92 t = new d92();
        t.doOther();
    }

    public void method2() {

    }

    public static void main(String[] args) {// 主方法
        /**
         * 1.要求在这里编写程序调用method1
         * 2.使用完整方法调用
         * 3。使用省略方法调用
         */
        d92.method1();
        method1();

        /**
         * * 1.要求在这里编写程序调用method2
         * 2.使用完整方式调用
         * 3.使用省略方式调用
         */
        d92 t = new d92();
        t.method2();

        System.out.println("test");

    }

    int i = 10;// 实例变量

}
