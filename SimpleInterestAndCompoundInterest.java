 // simplee interest (ptr/100)   and compound interest
 import java.util.Scanner;

class SimpleInterestAndCompoundInterest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();
    System.out.print("Enter number of times interest is compounded: ");
    int number = input.nextInt();

    double interests = (principal * time * rate) / 100; // simple interest (ptr/100)
    
    double interestc  = principal * (Math.pow((1 + rate/100), (time * number))) - principal ;// compound interest

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + interests );
     System.out.println("compound Interest: " + interestc );
  }
}

    
