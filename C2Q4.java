import java.util.Scanner;

public class C2Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Age = scan.nextInt();
        int Salary = scan.nextInt();
       
        if(Salary>=20000 || Age<=25){
            System.out.print("Required Loan amount:");
          int Loan_Amount= scan.nextInt();
          if(Loan_Amount<=50000){
            System.out.println("you are eligible for loan");
          }else if(Loan_Amount>50000){
            System.out.println("maximum loan amount is 50000");
          }
        }else{
            System.err.println("No Loan");
        }
    }
}
