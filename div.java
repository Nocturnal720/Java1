import java.util.Scanner;
public class div
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first num: ");
        double a = sc.nextInt();
        System.out.print("Please enter second num: ");
        double b = sc.nextInt();
        if(b == 0)
        {
            System.out.println("Divide by zero!");
            System.exit(0);
        }
        double c = a/b;
        System.out.println("Ans: " + c);
    }
}