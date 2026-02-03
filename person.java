class person
{
    String name;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("\n");
    }

    public static void main(String[] args) 
    {
        person p = new person();
        p.display(); 
        p.name = "Rohan";
        

        person q = new person();
        q.name = "Rohit";
        q.display();

        person r = new person();
        r.name = "Reinhard";
        r.display();        
    }
}