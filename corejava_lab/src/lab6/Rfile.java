package lab6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Rfile {
	 public static void main(String args[])throws IOException
     {
                 int j=1;
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter File location ");
                 String str=sc.next();
                 FileInputStream f=new FileInputStream(str);
                 System.out.println("Contents of the file are");
                 int n=f.available();
                 System.out.print(j+". ");
                 for(int i=0;i<n;i++)
                 {
                             char ch=(char)f.read();
                             System.out.print(ch);
                             if(ch=='\n')
                             {
                                         System.out.print(++j+" ");
                                        
                             }
                                        
                 }
     }
}
