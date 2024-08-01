import java.util.*;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 136;
        arr[2] = 1545;
        arr[3] = 145;
        arr[4] = 54;

        // System.out.println(arr[3]);

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
