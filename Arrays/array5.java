import java.util.Arrays;

public class array5 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,34,11,25};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
        reverse(arr,0,5);
    }

    static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
 }


    public static int max(int[]arr){
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
        }
    }
    return maxVal;
}

    public static int maxRange(int[] arr, int start, int end){
        int maxValue=arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    public static void reverse(int []arr , int start,int end){
        while(start<end){
            //swap
            swap(arr, start, end);
            start++; end--;
        }
        System.out.println(Arrays.toString(arr)+"   reversed array");
    }
}
