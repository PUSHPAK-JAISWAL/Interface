// this the second program of exception
import java.util.*;
public class I4
{
    public static void main(String args[])
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            num = sc.nextInt();
        } 
        catch(InputMismatchException obj)
        {
            System.out.println("The input should be int value or number value.");
        }
        finally
        {
            sc.close();
            System.out.println("Resource Close.");
        }
        System.out.println(num);
    }
}