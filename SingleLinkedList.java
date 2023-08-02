 // create single linkedlist
 public class SingleLinkedList{
    private ListNode head;
     private static class ListNode{
        int data;
        ListNode next;
        
        ListNode(int data){
            this.data=data;
            this.next= null;
        }
    }
    public   static void main(String [] args) 
    {
        SingleLinkedList ll= new SingleLinkedList();
        ll.head=new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth =new ListNode(11);
        ll.head.next = third;
        second.next= third;
        third.next=fourth;
        System.out.print("singlelinked list" );
        
        }
 }
 

 


