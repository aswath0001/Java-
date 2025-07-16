
import java.util.Arrays;
import java.util.Scanner;

public class C4Q1{
    public static void main(String[] args) {
        int [] mark = new int[5];
        Scanner scan =  new Scanner(System.in);
        for(int i = 0; i<5; i++){
            mark[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(mark));
    }
}
