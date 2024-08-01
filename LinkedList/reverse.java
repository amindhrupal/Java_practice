public class reverse {

    Node head;
    

     public class Node{
         int num;
         Node next;

         Node(int num){
           this.num=num;
           this.next=null;
         }
    }

    public void addFirst(int num){
        Node newNode=new Node(num);
        if(head==null){
         head=newNode;
         return;
        }

           newNode.next=head;
           head=newNode;
     }

     public void addLast(int num){
        Node newNode=new Node(num);
        if(head==null){
         head=newNode;
         return;
        }

        Node currNode=head;
        while(currNode.next!=null){
                currNode=currNode.next;
        }

        currNode.next=newNode;
     }

     public void printList(){
        if(head==null){
            System.out.println("list is empty");
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.num+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
     }

     public void reverseIterate(){
        if(head==null|| head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
     }
 
     public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;

       
     }

    public static void main(String[] args) {
        // reverse list=new reverse();

        // list.addFirst(3);
        // list.addFirst(2);
        // list.addFirst(1);
        // list.printList();

        // list.reverseIterate();
        // list.printList();

        reverse list2=new reverse();
        list2.addFirst(5);
        list2.addFirst(4);
        list2.addFirst(3);
        list2.addFirst(2);
        list2.addFirst(1);
        list2.printList();

        list2.head=list2.reverseRecursive(list2.head);
        list2.printList();

    }
}
