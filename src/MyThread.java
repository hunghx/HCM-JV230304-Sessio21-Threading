public class MyThread extends Thread {
    @Override
    public void run() {
        /// khối code luồng thực thi
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
