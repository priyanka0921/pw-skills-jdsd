// 6. Write a program to check if the letter 'e' is present in the word 'Umbrella'.

public class Question_06 {
    public static void main(String[] args) {
        char c = 'e';
        String s1 = "Umbrella";

        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)==c){
                System.out.println(c+" is present in "+ s1);
                break;
            }
        }
    }
}
