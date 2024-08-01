import java.util.*;
public class lectureel2 {
    public static void main(String args[]) {
       
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int cols= sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("letss search the number");
        int x=sc.nextInt();

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++)  {

                if(matrix[i][j]==x) {
                    System.out.println("x found at location ("+i+","+j+")");
                }
                
            }
        }



        sc.close();

    }
}
