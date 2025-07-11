import java.util.Scanner;
public class C2Q3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    String Color = scan.nextLine();

    if (Color.equals("red")|| Color.equals("Red")){
      System.out.println("Stop");
    } else if(Color.equals("Yellow")|| Color.equals("Yellow")) {
        System.out.println("Ready");
    }else {
        System.out.println("Go");
    }

    }
    
}
