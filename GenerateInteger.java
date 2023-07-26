import  java.util.Scanner ;
class GenerateInteger
{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n= sc.nextInt();
        System.out.println("enter value of m:");
        int m=sc.nextInt();
        System.out.println("integers divisible by m are:");
        
        
            for (int index =1;index <=n;index++)
            {
                if(index % m==0)
                {
                    System.out.println(index);
                }

            }
    
        
    }
}