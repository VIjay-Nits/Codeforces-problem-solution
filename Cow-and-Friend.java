
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
                    int n=jldi.nextInt();
                    
                    int hops=jldi.nextInt();
                    //int[]a=new int[n];
                    TreeSet<Integer> tr=new TreeSet<>();
                    int count=0;
                    boolean flag=true;
                    for(int i=0;i<n;i++){int j=jldi.nextInt();tr.add(j);if(hops%j==0&&hops/j==1){count=1;flag=false;}}
                    //new MySort().mergeSort(a, 0, n-1);
                    
                            if(flag){
                                
                            
                            int temp=tr.last();
                             count=hops/temp;
                           
                           if(hops%temp==0){
                               System.out.println(count);
                           }else {
                               if(count==0)System.out.println("2");
                               else System.out.println(count+1);
                           }
                            }
                            else System.out.println(count);
                            
                    }
                    
                    
            
            }
        
}
