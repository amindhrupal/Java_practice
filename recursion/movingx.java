package recursion;

public class movingx {
    public static void movingAllXs(String str, int count, int index, String newString) {

        //base case
        if(index==str.length()) {
            for(int i=0;i<count;i++) {
              newString += 'x';
            }
            System.out.println(newString);
            return;
        }

      char currentChar=str.charAt(index);

      if(currentChar=='x') {
        count++;
        movingAllXs(str, count, index+1, newString);
      } else {
        newString += currentChar;  //new string= new string+current char
        movingAllXs(str, count, index+1, newString);
      }
        
    }

    public static void main(String[]args) {
        String str="axbcxxddej";
        String newString="";

        movingAllXs(str, 0, 0, newString);


    }
    
}
