final class Final
{
    void display()
    {
        System.out.println("This is a final class");
    }
}

//class SubClass extends FinalClass would cause an error as the parent class in final

public class finalclass
{
    public static void main(String[] args) 
    {
        Final obj = new Final();
        obj.display();
        
    }
}