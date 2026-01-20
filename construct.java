class Student
{
    String name;
    int age;
    static int count = 0;

    Student(String n, int a)
    {
        name = n;
        age = a;
        System.out.println("No. of students: " + count++);
    }




    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("\n\n");
    }
}



public class construct
{
    public static void main(String args[])
    {
        Student P1 = new Student("Rohan", 19);
        P1.display();
        Student P2 = new Student("Amit", 21);
        P2.display();
        Student P3 = new Student("Shantanu", 20);
        P3.display();
        System.out.println("Total students = " + Student.count);
    }   
}