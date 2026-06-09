package DAY14;

public class Stack {
    static  Node head;
    static class Node{
        int key;
        Node next;

        public Node(int key){
             this.key=key;
             this.next=null;
        }

    }

    public static void push(Node value){
       if(head==null){
          head=value;
          return;
       }
       value.next=head;
       head=value;
    }
    public static void  pop(){
        if(head==null){
            System.out.println("Stack is Empty");
            return;
        }

        if(head.next==null){
            int num=head.key;
            head=null;
            System.out.println("The element is removed: "+num);
            return;
        }
        
        int num=head.key;
        head=head.next;
        System.out.println(num);
    }

    public static void peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(head.key);
    }

     public static void main(String args[]){
        Node node1=new Node(70);
        Node node2=new Node(30);
        Node node3=new Node(56);
        
        push(node1);
        push(node2);
        push(node3);

        pop();

        Node temp=head;

            while(temp!=null){
                if(temp.next==null){
                    System.out.print(temp.key);
                }
                else{
                System.out.print(temp.key+"<-");
                }
                temp=temp.next;
            }

     }
    
}
