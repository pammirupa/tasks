// palindrome or not[ when we reversed number  then we get same number eg:121= 121 is palindrome,123= 321 is not palindrome]
import java.util.Scanner;
class palindromeOrNot
{
public static void main(String [] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a number");
  int num= sc.nextInt();
  int orgnum = num;
  int rev =0;
  while(num!=0)
  {
    rev = rev * 10 + num % 10;
    num =num/10; 
  }
  if(orgnum == rev)
  {
    System.out.println("palindrome number" + orgnum);
  }
  else
  {
    System.out.println("not a palindrome number");
  }
}
}