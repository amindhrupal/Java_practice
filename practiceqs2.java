public class practiceqs2 {
    public static void main(String[] args) {
        int[] arr={'A','B','C','D','E','F'};

        int n=5;
        int iterate=arr[0];
        for(int i=1;i<=n;i++){
            for(int j=5;j>=1;j--){
                System.out.print(arr[iterate]+" ");
                
            }
            iterate++;
            System.out.println();
        }
    }
}
