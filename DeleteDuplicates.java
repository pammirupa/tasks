
// elements from Vector
import java.util.LinkedHashSet;
import java.util.Vector;
  
public class  DeleteDuplicates {
  
    public static void main(String[] args)
    {
  
        Vector<Integer> vector = new Vector<Integer>();
  
        vector.add(2);
        vector.add(2);
        vector.add(4);
        vector.add(2);
        vector.add(3);
        vector.add(2);
        vector.add(1);
  
        // display original elements
        System.out.println("Display original Vector - "
                           + vector);
  
        // convert Vector to a LinkedHashSet object.
        LinkedHashSet<Integer> hashSet
            = new LinkedHashSet<Integer>(vector);
  
        // clear all elements of vector
        vector.clear();
  
        // add all unique elements LinkedHashSet to the
        // vector
        vector.addAll(hashSet);
  
        // display vector after removing duplicate elements
        System.out.println(
            "After removing duplicate elements - "
            + vector);
    }
}
