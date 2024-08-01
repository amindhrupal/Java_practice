import java.util.Scanner;
public class exer2 {

    public static void sumOfOddNumbers(int a) {
       
        if(a<0) {
            System.out.println("invalid input");
        }
        int sum=0;
        for(int i=0; i<=a;i++) {
            if(i%2 !=0) {
                sum=sum+i;
              
          }

        }
          System.out.println(sum);
       
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
    
       sumOfOddNumbers(a);

        sc.close();
    }
}
