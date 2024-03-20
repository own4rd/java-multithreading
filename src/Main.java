public class Main {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("FIrst Thread");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("FIrst Thread");
        thread2.start();
    }
}
