
public class reversed_string {

    public static void main(String[] args) {
        int count = 0;
        String s1 = "abconeistba";

        StringBuilder s2 = new StringBuilder();
        s2.append(s1);
        s2.reverse();
        System.out.println(s2);
        System.out.println(s1);
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s1.charAt(n - i - 1)) {
                count++;
            }
        }

        System.out.println(count);
        System.out.println(n);

    }
}
