public class Question_05 {

  // Number of lines for the alphabet's pattern
  static int height = 5;

  // Number of character width in each line
  static int width = (2 * height) - 1;

  // Function to print the pattern of 'A'
  static void printA() {
    int n = width / 2, i, j;
    for (i = 0; i < height; i++) {
      for (j = 0; j <= width; j++) {
        if (
          j == n ||
          j == (width - n) ||
          (i == height / 2 && j > n && j < (width - n))
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
      n--;
    }
  }

  // Function to print the pattern of 'D'
  static void printD() {
    int i, j;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j < height; j++) {
        if ((i == 0 || i == height - 1) && j < height - 1) System.out.printf(
          "*"
        ); else if (
          j == height - 1 && i != 0 && i != height - 1
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'H'
  static void printH() {
    int i, j;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j < height; j++) {
        if ((j == height - 1) || (i == height / 2)) System.out.printf(
          "*"
        ); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'L'
  static void printL() {
    int i, j;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j <= height; j++) {
        if (i == height - 1) System.out.printf("*"); else System.out.printf(
          " "
        );
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'R'
  static void printR() {
    int i, j, half = (height / 2);
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j < width; j++) {
        if ((i == 0 || i == half) && j < (width - 2)) System.out.printf(
          "*"
        ); else if (
          j == (width - 2) && !(i == 0 || i == half)
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'T'
  static void printT() {
    int i, j;
    for (i = 0; i < height; i++) {
      for (j = 0; j < height; j++) {
        if (i == 0) System.out.printf("*"); else if (
          j == height / 2
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'U'
  static void printU() {
    int i, j;
    for (i = 0; i < height; i++) {
      if (i != 0 && i != height - 1) System.out.printf(
        "*"
      ); else System.out.printf(" ");
      for (j = 0; j < height; j++) {
        if (((i == height - 1) && j >= 0 && j < height - 1)) System.out.printf(
          "*"
        ); else if (
          j == height - 1 && i != 0 && i != height - 1
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  public static void main(String[] args) {
    printR();
    printA();
    printH();
    printU();
    printL();
    System.out.println();
    printD();
    printU();
    printT();
    printT();
    printA();
  }
}
