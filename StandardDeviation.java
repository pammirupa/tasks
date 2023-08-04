 // program to find standard deviation(process: create list,find average,) 
 import java.util.*;
 class StandardDeviation {
    public static void main(String [] args)
    {
    List <Double> numbers =  new ArrayList<Double>();        //1. list creation 
    numbers.add(21.0);
    numbers.add(22.0);
    numbers.add(23.0);
    numbers.add(24.0);
    numbers. add(25.0);
    System.out. println("\n" + numbers);
    double sum =0;
    for( double number : numbers)
    {
        sum = sum +  number;
    }
    double average = sum  / numbers.size();                        // 2. to find average
    System.out.println( "\f" + average) ;       
    List <Double>  listofdifference = new ArrayList<Double>();                     // 3. difference between each number and average
     for( double number : numbers){
        double difference = number - average ;
        listofdifference.add(difference);
        System.out.println(" " + difference);
     }
     
     List<Double>  squares = new ArrayList<Double>();  
     for (double difference : listofdifference){ // 4. find squares and add them to the 'squares' list
       double square = difference*difference;                    
     squares.add(square);
     System.out.println(" " + square);
    }
    
    for ( double number : squares)      //  5.sum of squares caluclated  above
    {
    sum = sum + number ;
    System.out.println(sum);
    }
     double result =  sum / (numbers.size()-1);  // divide  sum of square by total( numbers)-1
     System.out.println(" " + result);
     double  standardDeviation = Math.sqrt(result);
     System.out.println(" " + standardDeviation);
}
 }


    
    

