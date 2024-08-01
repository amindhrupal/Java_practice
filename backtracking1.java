

public class backtracking1 {

    public static void printPermutations(String string, String permutation, int index) {
        if(string.length()==0) {
            System.out.print(permutation+" ");
            return;
        }

        for(int i=0;i<string.length();i++) {
            char currentChar=string.charAt(i);

            String newString= string.substring(0, i) + string.substring(i+1);

           

            printPermutations(newString, permutation+currentChar, index+1);


        }
    }
    public static void main(String args[]) {
        String string="abd";

        printPermutations(string, "", 0);
    }
}