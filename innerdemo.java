// inner class = member, static and Annonymous
class A
{
    int age;
    String name;
    public void show()
    {
        System.out.println("in show");
    }
    class B // this is inner member class
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
    static class C // this is inner static class
    {
        public void print()
        {
            System.out.println("in print");
        }
    }
}

public class innerdemo
{
    public static void main(String args[])
    {
        A obj = new A();
        A.B obj1 = obj.new B();// this declaration is for member inner class
        A.C obj2 = new A.C();// this is declartion is for static class
        obj.show();
        obj1.display();
        obj2.print();
    }
}