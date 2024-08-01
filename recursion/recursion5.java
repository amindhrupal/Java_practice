package recursion;

public class recursion5 {
     //print x^n where (((((stack height=n))))

    public static int calcPower(int x,int n) {
        if(n==0) {
            return 1;  //base case 1
        }

        if(x==0) {
            return 0;  //base case 2
        }
        int xPownm1=calcPower(x, n-1);  //kam
        int xPown=x*xPownm1;

       return xPown;
    }
   
     

    public static void main(String[]args) {
         int x=2,n=5;

         int ans=calcPower(x, n);
         System.out.println(ans);
    }



    
}
