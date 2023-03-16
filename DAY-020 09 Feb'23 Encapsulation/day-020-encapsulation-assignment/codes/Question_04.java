public class Question_04 {
  int x;
  public void main(int x) {
    this.x = x;
  }

  public static void main(String[] args) {
    Question_04 myObj = new Question_04();
    myObj.main(5);
    System.out.println("Value of x = " + myObj.x);
  }
}
