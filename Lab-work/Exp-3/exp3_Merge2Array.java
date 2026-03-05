import java.util.Arrays;
import java.util.Scanner;

public class exp3_Merge2Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array");
        int n1 = sc.nextInt();

        System.out.println("Enter size of second array");
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        System.out.println("Enter first array");
        for (int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array");
        for (int i=0; i<n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int ans[] = new int[n1 + n2];
        int idx = 0;
        for (int i=0; i<(n1+n2); i++) {
            if (i < n1)
                ans[idx] = arr1[i];
            else {
                ans[idx] = arr2[i - n1];
            }    
            idx++;
        }
        
        Arrays.sort(ans);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
