
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class temp5 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        FileInputStream fis = new FileInputStream(fileName);

        int size = fis.available();

        for(int i=0; i<size; i++) {
            System.out.print((char)fis.read());
        }
    }
}
