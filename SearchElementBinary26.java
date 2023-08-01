import java.util.*;
class SearchElementBinary26{
    public static void main(String [] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
       int  key=6;
       boolean flag= false ;
       int l=0;
      int h=a.length-1;
      int mid=0;
       while(l<=h){
        mid= (l+h)/2;
        if(a[mid]== key)// check the first condition (mid value, key value should be same)
        {
            System.out.println("element found");
            flag=true;
            break;
        }
        if(a[mid]<key) // check the second condition
         {
             l= mid+1;
        }
        if(a[mid]>key) // check the third condition
        {
            h= mid-1;
        }    
        }
        if(!flag ) {
            System.out.println("element not found");
        }
    }
       
}
        


       


    
