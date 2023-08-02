\* This is a simple program that calculates total distance over 6, 10, and 15 hr
increments based on a constant speed of 58 mph. Such program could be edited
account for different speeds and hour increments. */

import java.util.Scanner;

public class DistanceTraveled {

  public static void main(String[] args) {
    //TODO Auto-generated method stub
    System.out.println("A vehicle traveling at a constant speed of 58 mph results in what distance?");
    double speed = 58;
    double timehours1 = 6;
    double timehours2 = 10;
    double timehours3 = 15;
    double distance1 = speed * timehours1;
    double distance2 = speed * timehours2;
    double distance3 = speed * timehours3;
    System.out.println(speed);
    System.out.println(" mph in 6 hrs=");
    System.out.println(" distance1");
    System.out.println(" miles traveled");
    System.out.println(speed);
    System.out.println(" mph in 10 hrs=");
    System.out.println(distance2);
    System.out.println(" miles traveled");
    System.out.println(speed);
    System.out.println(" mph in 15 hrs=");
    System.out.println(distance3);
    System.out.println(" miles traveled");
  }
}

\* Output:
A vehicle traveling at a constant speed of 58 mph results in what distance?
58.0
 mph in 6 hours=
348.0
 miles traveled
58.0
 mph in 10 hrs=
580.0
 miles traveled
58.0
 mph in 15 hrs=
870.0
 miles traveled */
