import java.util.Scanner;
public class fladd
{
    public static float a,b;
    static Scanner sc = new Scanner(System.in);

    public static void accept()
    {
        System.out.print("Enter a number: ");
        a = sc.nextFloat();
        System.out.print("\nEnter another number: ");
        b = sc.nextFloat();
    }


    public static void main(String args[])
    {
        double c;
        accept();
        c = a + b;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}


