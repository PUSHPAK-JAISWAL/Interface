interface App
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}
class b implements App
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8
{
    public static void main(String args[])
    {
        App.abc();
        App obj = new b();
        obj.show();
        obj.config();
    }
}