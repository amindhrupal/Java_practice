package recursion;

import java.util.HashSet;

public class uniquesubseq {
    //print all the unique subsequences meaning not to print repeated one's

    //using hashsets. they are like sets which were in maths that used to include all the elements that are unique

    // java has hashsets
    public static void uniqueSubsequence(String str, String newString, int index,HashSet<String> set) {
        if(index==str.length()) {
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar= str.charAt(index);
        

        uniqueSubsequence(str, newString+currentChar, index+1, set);
        uniqueSubsequence(str, newString, index+1,set);
    }
    public static void main(String[]args) {
        String str="aaa";
        String newString="";
        HashSet<String> set= new HashSet<>();

        uniqueSubsequence(str, newString, 0,set);
    }
    
}
