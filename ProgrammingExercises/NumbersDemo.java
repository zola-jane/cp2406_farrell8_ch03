/*
 * Created by Zola on 15/08/2016.
 */
public class NumbersDemo
{
    public static void main(String[] args)
    {
        int a, b;
        a = 5;
        b = 8;
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
