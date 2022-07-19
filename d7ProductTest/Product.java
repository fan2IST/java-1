package d7ProductTest;

public class Product {
    public static void main(String[] args) {
        PTtest iphone8 = new PTtest();// iphine8为局部变量，引用，变量中保存的内存地址指向堆内存中的地址

        System.out.println("商品编号：" + iphone8.productNo);
        System.out.println("价格：" + iphone8.price);

        iphone8.productNo = 11;
        iphone8.price = 6800.0;

        System.out.println("商品编号：" + iphone8.productNo);
        System.out.println("价格：" + iphone8.price);
    }
}
