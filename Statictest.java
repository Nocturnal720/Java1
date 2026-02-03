class testing 
{
    static int a = 100;   
    int b = 50;           

    static void sMethod() 
    {
        System.out.println("Static method variables:");
        System.out.println("Static variable a = " + a);
        System.out.println();
    }


    void iMethod() 
    {
        System.out.println("Instance method varibles:");
        System.out.println("Static variable a = " + a);
        System.out.println("Instance variable b = " + b);
        System.out.println();
    }


    public static void main(String[] args) 
    {
        testing.sMethod();
        testing obj = new testing();
        obj.iMethod();
    }
}
