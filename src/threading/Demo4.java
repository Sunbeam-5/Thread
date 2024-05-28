package threading;

public class Demo4 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
           @Override
            public void run(){
               while (true) {
                   System.out.println("Hello Thread");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
        });
        t.start();
    }

}
