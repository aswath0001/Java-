import java.util.Scanner;

public class Loop {
    public static void main(String args []){
         Scanner scan = new Scanner(System.in);
         String A = scan.nextLine();
         char B = A.charAt(0);
         Boolean Rain = false;
         if(B == 'Y' || B=='y'){
           Rain = true;
         }
         if(Rain){
            System.err.println("Its raining");
         }
         else{
            System.out.println("no rain");
         }
    }
}
