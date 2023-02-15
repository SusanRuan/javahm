// Write a program that declares two integer variables, x, and y, and
// assigns 5 to x and 6 to y. Declare a variable q and assign y/x to it and
// print q. Now, cast y to a double and assign it to q. Print q again.


public class Main2 {
  public static void main(String[] args) {
      int x = 5;
      int y = 6;
      int q = y / x;
      System.out.println("q = " + q);
      
      double d = (double) y;
      q = (int) (d / x);
      System.out.println("q = " + q);
  }
}

