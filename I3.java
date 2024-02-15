// this is the class to show the use of try catch and first program int the usage of error
import java.util.*;
public class I3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to divid by each other.");
        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int result = 0;
        try
        {
           result = num1 / num2;
           System.out.println("In try block");
        }
        catch(Exception obj)
        {
            System.out.println("Something went worng.");
        }
        System.out.println(result);
        System.out.println("Bye.");

    }
}