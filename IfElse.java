
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Mark = scan.nextInt();
        if(Mark<=35){
            System.out.println("no gift");
        }else if (Mark>35 && Mark<60){
            System.err.println("video game");
        }else if(Mark>=60 && Mark <90){
          System.out.println("Laptop");
        }else{
            System.out.println("macbook");
        }
    }
}
