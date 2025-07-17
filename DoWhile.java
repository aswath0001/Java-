
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
         Scanner scan =  new Scanner(System.in);
         int input ;
         do{
            System.out.print("enter number less than 10 :");
      input =  scan.nextInt();
         } while(input >10);
         
    }
   
}
