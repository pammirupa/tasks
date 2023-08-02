import java.util.Scanner;
class  FactorialOfANumber
{
    public static void main(String [] args)
    {
        int n, fact=1;
        System.out.print("enter any number");
        Scanner r =new Scanner(System.in);
        n = r.nextInt();
        for( int i=1;i<=5;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial"+ fact);
    }
}
