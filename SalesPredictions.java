\* This program calculates total profit based on a total sales value
and the percentage of sales the annual profit is */
  
import java.util.Scanner;

public class SalesPredictions {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner keyboard = new Scanner (System.in);
    System.out.println("What is the total sales value?");
    double dollars = keyboard.nextDouble();
    System.out.println("What percentage of sales is the annual profit?");
    double percentofSales = keyboard.nextDouble();
    keyboard.close();
    double totalprofit = dollars * percentofSales;
    System.out.println(dollars);
    System.out.println(" dollars in sales =");
    System.out.println(totalprofit);
    System.out.println(" total profit");
  }
}

\* Sample Output:
What is the total sales value?
15000
What percentage of sales is the annual profit?

0.13
15000.0
 dollars in sales =
1950.0
 total profit */
