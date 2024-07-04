public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = -1; i >= -100 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
