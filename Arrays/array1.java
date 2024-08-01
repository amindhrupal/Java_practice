import java.util.*;
public class array1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int[][] arr= new int[3][3];
        // int[][] arr={
        //     {7,8,11},     //0th index
        //     {9,0},        //1st index
        //     {1,2,3,5}     //2nd index arr2D[2]={1,2,3,5}
;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }

        }
        System.out.println("-----------------");
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");

        //     }
        //     System.out.println();
        
            
        // }

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        

        System.out.println(arr.length+" is the length of array");
        in.close();

    }
}