public class P_01 {

  public static void main(String[] args) {
    System.out.println("Before changing ------------");

    System.out.println(
      "The name of the main thread is : " + Thread.currentThread().getName()
    );
    System.out.println(
      "The priority of the main thread is : " +
      Thread.currentThread().getPriority()
    );

    System.out.println("After changing ------------");

    Thread t = Thread.currentThread();
    t.setName("Rahul"); // setting the name of the thread
    t.setPriority(1); // setting the Priority of the thread

    System.out.println(
      "The name of the main thread is : " + Thread.currentThread().getName()
    );
    System.out.println(
      "The priority of the main thread is : " +
      Thread.currentThread().getPriority()
    );
  }
}
