import java.util.Scanner;

public class MilesPerGallon {

  public static void main(String[] args) {
    //TODO Auto-generated method stub
    Scanner keyboard = new Scanner (System.in);
    System.out.println("How many miles were driven?");
    double miles = keyboard.nextDouble();
    System.out.println("How many gallons of gas was used?");
    double gallons = keyboard.nextDouble();
    keyboard.close();
    double MPG = miles / gallons;
    System.out.println(miles);
    System.out.println(" miles times");
    System.out.println(gallons);
    System.out.println(" gallons =");
    System.out.println(" mpg");
  }
}

\* Sample Output:
How many miles were driven?
125
How many gallons of gas was used?
4
125.0
 miles times
4.0
 gallons =
31.25
 mpg */
