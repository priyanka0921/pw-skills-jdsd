// 3. WAP to reverse a sentence while preserving the position
// Input: Think Twice
// Output: "kniht eciwt"

public class Question_03 {

  static String revString(String str) {
    String nstr = "";
    for (int i = 0; i < str.length(); i++) {
      nstr = str.charAt(i) + nstr;
    }
    return nstr;
  }

  public static void main(String[] args) {
    String str = "Think Twice", nstr = "";
    str = str.toLowerCase();
    String[] sArr = str.split(" ");

    System.out.println("Original String : " + str);

    for (int i = 0; i < sArr.length; i++) {
      nstr = nstr + " " + revString(sArr[i]);
    }
    System.out.println("Reversed wString : " + nstr);
  }
}
