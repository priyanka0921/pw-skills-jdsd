enum Result {
  PASS,
  FAIL,
  NR,
}

public class P_06 {

  public static void main(String[] args) {
    Result res = Result.PASS;

    switch (res) {
      case PASS: System.out.println("pass --->");
        break;
      case FAIL: System.out.println("fail --->");
        break;
      case NR: System.out.println("no result --->");
        break;
      default: System.out.println("error --->");
        break;
    }
  }
}






