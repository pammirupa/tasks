package files; // program to merge two files by using io approach or nio approach we open target file in append format
import java.util.Scanner;
import java.io.File;
import java . io.FileInputStream;
import java.io.FileOutputStream;
import java. io.IOException;
public class MergeTwoFiles {
    public static void   merge(String SourceFileName , String  TargetFileName ){
        try{
            File SourceFile = new  File(SourceFileName);
            if(SourceFile . exists()){
                System.out.println("SourceFile exists");
                FileInputStream fin =new FileInputStream(SourceFile);// to read the contents from input
                FileOutputStream fout = new  FileOutputStream(  new File(TargetFileName));
                fout.write(fin.readAllBytes());
                fin.close();

            }
            else{
                System.out.println( "SourceFile  does not exists");
            }

        } 
        catch(IOException io)
        {
           io.printStackTrace();
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out. println("enter source file name");
        String SourceFileName = sc. next();
        System.out.println("enter target file name ");
        String TargetFileName = sc.next();
        merge(SourceFileName, TargetFileName);
    }
    
}
