//generate lcm and gcd 
import java.util.Scanner;
class LcmAndGcd{
    public static void main(String [] args)
    {
        int n1, n2;
       int  lcm;
       int gcd;
        int rem;
        Scanner r= new Scanner(System.in); 
        n1= r.nextInt();
        System.out.println("enter n1");
        n2= r.nextInt();
        System.out.println("enter n2");
        int tn1=n1 , tn2= n2;
        while(n1 % n2 !=0){
            rem = n1 % n2 ;  // EG: 48,36 [48 is n1,36 is n2]
             n1= n2; // first  n2 value is ASSIGNED TO N1                         // gcd
             n2=rem;   //when divide 48 with 36  then rem value assigned to n2
             }
          lcm= (tn1 * tn2) / n2;
          System.out.print( "GCD" + n2) ;
         System.out.print("LCM:"+ lcm);
    } 
}        

        



