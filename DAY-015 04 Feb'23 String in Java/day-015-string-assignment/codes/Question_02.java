// 2. How do you concatenate two strings in Java? Give an example?

public class Question_02 {

  public static void main(String args[]) {
    System.out.println("Method 01");
    String s = "Rahul" + " " + "Dutta";
    System.out.println(s);

    System.out.println("Method 02");
    String s1 = "Sourav ";
    String s2 = "Dutta";
    String s3 = s1.concat(s2);
    System.out.println(s3);
  }
}
