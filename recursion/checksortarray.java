package recursion;

public class checksortarray {
    //check if an array is sorted or not.. strictly increasing
    //1,2,3,4,5 yes.    1,2,3,3 no.  return type of function is boolean

    public static boolean isSorted(int arr[],int index) {
        //base case
        if(index==arr.length-1) {
            return true;
        }

        if(arr[index]>= arr[index+1]) {
            //array is unsorted 
           return false;
        }
        return isSorted(arr, index+1);
        
    }
    public static void main(String[]args) {
        int arr[]={1,3,4,6};
        System.out.println(isSorted(arr, 0));
    }


}
