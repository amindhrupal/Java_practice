import java.util.*;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 64, 2, 12 },
                { 86, 96 },
                { 60, 48, 77 }
        };
        int target = 77;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
