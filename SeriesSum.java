public class SeriesSum{

    public static void main(String[] args) {

        int i =1;
         // Number of terms in the series
        float sum=0;
        for(i=1;i<=4;i++){
            if(i%2==1){
                sum= sum+1/(float)i;
            }
            else{
                 sum= sum-1/(float)i;
            }
        }
        System.out.println("sum is:"+ sum);
    }
}
        

        
    

