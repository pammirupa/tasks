 //program to find largest of three numbers
 import java.util. Scanner;
 public class LargestOfThreeNums {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num");
        int num1=sc.nextInt();
        System.out.println("enter second num");
        int num2 = sc.nextInt();
        System.out.println("enter third number");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3)
        { 
            System.out.println( num1  + "is largest num");
        }
        else if(num2>num3 && num2>num1)
        { 
            System.out.println(num2 +"is largest num");
        }
        else
        { System.out.println(num3 + "is largest num");
    }
    }

    
}
