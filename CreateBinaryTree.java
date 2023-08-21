// program to create binary tree
public class CreateBinaryTree { 
    static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){                        //constructor
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
    public void insert(Node node, int value) {
        if (value < node.value)
         { 
            if (node.left != null) 
            {
                 insert(node.left, value);
                 } 
                 else
                  {
                     System.out.println(" Inserted " + value + " to left of " + node.value); 
                     node.left = new Node(value);
                     }
                     }
        else if (value > node.value) {                          // value is higher than root value then inserted to right side
                            if (node.right != null) {
                             insert(node.right, value);
                              } else {
                             System.out.println("  Inserted " + value + " to right of " + node.value);
                                                                      
                                 node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {       // inordertraverse is a method to visit all nodes in a specific order
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
     public static void main(String args[]) 
    { 
    CreateBinaryTree tree = new CreateBinaryTree();
                Node root = new Node(5);
                System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
            
                
                
              }
}