import java.util.Scanner;
public class exer3 {

    public static int greaterNumber(int m,int n) {
        if(m>n) {
            return m;
        }
        else {
            return n;
        }
       
    }


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println("greater number " + greaterNumber(m, n));


    sc.close();
    }
}
