package DAY14;

public class Queue {
    static Node head;
    static class Node{
        int key;
        Node next;

        public Node(int key){
            this.key=key;
            this.next=null;
        }
    }

    public static void enqueue(Node val){
        if(head==null){
          head=val;
          return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=val;
    }
    public static void dequeue(){
        if(head==null){
            System.out.println("Queue is empty");
            return;
        }
        int num=head.key;
        head=head.next;
        System.out.println("The removed element is: "+num);

    }
    public static void  main(String args[]){
        Node one=new Node(56);
        Node two=new Node(30);
        Node three=new Node(70);

        enqueue(one);
        enqueue(two);
        enqueue(three);
        dequeue();
         Node temp=head;

            while(temp!=null){
                if(temp.next==null){
                    System.out.print(temp.key);
                }
                else{
                System.out.print(temp.key+"->");
                }
                temp=temp.next;
            }

        
    }
    
}
