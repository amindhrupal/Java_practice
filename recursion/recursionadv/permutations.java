package recursion.recursionadv;

public class permutations {
    //print all permutations of string. "permutations"= all possible combinations of letters
    public static void printPermutation(String str, int index, String permutation) {
        

            if(str.length()==0) {
                System.out.println(permutation);
                return;
            }

            for(int i=0;i<str.length();i++) {
                char currentChar=str.charAt(i);
                 //"abc"->"ab"
                 String newStr=str.substring(0, i) + str.substring(i+1);

                  printPermutation(newStr, index, permutation+currentChar);

                
            }
        }

    

    public static void main(String[]args) {
        String str="abc";
        printPermutation(str,0, "");

    }
    
}
