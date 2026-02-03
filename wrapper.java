class wrapper
{
    public static void main(String args[])
    {
        int i =3;
        double d = 2.4;
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        Integer i1 = Integer.valueOf(i);
        Double d1 = Double.valueOf(d);
        System.out.println("Integer: " + i1);
        System.out.println("Double: " + d1);
        String str1 = "123";
        String str2 = "345";
        System.out.println("Answer: " + (str1+str2));
        int s1 = Integer.parseInt(str1);
        int s2 = Integer.parseInt(str2);
        System.out.println("Answer: " + (s1+s2));
    }
}