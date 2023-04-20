// 5. WAP to implement Anagram Checking least inbuilt methods being used

import java.util.Arrays;

class Question_05 {

  static char[] stringToArray(String str) {
    str = str.toLowerCase();
    char[] ch = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    return ch;
  }

  static boolean areAnagram(char[] str1, char[] str2) {
    int n1 = str1.length;
    int n2 = str2.length;
    if (n1 != n2) return false;
    Arrays.sort(str1);
    Arrays.sort(str2);
    for (int i = 0; i < n1; i++) {
      if (str1[i] != str2[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    String s1 = "silent";
    String s2 = "listen";
    char str1[] = stringToArray(s1);
    char str2[] = stringToArray(s2);
    if (areAnagram(str1, str2)) System.out.println(
      "The two strings are" + " anagram of each other"
    ); else System.out.println(
      "The two strings are not" + " anagram of each other"
    );
  }
}
