
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
         int t=dede.nextInt();
         ll:while(t-->0){
             long n=dede.nextLong();
             long g=dede.nextLong();
             long b=dede.nextLong();
             
             long g_len=(n+1)/2;
             long loop=g_len/g;
             
             long min_day=0;
             
             if(loop*g==g_len){
                 min_day=loop*g+(loop-1)*b;
                 
             }
             else{
                 min_day=(g+b)*loop+g_len%g;
             }
             
             if(min_day<n)min_day=n;
             
             System.out.println(min_day);
             
             
         }
         }
}
