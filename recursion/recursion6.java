package recursion;

public class recursion6 {
         // print x^n for stack height logn))

         //n even power x^n-> X^N/2 * X^N/2
         //n odd power x^n-> X^N/2 * X^N/2 * X

         public static int calcPower(int x,int n) {
            if(x==0) {
                return 0; //base case 1
            }
            if(n==0) {
                return 1;  //base case 3
            }

            if(n%2==0) {     //n is even
                return calcPower(x, n/2)*calcPower(x, n/2);
            }
            else {         //n is odd
                return calcPower(x, n/2)*calcPower(x, n/2)*x;

            }
         }

         public static void main(String[]args) {
            int x=2,n=5;

            int ans=calcPower(x, n);
            System.out.println(ans);
         }
         
}
