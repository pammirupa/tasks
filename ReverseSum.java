// Importing Scanner Class
import java.util.Scanner;
 
class ReverseSum {

    public static void main(String[] args)
    {
        // creating variables
        int num, rem;
 
        // Creating variables and initializing at same time
        int rev = 0, sum = 0;
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: 453 ");
        // num = sc.nextInt();
        num = 453;
 
        // Do-while loop for iteration over digits of number
        do {
 
            // Step1: Modulo with 10 to get last digit
            rem = num % 10;
 
            // Step2: Reverse the number
            rev = rev * 10 + rem;
 
            // Sum of the digits of number
            sum = sum + rem;
 
            // Step3: Dividing number by 10 to lose last
            num = num / 10;}
        while (num > 0);
 
        // Printing the reverse number
        System.out.println("Reverse of given number: "
                           + rev);
 
        // Summing up digits of number as shown in above
        // steps
        System.out.println("Sum of digits of given number: "
                           + sum);
    }
}