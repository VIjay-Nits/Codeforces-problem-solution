
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
        public static void main(String []args)throws IOException{
            Scanner jldi=new Scanner(System.in);
            int t=jldi.nextInt();
            //Reader in=new Reader();
            while(t-->0){
                int n=jldi.nextInt();
                int days=jldi.nextInt();
                int[]a=new int [n];
                for(int i=0;i<n;a[i++]=jldi.nextInt()){}
                yl:for(int i=1,di=1;i<n;){
                    if(a[i]>0){
                        if(i<=days){
                            a[0]++;
                            days=days-i;
                            a[i]--;
                        }
                        else break yl;
                        
                    }
                    else if(a[i]==0)i++;
                }
                System.out.println(a[0]);
                
                
            }
        }

}
