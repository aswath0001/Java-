
import java.util.Scanner;

class Add {
    Scanner scan = new Scanner(System.in);
    int Apple = scan.nextInt();
    int Quantity = scan.nextInt();
     void price(){
        System.out.println("total:"+Apple *Quantity);
    }
    public static void main(String[] args) {
        Add ob1 = new Add();
        ob1.price();
    }
}