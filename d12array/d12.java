package d12array;

public class d12 {
    public static void main(String[] args) {
        d12 test = new d12();
        System.out.println(test.method());
    }

    public int method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }
}
