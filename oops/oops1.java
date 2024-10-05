public class oops1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 19;

        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);

    }

    static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}