public class MyResourceThread extends Thread{
    private  MyResource myResource;
    private String threadName;

    public MyResourceThread(MyResource myResource, String threadName) {
        this.myResource = myResource;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        myResource.print(threadName);
    }
}
