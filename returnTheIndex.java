import java.util.Scanner;

public class returnTheIndex {

    public static int returnIndex(int[] arr, int n,int k) {
         int start= 0;
         int end=n;

         while(start<=end) {
            int mid=(start+end)/2;

            if(k==arr[mid]) {
                return mid;
            }

            else if(k<arr[mid]) {
                 end=mid-1;
            }

            else {
                start=mid+1;
            }
         }
         return end+1;

    }
    public static void main(String args[]) {

        int arr[]={2,4,5,8,9};

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int k=sc.nextInt();
        int n=arr.length;

        System.out.println(returnIndex(arr,n,k));
    sc.close();
        
    }
}