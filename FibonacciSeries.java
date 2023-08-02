// fibonacci series program(0 1 1 2 3 5 8)
import java.util.Scanner;
class FibonacciSeries{
    public static void main(String args[]){
         int term, a=0, b=1 ,c;
         System.out.println("enter terms");
         Scanner r = new Scanner(System.in);
            term = r. nextInt();
           for( int i=1; i<=term;i++)
           {
            System.out.println(a + " ");
                c=a+b;
                a=b; // assign b value to a
                b=c; // assign c value to b
            
           }
       }
}


