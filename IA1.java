// this is a class to show the implimentation of inteface and its method modifiers
interface A1
{
    public abstract void show();// this is now important to write public and abstract
    // because by default the method in interface are public and abstract;
}
class A implements A1
{
    public void show()
    {
        System.out.println("In Show");
    }
}
public class IA1
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
    }
}