import java.util.Scanner;
public class diff
{
    
    public static void op(int a)
    {
       System.out.println("Negation of first number: " + (-1*a)); 
    }

    public static void op(int a, int b)
    {
        System.out.println("Addition of 2 numbers: " + (a+b));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first num: ");
        a = sc.nextInt();
        System.out.print("Enter second num: ");
        b = sc.nextInt();
        op(a);
        op(a,b);
    }
}