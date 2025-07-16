
import java.util.Scanner;

public class C4Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Table  =  scan.nextInt();
        for(int i =1; i<=10;i++){
            System.out.println(i +"*"+Table+ "="+i*Table);
        }
    }
}
