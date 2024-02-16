// this is a program for the use of the throws exception syntax in java
class Demo
{
    
    public void a() throws Exception
    {
        b();
    }
    public void b() throws Exception
    {
        int num1 = 8;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class Exception1
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        try
        {
            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("Something went worng.....");
        }
    }
}