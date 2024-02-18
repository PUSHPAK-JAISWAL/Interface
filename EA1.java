// this is a program to show exception handling in java
import java.util.*;
public class EA1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number to divide each other by.");
        int a = sc.nextInt();
        int b =sc.nextInt();
        try
        {
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException Arith)
        {
            System.out.println("Cannot divide by Zero.");
            System.out.println("Enter a Valid Number.");
        }
        finally
        {
            sc.close();
        }
    }
}