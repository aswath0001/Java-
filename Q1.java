import java.util.Scanner;

class Q1 {
public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    int age = scan.nextInt();
    scan.nextLine();
    String address = scan.nextLine();

    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = A*B*C;
    int E = A+B+C;

    double Mark = scan.nextInt();

    System.out.println("my name is "+ name +" and my age is "+ age + ". I am from "+ address);
    System.out.println("The multiple of the treee values are "+ D);
    System.out.println("The Addition of the treee values are "+ E);
    System.out.println("My mark is "+Mark/10 +"/10");
}
    
}