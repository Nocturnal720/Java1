class Student
{
    String name;

    Student(String name)
    {
        this.name = name; //this keyword used to refer to the instance variable outside the class
    }                     //By defualt name inside the function refers to the parameter name
                          //this keyword can be used with methods, but is not used because runtime polymorphism is already a feature
    void display()
    {
        System.out.println("Name: " + this.name);
    }


}       

public class keyword
{
    public static void main(String args[])
    {
        Student s = new Student("Alice");
        s.display();
    }

}

