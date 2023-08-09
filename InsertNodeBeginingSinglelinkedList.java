public class InsertNodeBeginingSinglelinkedList {
     public   listNode head;
       public  static class listNode{                                       // node class
        public  int data;
        public  listNode next;
      public listNode(int data) // parameterized constructor
        {
            this.data =data;
            this.next =null;
        }
    }
    public void display()
    {
        listNode current =head;
        while(current!= null)
        {
            System.out.println(current.data + " ->");
            current = current.next;
        }
    }
    public void  insertFirst(int value)         // create a method for  insert node at the begining
    {
        listNode newNode = new listNode( value);
        newNode.next = head;
        head =newNode; 

    }
    public  static void main(String [] args)
    {
      InsertNodeBeginingSinglelinkedList is = new InsertNodeBeginingSinglelinkedList ();
        is.head = new listNode(10);
        listNode second = new listNode(20);
        listNode third = new listNode(30);
        is.display();
        


    }


    }

    

