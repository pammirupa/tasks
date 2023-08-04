 class FunctionWithArgsNoReturnValues{
  public static void sum( int a , int b)    // formal arguments
  {   
             int  sum = a + b;
            System.out.println( sum );
        }
    
        public static void main(String args[]) {
            int num1 =5;        // actual argument for int a
            int num2 =6;        // actual argument for int b
            sum (num1 , num2);
        }
    }
    
