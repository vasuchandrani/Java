import java.util.*;
class Array 
{
    public static void main(String args[])
    {
        int arr[]={1,1,2,2,2,2,2,3,3};
        int count=0;
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        for(int i=0;i<9;i++)
        {
            if(arr[i]==x)
                count++;
        }
        System.out.println(x+ " repeated  "+ count + "  times ");
    }
}