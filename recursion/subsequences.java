package recursion;

public class subsequences {
    //print all thes subsequences of the string
    public static void subsquence(String str,int index, String newString) {
        if(index==str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar=str.charAt(index);
        // to be
        
        subsquence(str, index+1, newString+currentChar);


        // to not be
        subsquence(str, index+1, newString);

    }

    //important

    public static void main(String[]args) {
        String str="aaa";
        String newString="";
        
        subsquence(str, 0, newString);
    }
}
