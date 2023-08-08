public class ReversePyramid {
    public static void main(String [] args)
    {
        int row =5;
        for(int i=0; i<row;i++){                                                  // outer for  loop
            for(int j=0; j<i; j++){
                System.out.println(" ");
            }
            for(int j=0;j<row-i;j++){
                System.out.println(" *");
            }

        }
    }
    
}
