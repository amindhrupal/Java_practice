import java.util.*;
public class lectureten2 {
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
  
        int[] numbers= new int[size];

        for(int i=0;i<size;i++) {
            numbers[i]=sc.nextInt();
        }

        System.out.println("enter the number you want to search");
        int x=sc.nextInt();

        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==x) {
                System.out.println("x found at " + i);
            }
        }
  
sc.close();
    }
}
