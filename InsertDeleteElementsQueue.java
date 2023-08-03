// insert and delete elements in the queue , in  queue elements can be either inserted or deleted at the end of queue
public class InsertDeleteElementsQueue {
    private int front, rear, capacity;
    private int[] queue;

    public InsertDeleteElementsQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = 0;
    }

    public void Enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = item; // Insert element at the rear side
            rear++;
        }
    }

    public void Dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            int removedItem = queue[front];
            front++;
            System.out.println("Removed element: " + removedItem);
        }
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertDeleteElementsQueue q = new InsertDeleteElementsQueue(4);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.display();
        q.Dequeue();
        q.display();
    }
}




    

