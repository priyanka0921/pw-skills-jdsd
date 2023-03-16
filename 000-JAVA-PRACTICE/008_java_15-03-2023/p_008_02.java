// deadlock 

class MyThread_1 implements Runnable {

    String Book_1 = new String("JAVA");
    String Book_2 = new String("SQL");
    String Book_3 = new String("SPRING");

    public void run() {

        String name = Thread.currentThread().getName();
        if (name.equals("SON-1")) {
            try {
                Thread.sleep(2000);
                synchronized (Book_1) {
                    System.out.println(name + " Reading : " + Book_1);
                    Thread.sleep(2000);
                    synchronized (Book_2) {
                        System.out.println(name + " Reading : " + Book_2);
                        Thread.sleep(2000);
                        synchronized (Book_3) {
                            System.out.println(name + " Reading : " + Book_3);
                            Thread.sleep(2000);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("error");
            }

        } else {
            try {
                Thread.sleep(2000);
                synchronized (Book_3) {
                    System.out.println(name + " Reading : " + Book_3);
                    Thread.sleep(2000);
                    synchronized (Book_2) {
                        System.out.println(name + " Reading : " + Book_2);
                        Thread.sleep(2000);
                        synchronized (Book_1) {
                            System.out.println(name + " Reading : " + Book_1);
                            Thread.sleep(2000);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("error");
            }
        }

    }

}

public class p_008_02 {
    public static void main(String[] args) {
        MyThread_1 c1 = new MyThread_1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);

        t1.setName("SON-1");
        t2.setName("SON-2");

        t1.start();
        t2.start();
    }
}
