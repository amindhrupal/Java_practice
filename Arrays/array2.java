import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         //arraylist
        ArrayList<Integer> list=new ArrayList<>();
        //  list.add(20);
        //  list.add(20);
        //  list.add(20);
        //  list.add(20);
        //  list.add(20);
        //  System.out.println(list);
        //  list.set(2, 12);

        for(int i=0;i<5;i++){
           list.add(in.nextInt());
        }
        //input/get items
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        in.close();
        }
}
