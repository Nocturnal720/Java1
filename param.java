class param
{
    void modifyval(int x)
    {
        x = x + 10;
    }

    public static void main(String args[])
    {
        int a = 5;
        param obj = new param();
        obj.modifyval(a);
        System.out.println("a = " + a);

    }
}