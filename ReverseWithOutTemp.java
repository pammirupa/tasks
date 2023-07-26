import java.util.Scanner;
import java.util.arrays
class ReverseWithOutTemp{
public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println(x:"Enter the number of elements u want:");
    int num= input.nextInt();
    int[] arr= new int[num];
    for(int i=0;i<num;i++){
    arr[i]= input.nextInt;
    }
    System.out.println("original vector:"+arrays.Tostring(arr));
    int i=0;
    int j= arr.length-1;
    while(i<0)
    {
        arr[i]= arr[i]+arr[j];
        arr[j]= arr[i]- arr[j] ;
        arr[i] = arr[i]- arr[j];
        i++;
        j--;
      }
      System.out.println("reversed vector:"+ arrays.ToString(arr));
}
}