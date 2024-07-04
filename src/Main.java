public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

         // Thread -- đơn vị nhỏ nhất trong java
        // Thread kế thừa interface Runnable

        // vonngf đời của luông
        // NEW : khởi tạo luồng , chưa start
        // Runnable : khi gọi đển start ắt đầu luồng
        // Waiting : tạm dừng luồng để chờ 1 luồng khác thực thi xong
        // TimedWaiting : chờ sau 1 khoang thời gian
        // Blocked : luồng bị khóa
        // Terminal : luồng bị đóng

        // làm sao dể tạo 1 luồng trong java
        // cách 1 : thông qua lớp Thread
        Thread t1 = new MyThread();
        // chạy luồng
//        t1.start();
//        System.out.println("kết thúc hàm main");
        // Triê khai Runable
//        Runnable t2 = new MyRunnable();
        // chạy luồng
//        Thread t3 = new Thread(t2);
//        t3.start();
        // Xử lý baatts đồng bộ : synchronized
        // dùng cho phương thức (tĩnh và ko tĩnh)
        // dùng cho khối



        // chung tài nguyên
        MyResource resource = new MyResource(); // đây là tài nguyên chung cua  2 luồng
        Thread threadA = new MyResourceThread(resource, "Thread A");
        Thread threadB = new MyResourceThread(resource, "Thread B");

        threadA.start();
        threadB.start();
    }
}