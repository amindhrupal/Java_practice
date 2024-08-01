import java.util.*;

public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.addFirst("meow");
        list.addFirst("is");

        list.addLast("here!");
        System.out.println(list);

      
        list.removeFirst();
        System.out.println(list);

        list.addFirst("nooooooo");
        list.add("lalalaalal");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            if(list.get(i)=="meow"){
                System.out.println("the value is on "+i+ " index");
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        
    }
}
