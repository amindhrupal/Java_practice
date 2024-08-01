package recursion;

public class findoccurance {

    //find the first and last occurance of any element in a string

    public static int first=-1;
    public static int last=-1;

    //static variables, so values wont change in recursive function

    public static void occurance(String string,int index, char element) {
        if(index==string.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar=string.charAt(index);

        if(currentChar==element) {
            if(first==-1) {
                first=index;
            }
            else {
                last=index;
            }
        }
        occurance(string, index+1, element);

    }
    



    public static void main(String[]args) {
        String string="abdchajdad";

        occurance(string, 0, 'a');
    }

}
