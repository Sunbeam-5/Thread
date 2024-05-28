package threading;

public class Demo5_1 {
    public static void main(String[] args) {
        // 使用Lambda表达式实现Runnable接口
        Runnable runnable = () -> System.out.println("Thread is running using lambda expression");

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
