



public class binarysearch {

    public static int binarySearch(int arr[],int target) {
          int left=0;
          int right=arr.length-1;

          while(left<=right) {
            int mid=left+(right-left)/2;

            if(arr[mid]==target) {
                return mid;
            }

            else if(arr[mid]<target) {
                return mid+1;
            }

            else {
                return mid-1;
            }
          }
          return -1;
    }
     public static void main(String args[]) {
        int arr[]={2,23,30,55,61};
        int target=55;
        int result=binarySearch(arr,target);

        if(result!=-1) {
            System.out.println("target at "+ result+ " ");
        }
        else {
            System.out.println("not found");
        }
     }
}
