class Animal
{
    void eat()
    {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal
{
    void eat()
    {
        super.eat();
        System.out.println("Dog Barks");
    }

}


public class Inherit
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.eat();  //using runtime polymorphism, the child class is able to override the eat function in the parent class
        
    }

}
