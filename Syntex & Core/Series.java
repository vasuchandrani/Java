public class Series 
{
    static int squ_sum(int n)
    {
        if (n==1)
            return 1;
        else 
            return (n*n)+squ_sum(n-1);
    }
    public static void main(String[] args) 
    {
        int x= squ_sum(8);
        System.out.println(x);
    }
}
