public class findMinAndMax {
    public static void main(String[] args) {
        int[] arr = { 13, 51, 62, 26, 30 };
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }
}
