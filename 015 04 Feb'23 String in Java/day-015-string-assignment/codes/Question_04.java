// 4. How do you compare two strings in Java? Give an Example

public class Question_04 {

  public static void main(String[] args) {
    String s1 = "Sachin";
    String s2 = "Sachin";
    String s3 = new String("Sachin");
    String s4 = "Saurav";
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s3)); //true
    System.out.println(s1.equals(s4)); //false

    String s5 = "Sachin";
    String s6 = "Sachin";
    String s7 = new String("Sachin");
    System.out.println(s5 == s6); //true (because both refer to same instance)
    System.out.println(s5 == s7); //false(because s3 refers to instance created in nonpool)
  }
}
