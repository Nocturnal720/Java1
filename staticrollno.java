class rollcall
{
    static String rollPrefix = "24070122"; 
    int rollCounter;
    String name;

    rollcall(String name, int rollCounter) 
    {
        this.name = name;
        this.rollCounter = rollCounter;
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollPrefix + rollCounter);
        System.out.println();
    }

    public static void main(String[] args) 
    {
        rollcall s1 = new rollcall("Rohan", 158);
        rollcall s2 = new rollcall("Reinhard", 155);
        rollcall s3 = new rollcall("Rohit", 159);

        s1.display();
        s2.display();
        s3.display();
    }
}
