/*
 * Created by Zola on 15/08/2016.
 */
import java.util.Scanner;
public class Percentages2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a, b;
        a = input.nextDouble();
        b = input.nextDouble();
        computerPercent(a,b);
    }

    public static void computerPercent(double a, double b)
    {
        double percent = a / b;
        System.out.println(a + " is " + (percent * 100) + " percent of " + b);
    }
}
