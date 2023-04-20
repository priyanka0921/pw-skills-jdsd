// 2. WAP to reverse a String
// Input: "PWSKILLS"
// Output: "SLLIKSPW"

class Question_02 {

  static String revString(String str) {
    String nstr = "";
    for (int i = 0; i < str.length(); i++) {
      nstr = str.charAt(i) + nstr;
    }
    return nstr;
  }

  public static void main(String[] args) {
    String str = "PWSKILLS";

    String s1 = str.substring(0, 2);
    String s2 = str.substring(2, 8);

    System.out.println("Old String : " + str);

    String nstr = revString(s2) + s1;

    System.out.println("New String : " + nstr);
  }
}
