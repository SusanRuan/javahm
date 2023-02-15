// Write a program that declares 2 integer variables, assigns an integer to
// each, and divides the larger number by the smaller number. Assign the
// result to a variable. Print out the result. Now change the larger number
// to a decimal. What happens? What corrections are needed?

public class Main {
  public static void main(String[] args) {
      int num1 = 10;
      int num2 = 5;
      int result;

      if (num1 > num2) {
          result = num1 / num2;
      } else {
          result = num2 / num1;
      }

      System.out.println("Result: " + result);

      // Change the larger number to a decimal
      // num1 = 10.0; // Compilation error: Type mismatch: cannot convert from double to int

      // What happens? What corrections are needed?
      // A compilation error occurs because an integer variable cannot hold a decimal value.
      // We need to change the data type of num1 to double to hold a decimal value.

      double decimalNum1 = 10.0;

      if (decimalNum1 > num2) {
          result = (int)(decimalNum1 / num2);
      } else {
          result = (int)(num2 / decimalNum1);
      }

      System.out.println("Result: " + result);
  }
}

