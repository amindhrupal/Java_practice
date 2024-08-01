
public class linear_search {
    public static void main(String[] args) {

        int[] arr = { 34, 25, 50, 63, 31, 52, -13 };
        int target = -13;
        int ans = linearSearchIndex(arr, target);
        System.out.println(ans);

        boolean ans2 = linearSearch(arr, 50);
        System.out.println(ans2);

    }

    // index

    static int linearSearchIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }

    // true or false

    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
