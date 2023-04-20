// WAP to sort a String Alphabetically

import java.util.Arrays;
public class Question_04 {
   public static void main(String args[]) {
      String str = "Rahul";
      str = str.toLowerCase();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}
