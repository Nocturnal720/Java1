import java.util.Scanner;
public class details
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name;
        long rollno;
        String address;
        System.out.print("Please enter your name: ");
        name = sc.nextLine();
        System.out.print("\nPlease enter your roll_no: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("\nPlease enter your address: ");
        address = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll_no: " + rollno);
        System.out.println("Address: " + address);
    }
}