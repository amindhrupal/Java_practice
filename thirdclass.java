import java.util.*;
public class thirdclass {
    public static void main(String args[]) {
        // for(int i=0;i<=3;i++) {
           
        //  System.out.println(i);
        // }

        // int a=0;
        // while(a<11) {
        //     System.out.println(a);
        //      a++;
        // }

        // int i=12;
        // do { 
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<11);
          
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a number");
           int n=sc.nextInt();

        // for(int i=1;i<=n;i++) {
        //     sum=sum+i;
        // }
       
        // System.out.println(sum);
        // sc.close();

        for(int i=1;i<11;i++) {
            System.out.println(n*i);
        }

        sc.close();
    }
}
