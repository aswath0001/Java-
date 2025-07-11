import java.util.Scanner;

public class C1Q3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int A = scan.nextInt();
      
        if(A % 3==0 && A% 5==0){
           System.err.println("Divisible by 3 and 5");
        }else{
             System.err.println("not Divisible by 3 and 5");
        }
     
    }
}
