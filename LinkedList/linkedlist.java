class linkedlist{
    Node head;
    private int size;

    linkedlist(){
        this.size=0;
    }
    
 

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    //add first 

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
        
    }

    //add last

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next !=null){
              currentNode=currentNode.next;
        }

        currentNode.next=newNode;
    }

    //delete
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        head=head.next;
        
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;

        while(lastNode.next!=null){
          lastNode=lastNode.next;
          secondLast=secondLast.next;
        
        }

        secondLast.next=null;
    }
    //print

    public void printList(){

        if(head==null){
            System.out.println("list is empty");
        }
        Node currentNode=head;
        while(currentNode !=null){
              System.out.print(currentNode.data+" -> ");
              currentNode=currentNode.next;
        }
        System.out.println("NULL");
    }


    //size

    public int getSize(){
        return size;
    }
    
    public static void main(String[]args){
       linkedlist list=new linkedlist();
       list.addFirst("you");
       list.addFirst("have");

       list.printList();    

       list.addLast("eaten?");
       list.printList();

       list.addFirst("aye");
       list.printList();

       list.deleteFirst();
       list.printList();

       list.deleteLast();
       list.printList();
       System.out.println(list.getSize());

     }
}