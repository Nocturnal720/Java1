class Parent
{
    final void display()
    {
        System.out.println("Final Method in parent class");
    }
}

class Child extends Parent
{
    //void display() would produce an error as a FINAL display function is already present through parent class   
}

public class finalmet
{
    public static void main(String args[])
    {
        Child c = new Child();
        c.display();
    }
}
