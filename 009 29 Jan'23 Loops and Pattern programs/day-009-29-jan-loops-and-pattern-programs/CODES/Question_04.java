public class Question_04 {

  // Number of lines for the alphabet's pattern
static int height = 5;
 
// Number of character width in each line
static int width = (2 * height) - 1;

// Function to find the absolute value
// of a number D
static int abs(int d)
{
    return d < 0 ? -1 * d : d;
}

  // Function to print the pattern of 'P'
  static void printP() {
    int i, j;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j < height; j++) {
        if ((i == 0 || i == height / 2) && j < height - 1) System.out.printf(
          "*"
        ); else if (
          i < height / 2 && j == height - 1 && i != 0
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'W'
  static void printW() {
    int i, j, counter = height / 2;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j <= height; j++) {
        if (j == height) System.out.printf("*"); else if (
          (i >= height / 2) && (j == counter || j == height - counter - 1)
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      if (i >= height / 2) {
        counter++;
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'S'
  static void printS() {
    int i, j;
    for (i = 0; i < height; i++) {
      for (j = 0; j < height; j++) {
        if ((i == 0 || i == height / 2 || i == height - 1)) System.out.printf(
          "*"
        ); else if (i < height / 2 && j == 0) System.out.printf("*"); else if (
          i > height / 2 && j == height - 1
        ) System.out.printf("*"); else System.out.printf(" ");
      }
      System.out.printf("\n");
    }
  }

  // Function to print the pattern of 'K'
  static void printK() {
    int i, j, half = height / 2, dummy = half;
    for (i = 0; i < height; i++) {
      System.out.printf("*");
      for (j = 0; j <= half; j++) {
        if (j == abs(dummy)) System.out.printf("*"); else System.out.printf(
          " "
        );
      }
      System.out.printf("\n");
      dummy--;
    }
  }

  // Function to print the pattern of 'I'
  static void printI() {
    int i, j;
    for (i = 0; i < height; i++) {
      for (j = 0; j < height; j++) {
        if (i == 0 || i == height - 1) System.out.printf("*"); else if (
          j == height / 2
        ) System.out.printf("*"); else System.out.printf(" ");
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


  public static void main(String[] args) {
    printP();
    printW();
    System.out.println();
    printS();
    printK();
    printI();
    printL();
    printL();
    printS();
  }
}
