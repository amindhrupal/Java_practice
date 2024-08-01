package recursion;

public class printrevstring {
        //printing reverse of a string
        public static void reverse(String a,int index) {
            if(index==0) {

                System.out.print(a.charAt(index));
                return;
            }
            System.out.print(a.charAt(index));
            reverse(a, index-1);

        }
        
        public static void main(String[]args) {
            String a="abcd";
            reverse(a, a.length()-1);
            

        }
}
