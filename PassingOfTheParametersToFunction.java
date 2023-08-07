 class PassingOfTheParametersToFunction {
     public static  int sum( int a , int b)
     {
         int sum =0;
         sum = a + b;
         System .out.println(sum);
          return sum;

     }
     public static void main( String []  args)
     {
        int a=5;
        int b=6;
      int c=  sum(a,b);


     }
    
}
