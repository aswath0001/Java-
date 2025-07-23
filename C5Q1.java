
import java.util.Scanner;

public class C5Q1 {
    void evenorOdd(int a){
     if(a%2==0){
      System.out.println("even");
     }else {
        System.out.println("odd");
     }
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int number = scan.nextInt();
        C5Q1 obj = new C5Q1();
        obj.evenorOdd(number);
    }
}
