package Strings;

public class Mutable 
{
    public static void main(String[] args) 
    {
        // StringBuffer sb=new StringBuffer("Virat");

        // System.out.println(sb);
        // //StringBuffer sb="";invalid
        // sb.append("Kohli");
        // System.out.println(sb);
        StringBuilder sb=new StringBuilder("Virat");

        System.out.println(sb);
        //StringBuffer sb="";invalid
        sb.append("Kohli");
        System.out.println(sb);
// final int a=10;
        // a=20;
        // System.out.println(a);
        final StringBuffer sb=new StringBuffer("Virat");
        sb.append("kohli");
        //System.out.println(sb);
       // sb=new StringBuffer("Sachin");
        System.out.println(sb);
	 // StringBuilder sb=new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());//how many character you can add
        // System.out.println(sb.length());//how mancy character r present

    //     StringBuffer sb2=new StringBuffer("Sachin");
    //     System.out.println(sb2);
    //     System.out.println(sb2.capacity());
    //     System.out.println(sb2.charAt(1));
    //    sb2.setCharAt(1, 'A'); //SAachin or SAchin
    //    System.out.println(sb2);

    // StringBuilder sb=new StringBuilder(150);
    // System.out.println(sb.capacity());
    // sb.append("java");
    // System.out.println(sb);
    // sb.trimToSize();
    // System.out.println(sb.capacity());

    StringBuilder sb=new StringBuilder("pwjava");
    System.out.println(sb);
    System.out.println(sb.reverse());
    
        
    }
    
}
