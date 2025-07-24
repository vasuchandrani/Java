interface Dev_sum 
{
    public int Dev_sum(int n);
}
public class Devisor_sum implements Dev_sum
{
    public int Dev_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Devisor_sum ds1= new Devisor_sum();
        int x=ds1.Dev_sum(8);
        System.out.println(x);
    }
}
