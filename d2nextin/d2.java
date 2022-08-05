package d2nextin;

public class d2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int day = s.nextInt();
        String str = "cn0e1";
        System.out.println(str);
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            default:
                System.out.println("你说你妈那");
        }
        do {
            System.out.println(day);
            day++;
        } while (day < 19);
        s.close();
    }
}
