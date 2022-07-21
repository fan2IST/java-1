package d8ConstructorTest;

@SuppressWarnings("unused")
/**
 * 表示该属性在方法或类中没有使用。
 * The value of the local variable xxx is not usedJava解决办法
 */
public class constructortest {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(10);
        User u3 = new User("test");
        User u4 = new User(10, "test");
    }
}
