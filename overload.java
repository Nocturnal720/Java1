class calculate
{
    void compute(int a, int b)
    {
        System.out.println("Sum = " + (a+b));
    }

    void compute(double a, double b)
    {
        System.out.println("Sum = " + (a+b));
    }

    void compute(int a, int b, int c)
    {
        System.out.println("Sum = " + (a+b+c));
    }
}

public class overload
{
    public static void main(String[] args) 
    {
        calculate obj = new calculate();
        obj.compute(10,20);
        obj.compute(10.5, 12.5);
        obj.compute(12,14,16);
        
    }
}