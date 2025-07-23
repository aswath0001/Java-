

public class Parameters {
    void add(int a ,int b) {
      System.out.println(a+b);
    }
    void sub (int a,int b){
        System.out.println(a-b);
    }
    void mul (int a, int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        Parameters ob1 = new Parameters();
        ob1.add(12,32 );
                ob1.sub(12,32 );
        ob1.mul(12,32 );
        ob1.div(12,32 );

    }
}
