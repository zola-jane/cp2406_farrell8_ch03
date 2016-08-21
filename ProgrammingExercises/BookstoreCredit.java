/*
 * Created by Zola on 15/08/2016.
 */
import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = input.nextLine();
        System.out.println("Enter your gpa:");
        gpa = input.nextDouble();
        computeCredit(name, gpa);
    }

    public static void computeCredit(String name, double gpa)
    {
        final int MULTIPLE = 10;
        double credit = gpa * MULTIPLE;
        System.out.println("Hello " + name + ", your total credit is $" + credit + ".");

    }
}
