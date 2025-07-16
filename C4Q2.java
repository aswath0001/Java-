
import java.util.Scanner;

public class C4Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Mark [] = new int[10];
        for(int i = 0;i<=9;i++){
            Mark[i] = scan.nextInt();
        }
        for(int i = 0;i<=9;i++){
            System.out.println("Marks:"+Mark[i]);
        }
    }
}
