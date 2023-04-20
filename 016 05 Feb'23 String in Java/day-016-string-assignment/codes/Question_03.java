// 3. WAP to check if "2552" is palindrome or not.

public class Question_03 {
    public static void main(String[] args) {
  
        String str = "2552", reverseStr = "";
        
        int strLength = str.length();
    
        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + str.charAt(i);
        }
    
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
          System.out.println(str + " is a Palindrome String.");
        }
        else {
          System.out.println(str + " is not a Palindrome String.");
        }
      }
}
