public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hello runnable = new Hello();
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
class Hello implements Runnable {
    public void run(){
    }
}
