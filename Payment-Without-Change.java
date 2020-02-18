
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
import java.util.TreeSet;

public class Solution{
        public static void main(String []args)throws IOException{
            Scanner jldi=new Scanner(System.in);
            int t=jldi.nextInt();
            //Reader in=new Reader();
            while(t-->0){
                    int a=jldi.nextInt();
                    int one=jldi.nextInt();
                    int aval=jldi.nextInt();
                    int totl=jldi.nextInt();
                    int sum=totl-one-aval*a;
                    
                       
                        int count=totl/aval;
                        count=Math.min(count, a);
                         int rem=totl-count*aval;
                         if(count<=a&&rem<=one)System.out.println("YES");
                         else System.out.println("NO");
                                            
                    }
                    
                    
            
            }
}
