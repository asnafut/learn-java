public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    String[] cars = { "Volvo", "BMW", "Ford", "Mercedes" };
    for (String i : cars) {
      System.out.println(i);
    }

    for (int i = 0; i < 10; i++) {
      if (i != 4) {
        System.out.println(i);
      }
    }

    System.out.println("##############################################");

    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }

    myMethod("Marcel");
    myMethod("John");

    int[][] myImage = { { 1, 2, 3, 4 }, { 5, 6, 7, 2 } };

    int result = myMethod(3);
    System.out.println(result);
  }

  static void myMethod2() {
    System.out.println("I just got executed!");
  }

  static void myMethod(String fname) {
    System.out.println(fname + " Doe");
  }

  static int myMethod(int x) {
    return 5 + x;
  }
}
