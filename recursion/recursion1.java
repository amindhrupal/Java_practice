package recursion;

public class recursion1 {

    //print 1 to 5 numbers

    public static void printNum(int n) {
        if(n==6) 
        return;

        System.out.print(n);
        printNum(n+1);
    }
    public static void main(String[]args) {
        int n=1; 

        printNum(n);  //n=1

    }
    
}
