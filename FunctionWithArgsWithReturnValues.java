// program  to function with arguments and with return values
class FunctionWithArgsWithReturnValues {
     public static int sum( int a , int b)  // function declaration 
    { 
           int sum = a + b ;
        System.out.println(sum);
        return sum;
    }
public static void main(String  [] args){           //function call
     int num1 =9;
     int num2 = 8;
       int sum = sum( num1 , num2);
}


    
}
