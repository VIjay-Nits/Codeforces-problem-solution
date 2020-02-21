
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Solution{
       
	public static void main(String[] args) {
		Scanner sdf = new Scanner(System.in);
		
                int t=1;
                while(t-->0){
                    int n=sdf.nextInt();
                    int[]a=new int[n];
                    for(int i=0;i<n;a[i++]=sdf.nextInt()){}
                    int count=a[0];
                    
                    
                    for(int i=1;i<n;i++){
                        count=Solution.gcd(count,a[i]);
                        
                        
                       
                    }
                    System.out.println(n*count);
                    
                    
                    
                    
                    
                    
                }
               
        }
          static int gcd(int a,int b){
                    if(a==0)
                        return b;
                    return Solution.gcd(b%a,a);
                }
         
         
         
         

}
