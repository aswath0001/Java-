import java.util.Scanner;

public class P1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String Megana = scan.nextLine();
        if(Megana.equals("dead"  )|| Megana.equals("Dead")){
            System.err.println("surya meets remya");
        }else{
            System.out.println("Surya weds megana");
        }
    }
}
