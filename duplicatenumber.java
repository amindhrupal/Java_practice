import java.util.*;


class duplicatenumber {

    public static int duplicate(int[] numberss) {
        int n = numberss.length;
        Arrays.sort(numberss);
        for (int i = 0; i < n - 1; i++) {
            if (numberss[i] == numberss[i + 1]) {
                return numberss[i];
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int numberss[] = {1,3,4,5,4};
        System.out.println("The duplicate element is " + duplicate(numberss));
    }
}