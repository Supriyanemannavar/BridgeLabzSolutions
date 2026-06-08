package DAY14;

public class LinkedList{
    static Node head;
   

    static class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }
        public static void append(Node value){

            if(head==null){
                head=value;
                return;
            }
            Node temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            
            temp.next=value;

        }

        public static void add(Node value){
            if(head==null){
                head=value;
                return;
            }
            Node temp=head;
            head=value;
            head.next=temp;
        }

        public static void insertBetween(Node value){
            if(head==null){
                head=null;
                return;
            }
            Node temp=head.next;
            head.next=value;
            value.next=temp;

        }

        public static void pop(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            int num=head.key;
            head=head.next;
            System.out.println("Deleted Item is: "+num);

        }
        public static void popLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;

            while(temp.next.next!=null){
                temp=temp.next;
            }
            int num=temp.next.key;
            temp.next=null;
            System.out.println(num);
        }
        
        public static void search(int key){
            Node temp=head;

            while(temp!=null){
                if(temp.key==key){
                    System.out.println("Element is present");
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Element is not present");

        }

        public static void addBetween(Node value1,Node value2){
               if(value1==null){
                head=value2;
                return;
               }

               Node temp=head;
               while(temp!=null){
                if(temp.key==value1.key){
                 Node temp1=temp.next;
                      temp.next=value2;
                      value2.next=temp1;
                      return;
                }
                temp=temp.next;

               }

        }
        public static void delete(Node value){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if(head.key == value.key) {
                head = head.next;
                 return;
            }

            Node temp=head;
            while(temp.next!=null){
                if(temp.next.key==value.key){
                         temp.next=temp.next.next;
                         return;
                }
                temp=temp.next;
            }
        }
        public static int size(){
            if(head==null){
                System.out.println("List is empty");
                return 0;
            }
            int i=0;
            Node temp=head;
            while(temp!=null){
                i++;
                temp=temp.next;

            }
            return i;
            
        }
        public static void sortedAdd() {
           if(head==null||head.next==null) {
              return;
            }
            Node current;
            Node index;

           for(current=head;current!=null;current=current.next) {
              for(index=current.next;index!=null;index=index.next) {

                  if(current.key>index.key) {

                   int temp=current.key;
                   current.key=index.key;
                   index.key=temp;
            }
        }
    }
}
        

        public static void main(String args[]){
           Node one=new Node(56);
           Node two=new Node(30);
           Node three=new Node(70);
           Node four=new Node(40);

            head=one;
            head.next=two;
            two.next=three;
          
            delete(one);
            
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
