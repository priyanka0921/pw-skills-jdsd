
class MyThread extends Thread{
    public void run(){
        System.out.println("This is a child thread.");
    }
}

public class P_02 {

  public static void main(String[] args) {
    System.out.println("Main Thread");

    MyThread t = new MyThread(); // object of MyThread
    t.start(); // calling the start method giving it to (thread scheduler)
  }
}
