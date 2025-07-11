
import java.util.Scanner;

public class C1Q1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int Mark = scan.nextInt();
        if(Mark>=35){
            System.out.println("Pass");
        }else{
            System.err.println("Fail");
        }
    }
}
