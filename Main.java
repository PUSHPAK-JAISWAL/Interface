interface  Computer
{
   void compileCode();
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got five errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got five errors, faster");
    }
}

class Developer
{
    public void buildApp(Computer Com)
    {
        System.out.println("Building app");
        Com.compileCode();
    }
}


public class Main
{
    public static void main(String args[])
    {
        //Laptop L = new Laptop();
        //Desktop Desk = new Desktop();
        Computer Com = new Desktop();
        Developer D = new Developer();
        D.buildApp(Com);
    }
}