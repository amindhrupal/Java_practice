public class mergesort {
    //nlogn
    public static void conquer(int arr[], int mid, int si, int ei) {
         int merged[]= new int[ei-si+1];

         int index1=si;
         int index2=mid+1;
         int indexmerged=0;

         while(index1<=mid && index2<=ei) {
               if(arr[index1]<=arr[index2]) {
                merged[indexmerged++]= arr[index1++];
                 
               }  else {
                   merged[indexmerged++]=arr[index2++];

               }
         }
        //while loop linear TC O(n)
         while(index1<=mid) {
            merged[indexmerged++]= arr[index1++];
         }
         while(index2<=ei) {
            merged[indexmerged++]=arr[index2++];
         }

         for(int i=0,j=si;i<merged.length;i++,j++) {
               arr[j]=merged[i];
                 
         }
    }
    public static void divide(int arr[], int si,int ei) {
         //log(n)
        if(si>=ei) {
            return;
        }

        int mid= si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        
        conquer(arr,mid,si,ei);
    }
     public static void main(String args[]) {
         int arr[]={6,3,9,5,2,8};
         int n=arr.length;

         divide(arr, 0, n-1);
         for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
         }
         System.out.println();


     }
}
