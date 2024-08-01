package recursion;

public class towerofhanoi {

    public static void towerofhan(int n,String srs,String helper, String dest) {

        //base case
        if(n==1) {
            System.out.println("transfer disk "+ n+" from "+ srs+ " to "+dest);
            return;
        }


        towerofhan(n-1, srs, dest, helper);
        System.out.println("transfer disk "+ n+" from "+ srs+ " to "+dest);

        towerofhan(n-1, helper, srs, dest);
    }
    public static void main(String[]args) {
        int n=3;
        
        towerofhan(n, "S", "H", "D");
    }
}