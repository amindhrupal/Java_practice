import java.util.*;


public class fifthclass {

    public static void printTheTable(int a) {
        for(int i=1;i<=10;i++) {
            System.out.println(i*a);
        }
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter one number");
        int a=sc.nextInt();
       
        printTheTable(a);

     
    sc.close();
    }
}
 