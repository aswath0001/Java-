import java.util.Scanner;

public class C2Q2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int Mark_A = scan.nextInt();
        int Mark_B = scan.nextInt();
        int Mark_C = scan.nextInt();
        int Mark_D = scan.nextInt();
        int Mark_E = scan.nextInt();
        int Average = (Mark_A+Mark_B+Mark_C+Mark_D+Mark_E)/5;
        if(Average<35){
            System.err.println("extra class");
        }else{
            System.err.println("no extra class");
        }
    }
}
