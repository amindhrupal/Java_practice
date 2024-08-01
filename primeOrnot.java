import java.util.Scanner;


public class primeOrnot {

    public static boolean isPrime(int n) {
                  
        if(n<=0) {
             return false;
        }

        for(int i=2;i<=n/2;i++) {
            if(i%n==0) {
                return false;
            }
        }

        return true;
    }
    
     public static void main(String args[]) {
             
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        if(isPrime(n)) {
            System.out.println("the given number " +n+ " is prime");
        }
        else {
              System.out.println("number is not prime");
        }

        


          sc.close();
     }

     
}
