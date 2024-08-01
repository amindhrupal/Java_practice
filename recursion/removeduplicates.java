package recursion;

public class removeduplicates {
          //remove duplicates in a string

          //create a map datatype[26] for each alphabet which stores FALSE at first and TRUE after adding to new string
          public static boolean[] map= new boolean[26];  // syntax to create a map

          public static void removing(String str, int index,String newString) {
            if(index==str.length()) {
                System.out.println(newString);
                return;
            }

            char currentChar=str.charAt(index);
            if(map[currentChar-'a']==true) {  //here in condition true is implied although its not written
                 removing(str,index+1,newString);
           }
            else {
                newString += currentChar;
                map[currentChar-'a']=true;
                removing(str, index+1, newString);
            }
          }


          public static void main(String[]args) {
            String str="abdccdaxixi";
            String newString="";
            removing(str, 0, newString);
            

          }
}
