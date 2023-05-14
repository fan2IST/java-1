package d8ConstructorTest;

public class User {// 方法重载
    public User() {
        System.out.println("你输你码那");
    }

    public User(int i) {
        System.out.println("int");
    }

    public User(String name) {
        System.out.println("string");
    }

    public User(int i, String name) {
        System.out.println("double");
    }

}
