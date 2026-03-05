import java.util.Scanner;

public class exp3_Matrix {

    public static void addMat(int mat1[][], int mat2[][], int mat3[][]) {
        int n = mat1.length;
        int m = mat1[0].length;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Addition of Matries :");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void multiMat(int mat1[][], int mat2[][], int mat3[][])  {
        int n = mat1.length;    //matrix-1 rows
        int m = mat2[0].length;  //matrix-2 cols

        int common = mat1[0].length;    //multiplication conditon (common size)

        for (int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int ans = 0;
                 
                for (int k=0; k<common; k++) {
                    ans += mat1[i][k] * mat2[k][j]; 
                }
                mat3[i][j] = ans;   // new matrix-3 -> i x j -> n x m 
            }
        }

        System.out.println("Multiplication of Matries: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of matrix");
        System.out.print("1-> ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.print("2-> ");
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();

        int mat1[][] = new int[n1][m1];
        System.out.println("enter matrix - 1");
        for (int i=0; i<n1; i++) {
            for (int j=0; j<m1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        int mat2[][] = new int[n2][m2];
        System.out.println("enter matrix - 2");
        for (int i=0; i<n2; i++) {
            for (int j=0; j<m2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        if (n1 == n2 && m1 == m2) {
            int mat3[][] = new int[n1][m2];
            addMat(mat1, mat2, mat3);
        } else {
            System.out.println("Sum is not possible");
            System.out.println();
        }

        if (m1 == n2) {
            int mat3[][] = new int[n1][m2];
            multiMat(mat1, mat2, mat3);
        } else {
            System.out.println("Multiplication is not possible");
            System.out.println();
        }   
    }
}
