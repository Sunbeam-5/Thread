package threading;

// 顶层类
// 实现 Runnable 接口
class MyRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
//        Thread myThread = new Thread(myRunnable);
//        myThread.run();

        Thread t = new Thread(myRunnable);
        t.start();

//        Thread t2 = new Thread(myRunnable);
//        t2.start();
        while (true) {
            System.out.println("Hello Main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
