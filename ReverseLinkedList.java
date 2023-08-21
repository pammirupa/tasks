public class ReverseLinkedList {
      static node head;
      static class node{
         int data;
         node next;
         node(int d)                                       // creates a constructor 
         {
            data =d;
            next = null;
         }                              
      }
         node reverse(node node)                        // reverse a linked list
         {
            node prev =null;
            node current = node;
            node next =null;
            while(current !=null)
            {
                next = current.next;
                current.next =prev;
                prev =current;
                current=next;

            }
            node = prev;
            return node;
         }
         void printList(node  node)                        // print list
         {
            while(node!=null)
            {

            System.out.println(node.data + " ");
            node = node.next;
            }

         }
         public static void main(String [] args)
         {
            ReverseLinkedList rl = new ReverseLinkedList();
            rl.head =  new node (85);
            rl.head.next = new node (15);
            rl.head.next.next= new node(4);
            rl.head.next.next.next = new node(20);
            System.out.println("linked list");
            rl.printList(head);
            head= rl. reverse(head);
            System.out.println(" ");
            System.out.println("reverseLinkedList");
            rl.printList(head);
        

         }



        }
    

