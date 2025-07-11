import java.util.Scanner;

public class C1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Income = scan.nextInt();
        if(Income>=7000){
            System.err.println("Scholership available");
        }else{
            System.err.println("Scholership not available");
        }
    }
}
