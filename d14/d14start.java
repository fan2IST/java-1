package d14;

public class d14start extends Thread {// 调用线程
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("my thread");

        }
        int b[][] = new int[][] { { 1 }, { 2, 3 }, { 4, 5, 6 } };
        for (int k = 0; k < b.length; k++) {
            for (int c = 0; c < b[k].length; c++) {
                System.out.println(b[k][c]);
            }

        }
    }
}
