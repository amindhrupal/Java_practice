import java.util.Scanner;


public class exer4 {
    
    public static double circumferenceOfCircle(int n) {
        return 2*Math.PI*n;
    }
    public static void main(String args[]) {
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();

             System.out.println("circumference of circle is "+ circumferenceOfCircle(n));
    sc.close();
    }
}
