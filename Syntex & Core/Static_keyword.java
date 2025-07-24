public class Static_keyword
{
    static int a=10;
    static int n;
    int b=5;
    final int c=37;
    static
    {
        a=60;
    }
    Static_keyword(int n)
    {
        System.out.println(a+"   "+b+"   "+c+"   "+n);
    }
    public static void main(String[] args) 
    {
        Static_keyword obj = new Static_keyword(15);
    }
}
