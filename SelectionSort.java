import java.util.*;
 class SelectionSort{
    public static void main( String [] args){
        int[] arr={7,4,10,8,3,1};
        int  i,j, temp;
        int n= arr.length;
        for(  i=0;i<n;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                
            }
            if(min!=i)
            {
                //swap (arr[i],arr[min]);
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
            }
        System.out.print( arr[i]+" ");
        }
    }
 }       


    
 