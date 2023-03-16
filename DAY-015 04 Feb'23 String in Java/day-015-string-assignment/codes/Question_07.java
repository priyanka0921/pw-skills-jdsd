// 7. Write a program to delete all consonants from the string "Hello, have a good day"

public class Question_07 {


  public static void main(String args[]) {
    String s = "Hello, have a good day";
    String s1 = "";
    for (int i = 0; i < s.length(); i++) {
      if (
        s.charAt(i) == 'a' ||
        s.charAt(i) == 'A' ||
        s.charAt(i) == 'e' ||
        s.charAt(i) == 'E' ||
        s.charAt(i) == 'i' ||
        s.charAt(i) == 'I' ||
        s.charAt(i) == 'o' ||
        s.charAt(i) == 'O' ||
        s.charAt(i) == 'U' ||
        s.charAt(i) == 'u' ||
        s.charAt(i) == ' '
      ) {
        s1 = s1+s.charAt(i);
      } else {
        continue;
      }
    }
    System.err.println(s1);
  }
}
