
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
                    int count=1;
                    Arrays.sort(a);
                    for(int i=0;i<n-1;i++){
                        if(a[i]==a[i+1])count++;
                        else count=1;
                        
                        if(count>(n+1)/2){System.out.println("NO");return;}
                    }
                    System.out.println("YES");
                    
                    
                    
                    
                    
                }
        }
         
         
}
