/*
 * Created by Zola on 15/08/2016.
 */
import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        displayTwiceTheNumber(a);
        displayNumberPlusFive(a);
        displayNumberSquared(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(b);
        displayNumberSquared(b);
    }

    public static void displayTwiceTheNumber(int num)
    {
        System.out.println("" + (num * 2));
    }

    public static void displayNumberPlusFive(int num)
    {
        System.out.println("" + (num + 5));
    }

    public static void displayNumberSquared(int num)
    {
        System.out.println("" + (num * num));
    }
}
