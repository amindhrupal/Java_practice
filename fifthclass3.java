import java.util.Scanner;
public class fifthclass3 {


    public static boolean isPrime(int a) {
        if(a<=1) {
            return false;
        }

        for(int i=2;i<=a/2;i++) {
            if((a%i)==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();


     if(isPrime(a)) {
        System.out.println("prime it is");
     }

     else {
        System.out.println("is not prime");
     }

       sc.close();
    }
    
}
