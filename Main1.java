// Write a program that declares 2 double variables, assigns a number to
// each, and divides the larger by the smaller. Assign the result to a
// variable. Print out the result. Now, cast the result to an integer. Print out
// the result again.

public class Main1 {
  public static void main(String[] args) {
      double num1 = 3.14;
      double num2 = 2.0;
      double result;

      if (num1 > num2) {
          result = num1 / num2;
      } else {
          result = num2 / num1;
      }

      System.out.println("Result: " + result);

      int intResult = (int)result;
      System.out.println("Integer result: " + intResult);
  }
}

