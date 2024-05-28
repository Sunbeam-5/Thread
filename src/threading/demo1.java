package threading;

// 继承Thread类创建线程
public class demo1 {
    // 静态内部类
    public static class MyThread extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
