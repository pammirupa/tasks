import java.util.*;
import java.util.Scanner;
class SearchElementVector24{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(" enter the  no.of values you want from array:");
        int[] array= new int [n];
        System.out. println("enter the values in the array");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
           int value= 50;
          boolean found;
        for(int i=0;i< array.length;i++){
            if(array[i]==50){
                System.out.println("element is found");
            }
            else{
                System.out.println(" element is not found");
            }
        }


    }
}