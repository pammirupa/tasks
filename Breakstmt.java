// program to print break stmt
public class Breakstmt {
    public static void main(String [] args)
    {
        int i =1;
        int n =100;
        int sum =0;
        for( i =1; i<=n; i++){
            sum = sum + i;
            System.out.println("  i value is: " +i +" and sum is" + sum);
            if(i==50){
                System.err.println(sum);
                break;
            }
             

        }
    
        
    }
    
}
