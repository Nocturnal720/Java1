class Demo
{
    Demo()
    {
        this("Default constructor"); //calls parameterized constructor
    }

    Demo(String message)
    {
        System.out.println(message);
    }
}

public class call
{
    public static void main(String[] args) 
    {
        new Demo();
        
    }
}