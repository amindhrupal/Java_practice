package recursion;

public class keypadcombos {
    //keypad combinations ., abc, def, ghi, jkl, mno,pqrs,tu,vwx,yz
    
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str, int index, String combination) {
        if(index==str.length()) {
            System.out.print(combination+ " ");
            return;
        }
        char currentChar=str.charAt(index);

        String mapping= keypad[currentChar-'0'];

        for(int i=0;i<mapping.length();i++) {
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[]args) {
        String str="4";
        printCombination(str, 0, "");
    }
    
}
