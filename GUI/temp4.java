// D:\\VAsu\\javaFile.txt
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class temp4 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        File f = new File(str);
        f.createNewFile();
    }
}
