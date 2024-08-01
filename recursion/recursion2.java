package recursion;

public class recursion2 {
    //print sum of first n natural numbers
    
    public static void printSum(int a, int b, int sum) {
        if(a==b) {
            sum+=a;
            System.out.print(sum);
            return;
        }

      sum+=a;
     printSum(a+1, b, sum);


    }

    //main f(x) pass 1
    //base condition -> n.....print sum
    //kam-> to calculate sum
    public static void main(String[]args) {
            printSum(1, 5, 0);

    }
}
