package threading;

public class Demo4_1 {
    public static void main(String[] args) {
        // 使用Runnable的匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hello Thread");
                    try {
                        Thread.sleep(1000); // 休眠1秒
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                        break; // 处理中断并退出循环
                    }
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
    }
}
