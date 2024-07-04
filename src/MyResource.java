public class MyResource {
    public synchronized void print(String name){
        for (int i = 1; i < 100; i++) {
            System.out.println(name+" - "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
