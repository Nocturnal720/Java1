class Student
{
    String name;
    int age;
}



public class instancevar
{
    public static void main(String args[])
    {
        Student P1 = new Student();
        P1.name = "Rohan";
        P1.age = 19;
        System.out.println("Name: " + P1.name);
        System.out.println("Id: " + P1.age);
        System.out.println("\n");

        Student P2 = new Student();
        P2.name = "Amit";
        P2.age = 21;
        System.out.println("Name: " + P2.name);
        System.out.println("Id: " + P2.age);
        System.out.println("\n");

        Student P3 = new Student();
        P3.name = "Shantanu";
        P3.age = 20;
        System.out.println("Name: " + P3.name);
        System.out.println("Id: " + P3.age);
        System.out.println("\n");

    }   
}