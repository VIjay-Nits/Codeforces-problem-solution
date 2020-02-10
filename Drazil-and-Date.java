
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution{
    public static void
         main(String [] args)throws IOException{
             
         Scanner dede=new Scanner(System.in);
         //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          long a=Math.abs(dede.nextInt())+Math.abs(dede.nextInt());
          long s=dede.nextInt()-a;
          if(s>=0&&s%2==0){System.out.println("Yes");return;}
          
          System.out.println("No");
          
         
         }
          
         
         
         
}
