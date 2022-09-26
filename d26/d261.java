package d26;

public class d261 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {

            int a = i / 100;
            int b = (i - a * 100) / 10;
            int c = i - a * 100 - b * 10;
            int f = a * a * a + b * b * b + c * c * c;

            if (i == f) {
                System.out.println(i);
            }
        }
    }
}
