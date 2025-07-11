import java.util.Scanner;

public class C2Q1 {
   public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in);
    int Score = scan.nextInt();
    if(Score <50){
        System.out.println(" improve");
    }else if(Score>=50 && Score<70){
        System.err.println("good job");
    }else{
        System.out.println("Excelent");
    }
   } 
}
