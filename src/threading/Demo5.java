package threading;

public class Demo5 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Hello Thread");
        });

        thread.start();
    }
}
