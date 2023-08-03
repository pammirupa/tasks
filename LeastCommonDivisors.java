public class LeastCommonDivisors
{  
public static void main(String args[])   
{  
int a = 12, b = 9, gcd = 1;  
//finds GCD  
for(int i = 1; i <= a && i <= b; ++i)   
{  
//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
if(a % i == 0 && b % i == 0)  
//assigns i into gcd  
gcd = i;  
}  
// lcm of the given number  
int lcm = (a * b) / gcd;  
//prints the result  
System.out.println("The LCM of "+a +"and "+b+"is"+(a *b)/gcd);  
}  
}  