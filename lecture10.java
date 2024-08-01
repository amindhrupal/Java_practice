import java.util.*;

public class lecture10 {
     public static void main(String args[]) {

     
    // int[] marks=new int[3];
    // marks[0]=35;
    // marks[2]=30;
    // marks[1]=33;

    // int marks[] = {44,24,54};
 
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    int marks[] = new int[size];


    for(int i=0;i<size;i++) {
        marks[i]= sc.nextInt();

    }

    for(int i=0;i<size;i++) {
        System.out.print(marks[i]);
    }
    
    sc.close(); 
}
}
