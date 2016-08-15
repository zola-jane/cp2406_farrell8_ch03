/*
 * Created by Zola on 15/08/2016.
 */
public class Percentages
{
    public static void main(String[] args)
    {
        double a, b;
        a = 2.0;
        b = 5.0;
        computerPercent(a,b);
    }

    public static void computerPercent(double a, double b)
    {
        double percent = a / b;
        System.out.println(a + " is " + (percent * 100) + " percent of " + b);
    }
}
