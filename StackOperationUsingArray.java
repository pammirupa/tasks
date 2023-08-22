 // program to  implement stack operation using array[push ,
public class StackOperationUsingArray {
    int top;
    int maxSize;
    int[] stackArray;

    public StackOperationUsingArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int data) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is overflow");
        } else {
            top = top + 1;
            stackArray[top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return -1;
        } else {
            int poppedData = stackArray[top];
            top = top - 1;
            return poppedData;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        StackOperationUsingArray st = new StackOperationUsingArray(5);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("Peek: " + st.peek());
        System.out.println("Pop: " + st.pop());
        System.out.println("Peek after pop: " + st.peek());
        System.out.println("Pop: " + st.pop());
    }
}

    

        
          
            

                
        
        
        

     


    

