 //bubble sort ( comparision between  every two elements,if right element is highest then swap the element ) 
 import java.util.*;
class BubbleSort{
    public static void main(String [] args){
        int [] arr= {15,16,6,8,5};

        int i, j, temp;
        int n= arr.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
               if  ( arr[j] > arr[j+1]){
                temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               }
            }
        }              
        System.out.println("sorted array:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
