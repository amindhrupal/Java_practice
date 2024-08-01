
public class searchInRange {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 12, 34, -5 };
        int target = 12;
        int ans = linearSearchIndex(arr, target, 0, 4);
        System.out.println(ans);
    }

    static int linearSearchIndex(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }

}
