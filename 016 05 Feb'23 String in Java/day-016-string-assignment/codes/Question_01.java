// 1. WAP(Write a Program) to remove Duplicates from a String.
import java.util.*;

class Question_01 {

  static void removeDuplicate(char str[], int length) {
    int index = 0;
    for (int i = 0; i < length; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (str[i] == str[j]) {
          break;
        }
      }
      if (j == i) {
        str[index++] = str[i];
      }
    }
    System.out.println(String.valueOf(Arrays.copyOf(str, index)));
  }

  public static void main(String[] args) {
    String info = "My name is Rahul Dutta and I am currently learing Java DSA and System Design from PW SKILL";
    char str[] = info.toCharArray();
    int len = str.length;
    removeDuplicate(str, len);
  }
}
