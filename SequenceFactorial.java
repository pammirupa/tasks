public class SequenceFactorial{
    public static void main( String [] args)
    {
    int i=1;
     int n=5;
     float  sum=0;
    float factorial =1;
    
    for (i=1;i<=n;i++){
        factorial*= i ;// caluclate the factorial of i
        sum+= 1 / factorial;
        System.out.println("the sum is:"+sum);
}
    }
}