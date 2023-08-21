public class QueueOperationUsingArray {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;
    public QueueOperationUsingArray(int size)                      // create constructor
    {
        this.maxSize =size;
        this.queueArray= new int[size];
        front =0;
        rear=-1;
        currentSize = 0;
    }

    public void insert (int item){
        if (rear ==maxSize-1)
        {
            rear =-1;     //initially  size is-1, bcz no elements are inserted initially
        }
        queueArray[++rear] =item;
        currentSize++;
        System.out.println("item added to queue"+ item);
    }
    public int delete( )              // delete item from queue
    {
        int deleteditem =queueArray[front];
        front ++;
        if(front == maxSize)
        {
            front =0;                           // starting with size 0;
        }
        currentSize --;
        return deleteditem;
        
        
    }
    public int peek()
    {
        return queueArray[front]  ;          //in queue peek is front element bcz insertion and deletion are done at the front size
    }
    public static void main(String [] args)
    {
        QueueOperationUsingArray qa = new QueueOperationUsingArray(10);
        
            qa.insert(2);
            qa.insert(3);
            System.out.println("item deleted from queue" + qa.delete());
            qa.insert(5);
            System.out.println("item deleted from queue"+qa.delete());

        }
    }
        
    

    

