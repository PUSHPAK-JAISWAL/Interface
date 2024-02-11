// this is demo for Annonymous inner class
interface Car
{
    void drive();
}

public class AICDemo
{
    public static void main(String args[])
    {
        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}