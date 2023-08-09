public class DeleteNodeFromSinglyLinkedList
{
    private  listnode head;
private static class listnode{                                      // create another class
    private  int data;
    private listnode next;
    public listnode(int data){                                       //create constructor hear
        this.data = data;
        this.next  = null;                                  

    }
}
public void  insertFirst(int value)         // create a method for  insert node at the begining
{
    listnode newNode = new listnode( value);
    newNode.next = head;
    head =newNode; 

}
public  listnode  deleteFirstNode(){
    if(head==null)
    {
        return null;
    }
    listnode temp = head;
    head= head.next;
    temp.next =null;
    return temp;
}
 public static void main(String[] args) {
    DeleteNodeFromSinglyLinkedList dn = new DeleteNodeFromSinglyLinkedList();
    dn. head = new listnode(10);
    listnode  second = new listnode(20);
    
    
}



}



    

