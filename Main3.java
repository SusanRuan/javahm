// Write a program that declares a named constant and uses it in a
//  calculation. Print the result.

public class Main3 {
  public static void main(String[] args) {
    final double PI = 3.14159; // Declares a named constant PI
    double radius = 5.0;
    double area = PI * radius * radius; // Uses PI in the calculation of area
    System.out.println("The area of the circle is: " + area); // Prints the result
  }
  
}
