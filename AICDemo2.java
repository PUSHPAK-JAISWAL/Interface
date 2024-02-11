
@FunctionalInterface
interface Car
{
    void drive(int avg , int ts , int fuel);
}

public class AICDemo2
{
    public static void main(String []args)
    {
        Car obj = (avg,ts,fuel) -> 
        {
            System.out.println("Driving... " + avg+ " "+ts+" "+fuel);
        };
        obj.drive(18,240,4);
    }
}