package recursion.recursionadv;

public class placetiles {
    //place tiles of size 1m in a floor is size nm
        
    public static int placingTiles(int n,int m) {

        //base case 1
        if(n==m) {
            return 2;
        }

        //base case 2
        if(n<m) {
            return 1;
        }

        //vertically

        int verticalPlacements=placingTiles(n-m, m);

        //horizontally
        int horizontalPlacements=placingTiles(n-1, m);

        return verticalPlacements+horizontalPlacements;


    }

    public static void main(String[]args) {
        int n=4,m=2;

        int totalWays=placingTiles(n, m);
        System.out.println(totalWays);
    }

}
