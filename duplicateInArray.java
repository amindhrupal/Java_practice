 import java.util.*;

public class duplicateInArray {

    public static int findDuplicate(int arr[]) {
               Arrays.sort(arr);
               int n=arr.length;

              for(int i=0;i<n-1;i++) {
               if(arr[i]==arr[i+1]) {
                return arr[i];
               }
            }
            return 0;

            }

        
            
     public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
         int arr[]= new int[5];
         
         for(int i=0;i<5;i++) {
          arr[i]=sc.nextInt();
         }
          System.out.println("duplicate number is "+findDuplicate(arr));
          sc.close();
    }


}
