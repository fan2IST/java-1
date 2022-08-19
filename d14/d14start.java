package d14;

public class d14start extends Thread {// 调用线程
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("my thread");
        }
    }
}
