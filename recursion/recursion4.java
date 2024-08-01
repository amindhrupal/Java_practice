package recursion;

public class recursion4 {
    //print fibonacci series

    //given, 1st=0; 2nd=1;
    //kaam-> c=a+b;
    //basecase-> nth term

    public static void fibonacciseries(int a,int b,int n) {
        if(n==0) 
        return;

        int c=a+b;
        System.out.println(c);

       fibonacciseries(b, c, n-1);
                   
    }

    public static void main(String[]args) {
        int a=0,b=1;

        System.out.println(a);
        System.out.println(b);
        int n=5;
        fibonacciseries(a, b, n-2);
    }
    
}
