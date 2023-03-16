// synchronized block and method 

class MyThread implements Runnable {

    public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + " has entered the parking.");
            Thread.sleep(3000);

            System.out.println(Thread.currentThread().getName() + " has found the car.");
            Thread.sleep(3000);

            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " has started the car.");
                Thread.sleep(3000);
    
                System.out.println(Thread.currentThread().getName() + " has parked the card.");
                Thread.sleep(3000);
            }

            
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}

public class p_008_01 {

    public static void main(String[] args) {
        MyThread c1 = new MyThread();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
