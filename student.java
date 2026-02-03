class Student
{
    String name;
    char div;
    long roll;
    Student(String n, char d, long r)
    {
        name = n;
        div = d;
        roll = r;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Division: " + div);
        System.out.println("Roll no.: " + roll);
    }


    public static void main(String[] args) 
    {
        Student s1 = new Student("Rohan",'A', 158);
        Student s2 = new Student("Reinhard",'B', 155);
        Student s3 = new Student("Rohit",'A', 159);

        s1.display();
        s2.display();
        s3.display();
    }
    
}


    
